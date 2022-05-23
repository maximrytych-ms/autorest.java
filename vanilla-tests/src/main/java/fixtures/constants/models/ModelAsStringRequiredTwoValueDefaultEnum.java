// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.constants.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ModelAsStringRequiredTwoValueDefaultEnum. */
public final class ModelAsStringRequiredTwoValueDefaultEnum
        extends ExpandableStringEnum<ModelAsStringRequiredTwoValueDefaultEnum> {
    /** Static value value1 for ModelAsStringRequiredTwoValueDefaultEnum. */
    public static final ModelAsStringRequiredTwoValueDefaultEnum VALUE1 = fromString("value1");

    /** Static value value2 for ModelAsStringRequiredTwoValueDefaultEnum. */
    public static final ModelAsStringRequiredTwoValueDefaultEnum VALUE2 = fromString("value2");

    /**
     * Creates or finds a ModelAsStringRequiredTwoValueDefaultEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ModelAsStringRequiredTwoValueDefaultEnum.
     */
    @JsonCreator
    public static ModelAsStringRequiredTwoValueDefaultEnum fromString(String name) {
        return fromString(name, ModelAsStringRequiredTwoValueDefaultEnum.class);
    }

    /**
     * Gets known ModelAsStringRequiredTwoValueDefaultEnum values.
     *
     * @return known ModelAsStringRequiredTwoValueDefaultEnum values.
     */
    public static Collection<ModelAsStringRequiredTwoValueDefaultEnum> values() {
        return values(ModelAsStringRequiredTwoValueDefaultEnum.class);
    }
}