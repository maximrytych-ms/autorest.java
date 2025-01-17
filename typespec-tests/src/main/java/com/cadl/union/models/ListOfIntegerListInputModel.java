// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.union.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

/** The ListOfIntegerListInputModel model. */
@Immutable
public final class ListOfIntegerListInputModel extends InputModelBase {
    private final List<List<Integer>> value;

    /**
     * Creates an instance of ListOfIntegerListInputModel class.
     *
     * @param value the value.
     */
    public ListOfIntegerListInputModel(List<List<Integer>> value) {
        this.value = value;
    }

    /**
     * Gets the value.
     *
     * @return the value.
     */
    @JsonValue
    public List<List<Integer>> getValue() {
        return this.value;
    }
}
