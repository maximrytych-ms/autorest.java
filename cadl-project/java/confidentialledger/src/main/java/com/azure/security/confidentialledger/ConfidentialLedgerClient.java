// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.confidentialledger;

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
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous ConfidentialLedgerServiceClient type. */
@ServiceClient(builder = ConfidentialLedgerClientBuilder.class)
public final class ConfidentialLedgerClient {
    @Generated private final ConfidentialLedgerAsyncClient client;

    /**
     * Initializes an instance of ConfidentialLedgerClient class.
     *
     * @param client the async client.
     */
    @Generated
    ConfidentialLedgerClient(ConfidentialLedgerAsyncClient client) {
        this.client = client;
    }

    /**
     * Collection ids are user-created collections of ledger entries.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     items (Required): [
     *          (Required){
     *             collectionId: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a list of identifiers for ledger collections along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listCollectionsWithResponse(RequestOptions requestOptions) {
        return this.client.listCollectionsWithResponse(requestOptions).block();
    }

    /**
     * A quote is an SGX enclave measurement that can be used to verify the validity of a node and its enclave.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * double
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
    public Response<Double> getEnclaveQuotesWithResponse(RequestOptions requestOptions) {
        return this.client.getEnclaveQuotesWithResponse(requestOptions).block();
    }

    /**
     * The constitution is a script that assesses and applies proposals from consortium members.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * double
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
    public Response<Double> getConstitutionWithResponse(RequestOptions requestOptions) {
        return this.client.getConstitutionWithResponse(requestOptions).block();
    }

    /**
     * Consortium members can manage the Confidential Ledger.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * double
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
    public Response<Double> getConsortiumMembersWithResponse(RequestOptions requestOptions) {
        return this.client.getConsortiumMembersWithResponse(requestOptions).block();
    }

    /**
     * A collection id may optionally be specified.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>collectionId</td><td>String</td><td>No</td><td>The collection id.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     contents: String (Required)
     *     collectionId: String (Required)
     *     transactionId: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * double
     * }</pre>
     *
     * @param entry The entry parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Double> postLedgerEntryWithResponse(BinaryData entry, RequestOptions requestOptions) {
        return this.client.postLedgerEntryWithResponse(entry, requestOptions).block();
    }

    /**
     * <strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>collectionId</td><td>String</td><td>No</td><td>The collection id.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * double
     * }</pre>
     *
     * @param transactionId Identifies a write transaction.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Double> getLedgerEntryWithResponse(String transactionId, RequestOptions requestOptions) {
        return this.client.getLedgerEntryWithResponse(transactionId, requestOptions).block();
    }

    /**
     * <strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * double
     * }</pre>
     *
     * @param transactionId Identifies a write transaction.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Double> getReceiptWithResponse(String transactionId, RequestOptions requestOptions) {
        return this.client.getReceiptWithResponse(transactionId, requestOptions).block();
    }

    /**
     * <strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * double
     * }</pre>
     *
     * @param transactionId Identifies a write transaction.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Double> getTransactionStatusWithResponse(String transactionId, RequestOptions requestOptions) {
        return this.client.getTransactionStatusWithResponse(transactionId, requestOptions).block();
    }

    /**
     * <strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>collectionId</td><td>String</td><td>No</td><td>The collection id.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * double
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
    public Response<Double> getCurrentLedgerEntryWithResponse(RequestOptions requestOptions) {
        return this.client.getCurrentLedgerEntryWithResponse(requestOptions).block();
    }

    /**
     * @param userId The user id, either an AAD object ID or certificate fingerprint.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteUserWithResponse(String userId, RequestOptions requestOptions) {
        return this.client.deleteUserWithResponse(userId, requestOptions).block();
    }

    /**
     * <strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * double
     * }</pre>
     *
     * @param userId The user id, either an AAD object ID or certificate fingerprint.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Double> getUserWithResponse(String userId, RequestOptions requestOptions) {
        return this.client.getUserWithResponse(userId, requestOptions).block();
    }

    /**
     * <strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     assignedRole: String(Administrator/Contributor/Reader) (Required)
     *     userId: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * double
     * }</pre>
     *
     * @param userId The user id, either an AAD object ID or certificate fingerprint.
     * @param contentType The contentType parameter.
     * @param userDetails Details about a Confidential Ledger user.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Double> createOrUpdateUserWithResponse(
            String userId, String contentType, BinaryData userDetails, RequestOptions requestOptions) {
        return this.client.createOrUpdateUserWithResponse(userId, contentType, userDetails, requestOptions).block();
    }
}