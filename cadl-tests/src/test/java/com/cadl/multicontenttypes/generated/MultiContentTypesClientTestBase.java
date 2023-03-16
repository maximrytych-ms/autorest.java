// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.multicontenttypes.generated;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.cadl.multicontenttypes.MultiContentTypesClient;
import com.cadl.multicontenttypes.MultiContentTypesClientBuilder;

class MultiContentTypesClientTestBase extends TestBase {
    protected MultiContentTypesClient multiContentTypesClient;

    @Override
    protected void beforeTest() {
        MultiContentTypesClientBuilder multiContentTypesClientbuilder =
                new MultiContentTypesClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            multiContentTypesClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            multiContentTypesClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        multiContentTypesClient = multiContentTypesClientbuilder.buildClient();
    }
}
