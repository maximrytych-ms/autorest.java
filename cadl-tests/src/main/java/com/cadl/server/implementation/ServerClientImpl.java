// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.server.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the ServerClient type. */
public final class ServerClientImpl {
    /** second-level domain, use httpbin. */
    private final String domain;

    /**
     * Gets second-level domain, use httpbin.
     *
     * @return the domain value.
     */
    public String getDomain() {
        return this.domain;
    }

    /** top-level domain, use org. */
    private final String tld;

    /**
     * Gets top-level domain, use org.
     *
     * @return the tld value.
     */
    public String getTld() {
        return this.tld;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The ServerOpsImpl object to access its operations. */
    private final ServerOpsImpl serverOps;

    /**
     * Gets the ServerOpsImpl object to access its operations.
     *
     * @return the ServerOpsImpl object.
     */
    public ServerOpsImpl getServerOps() {
        return this.serverOps;
    }

    /**
     * Initializes an instance of ServerClient client.
     *
     * @param domain second-level domain, use httpbin.
     * @param tld top-level domain, use org.
     */
    public ServerClientImpl(String domain, String tld) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                domain,
                tld);
    }

    /**
     * Initializes an instance of ServerClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param domain second-level domain, use httpbin.
     * @param tld top-level domain, use org.
     */
    public ServerClientImpl(HttpPipeline httpPipeline, String domain, String tld) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), domain, tld);
    }

    /**
     * Initializes an instance of ServerClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param domain second-level domain, use httpbin.
     * @param tld top-level domain, use org.
     */
    public ServerClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String domain, String tld) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.domain = domain;
        this.tld = tld;
        this.serverOps = new ServerOpsImpl(this);
    }
}