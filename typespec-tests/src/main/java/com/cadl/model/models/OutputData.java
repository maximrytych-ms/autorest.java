// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.model.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OutputData model. */
@Immutable
public final class OutputData {
    /*
     * The data property.
     */
    @JsonProperty(value = "data", required = true)
    private String data;

    /**
     * Creates an instance of OutputData class.
     *
     * @param data the data value to set.
     */
    @JsonCreator
    private OutputData(@JsonProperty(value = "data", required = true) String data) {
        this.data = data;
    }

    /**
     * Get the data property: The data property.
     *
     * @return the data value.
     */
    public String getData() {
        return this.data;
    }
}
