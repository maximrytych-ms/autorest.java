// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.model.clientmodel.fluentmodel.method;

import com.azure.autorest.extension.base.model.codemodel.RequestParameterLocation;
import com.azure.autorest.fluent.model.clientmodel.FluentCollectionMethod;
import com.azure.autorest.fluent.model.clientmodel.FluentManagerProperty;
import com.azure.autorest.fluent.model.clientmodel.FluentResourceCollection;
import com.azure.autorest.fluent.model.clientmodel.FluentResourceModel;
import com.azure.autorest.fluent.model.clientmodel.FluentStatic;
import com.azure.autorest.fluent.model.clientmodel.ModelNaming;
import com.azure.autorest.fluent.model.clientmodel.fluentmodel.ResourceLocalVariables;
import com.azure.autorest.fluent.util.FluentUtils;
import com.azure.autorest.model.clientmodel.ClientMethod;
import com.azure.autorest.model.clientmodel.ClientMethodParameter;
import com.azure.autorest.model.clientmodel.IType;
import com.azure.autorest.model.clientmodel.PrimitiveType;
import com.azure.autorest.model.clientmodel.ReturnValue;
import com.azure.autorest.model.javamodel.JavaJavadocComment;
import com.azure.autorest.template.ClientMethodTemplate;
import com.azure.autorest.template.prototype.MethodTemplate;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Resource action method.
 *
 * E.g. start, stop, regenerateKey, listAccountSas etc.
 */
public class FluentActionMethod extends FluentMethod {

    private final FluentCollectionMethod collectionMethod;
    private final ClientMethod dummyClientMethodForJavadoc;

    public FluentActionMethod(FluentResourceModel model, FluentMethodType type,
                              FluentResourceCollection collection, FluentCollectionMethod collectionMethod,
                              ResourceLocalVariables resourceLocalVariablesDefinedInClass) {
        super(model, type);

        this.collectionMethod = collectionMethod;
        this.name = collectionMethod.getMethodName();
        this.description = collectionMethod.getDescription();

        IType returnType = collectionMethod.getFluentReturnType();
        boolean returnTypeIsVoid = returnType == PrimitiveType.Void;
        ReturnValue returnValue = new ReturnValue(returnTypeIsVoid ? "" : collectionMethod.getInnerClientMethod().getReturnValue().getDescription(), returnType);
        this.interfaceReturnValue = returnValue;
        this.implementationReturnValue = interfaceReturnValue;

        // remove path parameters from input parameter, as they are provided by the variables of resource model
        ClientMethod method = collectionMethod.getInnerClientMethod();
        List<ClientMethodParameter> parameters = method.getMethodInputParameters();
        ResourceLocalVariables resourceLocalVariables = new ResourceLocalVariables(collectionMethod.getInnerClientMethod());
        parameters.removeAll(resourceLocalVariables.getLocalVariablesMap().entrySet().stream()
                .filter(e -> e.getValue().getParameterLocation() == RequestParameterLocation.PATH)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()));
        this.parameters = parameters;

        // a dummy client method only for generating javadoc
        this.dummyClientMethodForJavadoc = new ClientMethod.Builder()
                .proxyMethod(collectionMethod.getInnerProxyMethod())
                .name(name)
                .returnValue(returnValue)
                .parameters(parameters)
                .description(collectionMethod.getInnerClientMethod().getDescription())
                .build();

        // resource collection from manager
        String collectionGetMethod = FluentStatic.getFluentManager().getProperties().stream()
                .filter(p -> p.getFluentType().getName().equals(collection.getInterfaceType().getName()))
                .map(FluentManagerProperty::getMethodName)
                .findFirst().get();

        // method invocation
        Set<ClientMethodParameter> parametersSet = new HashSet<>(parameters);
        List<ClientMethodParameter> methodParameters = method.getMethodInputParameters();
        String argumentsLine = methodParameters.stream()
                .map(p -> FluentUtils.getLocalMethodArgument(p, parametersSet, resourceLocalVariables, model, collectionMethod, resourceLocalVariablesDefinedInClass))
                .collect(Collectors.joining(", "));
        String methodInvocation = String.format("%1$s(%2$s)", collectionMethod.getMethodName(), argumentsLine);

        this.implementationMethodTemplate = MethodTemplate.builder()
                .methodSignature(this.getImplementationMethodSignature())
                .method(block -> {
                    String invocation = String.format("%1$s.%2$s().%3$s",
                            ModelNaming.MODEL_PROPERTY_MANAGER,
                            collectionGetMethod,
                            methodInvocation);
                    if (returnTypeIsVoid) {
                        block.line(invocation + ";");
                    } else {
                        block.methodReturn(invocation);
                    }
                })
                .build();
    }

    @Override
    protected String getBaseMethodSignature() {
        String parameterDeclaration = parameters.stream().map(ClientMethodParameter::getDeclaration).collect(Collectors.joining(", "));
        return String.format("%1$s(%2$s)", name, parameterDeclaration);
    }

    @Override
    public void writeJavadoc(JavaJavadocComment commentBlock) {
        ClientMethodTemplate.generateJavadoc(dummyClientMethodForJavadoc, commentBlock, dummyClientMethodForJavadoc.getProxyMethod(), true);
    }

    @Override
    public void addImportsTo(Set<String> imports, boolean includeImplementationImports) {
        collectionMethod.addImportsTo(imports, includeImplementationImports);
    }
}
