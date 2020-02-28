// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.xml.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * A banana.
 */
@JacksonXmlRootElement(localName = "banana")
@Fluent
public final class Banana {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The flavor property.
     */
    @JsonProperty(value = "flavor")
    private String flavor;

    /*
     * The time at which you should reconsider eating this banana
     */
    @JsonProperty(value = "expiration")
    private OffsetDateTime expiration;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the Banana object itself.
     */
    public Banana name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the flavor property: The flavor property.
     *
     * @return the flavor value.
     */
    public String flavor() {
        return this.flavor;
    }

    /**
     * Set the flavor property: The flavor property.
     *
     * @param flavor the flavor value to set.
     * @return the Banana object itself.
     */
    public Banana flavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * Get the expiration property: The time at which you should reconsider
     * eating this banana.
     *
     * @return the expiration value.
     */
    public OffsetDateTime expiration() {
        return this.expiration;
    }

    /**
     * Set the expiration property: The time at which you should reconsider
     * eating this banana.
     *
     * @param expiration the expiration value to set.
     * @return the Banana object itself.
     */
    public Banana expiration(OffsetDateTime expiration) {
        this.expiration = expiration;
        return this;
    }
}