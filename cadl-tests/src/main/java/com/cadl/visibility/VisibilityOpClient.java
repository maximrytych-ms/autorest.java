// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.visibility;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.cadl.visibility.models.Dog;
import com.cadl.visibility.models.ReadDog;
import com.cadl.visibility.models.WriteDog;

/** Initializes a new instance of the synchronous VisibilityClient type. */
@ServiceClient(builder = VisibilityOpClientBuilder.class)
public final class VisibilityOpClient {
    @Generated private final VisibilityOpAsyncClient client;

    /**
     * Initializes an instance of VisibilityOpClient class.
     *
     * @param client the async client.
     */
    @Generated
    VisibilityOpClient(VisibilityOpAsyncClient client) {
        this.client = client;
    }

    /**
     * The get operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: long (Required)
     *     secretName: String (Required)
     *     name: String (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(RequestOptions requestOptions) {
        return this.client.getWithResponse(requestOptions).block();
    }

    /**
     * The create operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     secretName: String (Required)
     *     name: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: long (Required)
     *     secretName: String (Required)
     *     name: String (Required)
     * }
     * }</pre>
     *
     * @param dog The dog parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createWithResponse(BinaryData dog, RequestOptions requestOptions) {
        return this.client.createWithResponse(dog, requestOptions).block();
    }

    /**
     * The query operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: long (Required)
     *     name: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: long (Required)
     *     secretName: String (Required)
     *     name: String (Required)
     * }
     * }</pre>
     *
     * @param dog The dog parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> queryWithResponse(BinaryData dog, RequestOptions requestOptions) {
        return this.client.queryWithResponse(dog, requestOptions).block();
    }

    /*
     * Generated convenience method for getWithResponse
     */
    /**
     * The get operation.
     *
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Dog get() {
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(requestOptions).getValue().toObject(Dog.class);
    }

    /*
     * Generated convenience method for getWithResponse
     */
    /**
     * The get operation.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Dog> getWithResponse(Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        Response<BinaryData> protocolMethodResponse = getWithResponse(requestOptions);
        return new SimpleResponse<>(protocolMethodResponse, protocolMethodResponse.getValue().toObject(Dog.class));
    }

    /*
     * Generated convenience method for createWithResponse
     */
    /**
     * The create operation.
     *
     * @param dog The dog parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Dog create(WriteDog dog) {
        RequestOptions requestOptions = new RequestOptions();
        return createWithResponse(BinaryData.fromObject(dog), requestOptions).getValue().toObject(Dog.class);
    }

    /*
     * Generated convenience method for createWithResponse
     */
    /**
     * The create operation.
     *
     * @param dog The dog parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Dog> createWithResponse(WriteDog dog, Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        Response<BinaryData> protocolMethodResponse = createWithResponse(BinaryData.fromObject(dog), requestOptions);
        return new SimpleResponse<>(protocolMethodResponse, protocolMethodResponse.getValue().toObject(Dog.class));
    }

    /*
     * Generated convenience method for queryWithResponse
     */
    /**
     * The query operation.
     *
     * @param dog The dog parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Dog query(ReadDog dog) {
        RequestOptions requestOptions = new RequestOptions();
        return queryWithResponse(BinaryData.fromObject(dog), requestOptions).getValue().toObject(Dog.class);
    }

    /*
     * Generated convenience method for queryWithResponse
     */
    /**
     * The query operation.
     *
     * @param dog The dog parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Dog> queryWithResponse(ReadDog dog, Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        Response<BinaryData> protocolMethodResponse = queryWithResponse(BinaryData.fromObject(dog), requestOptions);
        return new SimpleResponse<>(protocolMethodResponse, protocolMethodResponse.getValue().toObject(Dog.class));
    }
}