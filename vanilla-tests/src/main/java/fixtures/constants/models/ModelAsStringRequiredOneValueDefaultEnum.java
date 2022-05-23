// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.constants.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ModelAsStringRequiredOneValueDefaultEnum. */
public final class ModelAsStringRequiredOneValueDefaultEnum
        extends ExpandableStringEnum<ModelAsStringRequiredOneValueDefaultEnum> {
    /** Static value value1 for ModelAsStringRequiredOneValueDefaultEnum. */
    public static final ModelAsStringRequiredOneValueDefaultEnum VALUE1 = fromString("value1");

    /**
     * Creates or finds a ModelAsStringRequiredOneValueDefaultEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ModelAsStringRequiredOneValueDefaultEnum.
     */
    @JsonCreator
    public static ModelAsStringRequiredOneValueDefaultEnum fromString(String name) {
        return fromString(name, ModelAsStringRequiredOneValueDefaultEnum.class);
    }

    /**
     * Gets known ModelAsStringRequiredOneValueDefaultEnum values.
     *
     * @return known ModelAsStringRequiredOneValueDefaultEnum values.
     */
    public static Collection<ModelAsStringRequiredOneValueDefaultEnum> values() {
        return values(ModelAsStringRequiredOneValueDefaultEnum.class);
    }
}