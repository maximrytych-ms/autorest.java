/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.azure.autorest.fluent.util;

import com.azure.autorest.extension.base.plugin.NewPlugin;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FluentJavaSettings {

    private final NewPlugin host;

    /**
     * Java class names for extra Inner classes.
     */
    private Set<String> javaNamesForAddInner;

    /**
     * Whether to generate property method with track1 naming (e.g. foo, withFoo), instead of track2 naming (e.g. getFoo, setFoo).
     */
    private boolean track1Naming = false;

    /**
     * Whether to treat read-only resource property as SubResource type.
     */
    private boolean resourcePropertyAsSubResource = false;

    public FluentJavaSettings(NewPlugin host) {
        Objects.requireNonNull(host);
        this.host = host;

        loadSettings();
    }

    public Set<String> getJavaNamesForAddInner() {
        return javaNamesForAddInner;
    }

    public boolean isTrack1Naming() {
        return track1Naming;
    }

    public boolean isResourcePropertyAsSubResource() {
        return resourcePropertyAsSubResource;
    }

    private void loadSettings() {
        String addInnerSetting = host.getStringValue("add-inner");
        if (addInnerSetting != null && !addInnerSetting.isEmpty()) {
            javaNamesForAddInner = Arrays.stream(addInnerSetting.split(Pattern.quote(",")))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .collect(Collectors.toSet());
        } else {
            javaNamesForAddInner = Collections.emptySet();
        }

        loadBooleanSetting("track1-naming", b -> track1Naming = b);
        loadBooleanSetting("resource-property-as-subresource", b -> resourcePropertyAsSubResource = b);
    }

    private void loadBooleanSetting(String settingName, Consumer<Boolean> action) {
        String settingValue = host.getStringValue(settingName);
        if (settingValue != null && !settingValue.isEmpty()) {
            action.accept(true);
        }
    }
}