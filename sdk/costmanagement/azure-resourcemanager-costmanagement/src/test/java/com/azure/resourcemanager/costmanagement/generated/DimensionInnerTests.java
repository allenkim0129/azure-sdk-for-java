// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.fluent.models.DimensionInner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DimensionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DimensionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"hxsrzdzucersc\",\"filterEnabled\":false,\"groupingEnabled\":true,\"data\":[\"iwjmygtdssls\",\"tmweriofzpyq\",\"emwabnet\",\"hhszh\"],\"total\":1422875618,\"category\":\"vwiwubmwmbesld\",\"usageStart\":\"2021-06-09T22:01:08Z\",\"usageEnd\":\"2021-08-18T07:41:10Z\",\"nextLink\":\"pjflcxogao\"},\"sku\":\"nzmnsikvm\",\"eTag\":\"ze\",\"location\":\"qkdltfz\",\"tags\":{\"wobdagxtibqdx\":\"hvhgureod\"},\"id\":\"xwak\",\"name\":\"ogqxndlkzgxhuri\",\"type\":\"lbpodxunk\"}")
                .toObject(DimensionInner.class);
        Assertions.assertEquals("qkdltfz", model.location());
        Assertions.assertEquals("hvhgureod", model.tags().get("wobdagxtibqdx"));
        Assertions.assertEquals("iwjmygtdssls", model.data().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DimensionInner model =
            new DimensionInner()
                .withLocation("qkdltfz")
                .withTags(mapOf("wobdagxtibqdx", "hvhgureod"))
                .withData(Arrays.asList("iwjmygtdssls", "tmweriofzpyq", "emwabnet", "hhszh"));
        model = BinaryData.fromObject(model).toObject(DimensionInner.class);
        Assertions.assertEquals("qkdltfz", model.location());
        Assertions.assertEquals("hvhgureod", model.tags().get("wobdagxtibqdx"));
        Assertions.assertEquals("iwjmygtdssls", model.data().get(0));
    }

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