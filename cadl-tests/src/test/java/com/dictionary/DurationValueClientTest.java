// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.dictionary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

class DurationValueClientTest {

    DurationValueClient client = new DurationValueClientBuilder().buildClient();

    @Test
    void get() {
        Map<String, Duration> response = client.get();
        Assertions.assertTrue(response.containsKey("k1"));
        Assertions.assertEquals(Duration.parse("P123DT22H14M12.011S"), response.get("k1"));
    }

    @Test
    void put() {
        Map<String, Duration> map = new HashMap<>();
        map.put("k1", Duration.parse("P123DT22H14M12.011S"));
    }
}