// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.SwaggerCustomDynamicSchema;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SwaggerCustomDynamicSchemaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SwaggerCustomDynamicSchema model = BinaryData.fromString(
            "{\"operationId\":\"xrrf\",\"valuePath\":\"skwujhskxxekzysa\",\"parameters\":{\"icsfaqy\":\"dataimcaxgtwpzqtim\"}}")
            .toObject(SwaggerCustomDynamicSchema.class);
        Assertions.assertEquals("xrrf", model.operationId());
        Assertions.assertEquals("skwujhskxxekzysa", model.valuePath());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SwaggerCustomDynamicSchema model = new SwaggerCustomDynamicSchema().withOperationId("xrrf")
            .withValuePath("skwujhskxxekzysa")
            .withParameters(mapOf("icsfaqy", "dataimcaxgtwpzqtim"));
        model = BinaryData.fromObject(model).toObject(SwaggerCustomDynamicSchema.class);
        Assertions.assertEquals("xrrf", model.operationId());
        Assertions.assertEquals("skwujhskxxekzysa", model.valuePath());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
