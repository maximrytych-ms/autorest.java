/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.bodyduration.Durations;
import fixtures.bodyduration.models.ErrorException;
import java.io.IOException;
import org.joda.time.Period;
import rx.Observable;
import rx.Single;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined in
 * Durations.
 */
public class DurationsImpl implements Durations {
    /**
     * The RestProxy service to perform REST calls.
     */
    private DurationsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestDurationTestServiceImpl client;

    /**
     * Initializes an instance of Durations.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DurationsImpl(AutoRestDurationTestServiceImpl client) {
        this.service = RestProxy.create(DurationsService.class, client.httpPipeline(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Durations to be used by
     * RestProxy to perform REST calls.
     */
    @Host("https://localhost")
    interface DurationsService {
        @Headers({ "x-ms-logging-context: fixtures.bodyduration.Durations getNull" })
        @GET("duration/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Period>> getNull();

        @Headers({ "x-ms-logging-context: fixtures.bodyduration.Durations putPositiveDuration" })
        @PUT("duration/positiveduration")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putPositiveDuration(@BodyParam("application/json; charset=utf-8") Period durationBody);

        @Headers({ "x-ms-logging-context: fixtures.bodyduration.Durations getPositiveDuration" })
        @GET("duration/positiveduration")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Period>> getPositiveDuration();

        @Headers({ "x-ms-logging-context: fixtures.bodyduration.Durations getInvalid" })
        @GET("duration/invalid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Period>> getInvalid();

    }

    /**
     * Get null duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Period object if successful.
     */
    public Period getNull() {
        return getNullAsync().toBlocking().value();
    }

    /**
     * Get null duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Period> getNullAsync(ServiceCallback<Period> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Period> object
     */
    public Single<RestResponse<Void, Period>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Period> object
     */
    public Single<Period> getNullAsync() {
        return getNullWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Period>, Period>() { public Period call(RestResponse<Void, Period> restResponse) { return restResponse.body(); } });
        }


    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putPositiveDuration(Period durationBody) {
        putPositiveDurationAsync(durationBody).toBlocking().value();
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putPositiveDurationAsync(Period durationBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putPositiveDurationAsync(durationBody), serviceCallback);
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putPositiveDurationWithRestResponseAsync(Period durationBody) {
        if (durationBody == null) {
            throw new IllegalArgumentException("Parameter durationBody is required and cannot be null.");
        }
        return service.putPositiveDuration(durationBody);
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> putPositiveDurationAsync(Period durationBody) {
        return putPositiveDurationWithRestResponseAsync(durationBody)
            .map(new Func1<RestResponse<Void, Void>, Void>() { public Void call(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get a positive duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Period object if successful.
     */
    public Period getPositiveDuration() {
        return getPositiveDurationAsync().toBlocking().value();
    }

    /**
     * Get a positive duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Period> getPositiveDurationAsync(ServiceCallback<Period> serviceCallback) {
        return ServiceFuture.fromBody(getPositiveDurationAsync(), serviceCallback);
    }

    /**
     * Get a positive duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Period> object
     */
    public Single<RestResponse<Void, Period>> getPositiveDurationWithRestResponseAsync() {
        return service.getPositiveDuration();
    }

    /**
     * Get a positive duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Period> object
     */
    public Single<Period> getPositiveDurationAsync() {
        return getPositiveDurationWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Period>, Period>() { public Period call(RestResponse<Void, Period> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get an invalid duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Period object if successful.
     */
    public Period getInvalid() {
        return getInvalidAsync().toBlocking().value();
    }

    /**
     * Get an invalid duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Period> getInvalidAsync(ServiceCallback<Period> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidAsync(), serviceCallback);
    }

    /**
     * Get an invalid duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Period> object
     */
    public Single<RestResponse<Void, Period>> getInvalidWithRestResponseAsync() {
        return service.getInvalid();
    }

    /**
     * Get an invalid duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Period> object
     */
    public Single<Period> getInvalidAsync() {
        return getInvalidWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Period>, Period>() { public Period call(RestResponse<Void, Period> restResponse) { return restResponse.body(); } });
        }


}
