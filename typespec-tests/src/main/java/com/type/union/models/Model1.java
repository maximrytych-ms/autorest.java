// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.union.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The first one of the unioned model type. */
@Immutable
public final class Model1 extends BaseModel {
    /*
     * The prop1 property.
     */
    @JsonProperty(value = "prop1", required = true)
    private int prop1;

    /**
     * Creates an instance of Model1 class.
     *
     * @param name the name value to set.
     * @param prop1 the prop1 value to set.
     */
    @JsonCreator
    public Model1(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "prop1", required = true) int prop1) {
        super(name);
        this.prop1 = prop1;
    }

    /**
     * Get the prop1 property: The prop1 property.
     *
     * @return the prop1 value.
     */
    public int getProp1() {
        return this.prop1;
    }
}