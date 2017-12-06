/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.azurespecials.ErrorException;
import java.io.IOException;
import rx.Observable;
import rx.Single;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined in
 * XMsClientRequestIds.
 */
public class XMsClientRequestIdsInner {
    /** The RestProxy service to perform REST calls. */
    private XMsClientRequestIdsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of XMsClientRequestIdsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public XMsClientRequestIdsInner(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(XMsClientRequestIdsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for XMsClientRequestIds to be
     * used by RestProxy to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface XMsClientRequestIdsService {
        @Headers({ "x-ms-logging-context: fixtures.azurespecials.XMsClientRequestIds get" })
        @GET("azurespecials/overwrite/x-ms-client-request-id/method/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<RestResponse<Void, Void>> get(@HeaderParam("accept-language") String acceptLanguage);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.XMsClientRequestIds paramGet" })
        @GET("azurespecials/overwrite/x-ms-client-request-id/via-param/method/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> paramGet(@HeaderParam("x-ms-client-request-id") String xMsClientRequestId, @HeaderParam("accept-language") String acceptLanguage);

    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void get() {
        getAsync().toBlocking().value();
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getAsync(), serviceCallback);
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> getWithRestResponseAsync() {
        return service.get(this.client.acceptLanguage());
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> getAsync() {
        return getWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Void>, Void>() { public Void call(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void paramGet(String xMsClientRequestId) {
        paramGetAsync(xMsClientRequestId).toBlocking().value();
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> paramGetAsync(String xMsClientRequestId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(paramGetAsync(xMsClientRequestId), serviceCallback);
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> paramGetWithRestResponseAsync(String xMsClientRequestId) {
        if (xMsClientRequestId == null) {
            throw new IllegalArgumentException("Parameter xMsClientRequestId is required and cannot be null.");
        }
        return service.paramGet(xMsClientRequestId, this.client.acceptLanguage());
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> paramGetAsync(String xMsClientRequestId) {
        return paramGetWithRestResponseAsync(xMsClientRequestId)
            .map(new Func1<RestResponse<Void, Void>, Void>() { public Void call(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


}
