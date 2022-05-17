// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.constants.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for NoModelAsStringNoRequiredTwoValueNoDefaultEnum. */
public enum NoModelAsStringNoRequiredTwoValueNoDefaultEnum {
    /** Enum value value1. */
    VALUE1("value1"),

    /** Enum value value2. */
    VALUE2("value2");

    /** The actual serialized value for a NoModelAsStringNoRequiredTwoValueNoDefaultEnum instance. */
    private final String value;

    NoModelAsStringNoRequiredTwoValueNoDefaultEnum(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a NoModelAsStringNoRequiredTwoValueNoDefaultEnum instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed NoModelAsStringNoRequiredTwoValueNoDefaultEnum object, or null if unable to parse.
     */
    @JsonCreator
    public static NoModelAsStringNoRequiredTwoValueNoDefaultEnum fromString(String value) {
        NoModelAsStringNoRequiredTwoValueNoDefaultEnum[] items =
                NoModelAsStringNoRequiredTwoValueNoDefaultEnum.values();
        for (NoModelAsStringNoRequiredTwoValueNoDefaultEnum item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
