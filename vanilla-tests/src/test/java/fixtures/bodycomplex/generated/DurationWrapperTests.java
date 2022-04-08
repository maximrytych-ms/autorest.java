// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.generated;

import com.azure.core.util.BinaryData;
import fixtures.bodycomplex.models.DurationWrapper;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DurationWrapperTests {
    @Test
    public void testDeserialize() {
        DurationWrapper model = BinaryData.fromString("{\"field\":\"PT208H24M29S\"}").toObject(DurationWrapper.class);
        Assertions.assertEquals(Duration.parse("PT208H24M29S"), model.getField());
    }

    @Test
    public void testSerialize() {
        DurationWrapper model = new DurationWrapper().setField(Duration.parse("PT208H24M29S"));
        model = BinaryData.fromObject(model).toObject(DurationWrapper.class);
        Assertions.assertEquals(Duration.parse("PT208H24M29S"), model.getField());
    }
}
