// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.basicpolymorphicmodels.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Example base class that has a discriminator property. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "discriminatorProperty",
        defaultImpl = BaseClassWithDiscriminator.class)
@JsonTypeName("BaseClassWithDiscriminator")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A", value = DerivedFromBaseClassWithDiscriminatorA.class),
    @JsonSubTypes.Type(name = "B", value = DerivedFromBaseClassWithDiscriminatorB.class)
})
@Fluent
public class BaseClassWithDiscriminator extends BaseClass {
    /**
     * Creates an instance of BaseClassWithDiscriminator class.
     *
     * @param baseClassProperty the baseClassProperty value to set.
     */
    @JsonCreator
    public BaseClassWithDiscriminator(
            @JsonProperty(value = "baseClassProperty", required = true) String baseClassProperty) {
        super(baseClassProperty);
    }
}