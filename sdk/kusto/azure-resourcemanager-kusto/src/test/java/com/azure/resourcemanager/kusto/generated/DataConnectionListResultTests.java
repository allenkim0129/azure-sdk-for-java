// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.kusto.models.DataConnectionListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DataConnectionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataConnectionListResult model = BinaryData.fromString(
            "{\"value\":[{\"kind\":\"DataConnection\",\"location\":\"ehvbbxurip\",\"id\":\"tfnhtbaxkgxywr\",\"name\":\"kpyklyhp\",\"type\":\"uodpv\"},{\"kind\":\"DataConnection\",\"location\":\"udlgzibthostgkts\",\"id\":\"vdxec\",\"name\":\"zedqbcvhzlhplo\",\"type\":\"qkdlw\"},{\"kind\":\"DataConnection\",\"location\":\"fbumlkx\",\"id\":\"rqjfsmlm\",\"name\":\"txhwgfws\",\"type\":\"tawc\"}]}")
            .toObject(DataConnectionListResult.class);
        Assertions.assertEquals("ehvbbxurip", model.value().get(0).location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataConnectionListResult model = new DataConnectionListResult()
            .withValue(Arrays.asList(new DataConnectionInner().withLocation("ehvbbxurip"),
                new DataConnectionInner().withLocation("udlgzibthostgkts"),
                new DataConnectionInner().withLocation("fbumlkx")));
        model = BinaryData.fromObject(model).toObject(DataConnectionListResult.class);
        Assertions.assertEquals("ehvbbxurip", model.value().get(0).location());
    }
}
