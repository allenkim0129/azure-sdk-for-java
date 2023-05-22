// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.QueryColumn;
import org.junit.jupiter.api.Assertions;

public final class QueryColumnTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QueryColumn model =
            BinaryData.fromString("{\"name\":\"fcktqumiekke\",\"type\":\"ikh\"}").toObject(QueryColumn.class);
        Assertions.assertEquals("fcktqumiekke", model.name());
        Assertions.assertEquals("ikh", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QueryColumn model = new QueryColumn().withName("fcktqumiekke").withType("ikh");
        model = BinaryData.fromObject(model).toObject(QueryColumn.class);
        Assertions.assertEquals("fcktqumiekke", model.name());
        Assertions.assertEquals("ikh", model.type());
    }
}