// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.projection.projectedname.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LanguageProjectedNameModel model. */
@Immutable
public final class LanguageProjectedNameModel {
    /*
     * Pass in true
     */
    @JsonProperty(value = "defaultName", required = true)
    private boolean javaName;

    /**
     * Creates an instance of LanguageProjectedNameModel class.
     *
     * @param javaName the javaName value to set.
     */
    @JsonCreator
    public LanguageProjectedNameModel(@JsonProperty(value = "defaultName", required = true) boolean javaName) {
        this.javaName = javaName;
    }

    /**
     * Get the javaName property: Pass in true.
     *
     * @return the javaName value.
     */
    public boolean isJavaName() {
        return this.javaName;
    }
}