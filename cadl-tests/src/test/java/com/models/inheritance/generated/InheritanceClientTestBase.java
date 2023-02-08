// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.models.inheritance.generated;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.models.inheritance.InheritanceClient;
import com.models.inheritance.InheritanceClientBuilder;

class InheritanceClientTestBase extends TestBase {
    protected InheritanceClient inheritanceClient;

    @Override
    protected void beforeTest() {
        InheritanceClientBuilder inheritanceClientbuilder =
                new InheritanceClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            inheritanceClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            inheritanceClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        inheritanceClient = inheritanceClientbuilder.buildClient();
    }
}