// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.OperationListResult;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"id\":\"quvgjxpybczme\",\"name\":\"tzopbsphrupidgsy\",\"isDataAction\":false,\"display\":{\"provider\":\"ph\",\"resource\":\"cmsxaobhdxbm\",\"operation\":\"ioq\",\"description\":\"ehtbm\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"},{\"id\":\"oizh\",\"name\":\"rxybqsoq\",\"isDataAction\":false,\"display\":{\"provider\":\"mbpazlobcufpdzn\",\"resource\":\"t\",\"operation\":\"qjnqglhqgnufoooj\",\"description\":\"ifsqesaagdfmg\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"},{\"id\":\"rifkwm\",\"name\":\"ktsizntocipaou\",\"isDataAction\":true,\"display\":{\"provider\":\"ucmpoyfd\",\"resource\":\"ogknygjofjdd\",\"operation\":\"s\",\"description\":\"eupewnwreitjz\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"}],\"nextLink\":\"rh\"}")
                .toObject(OperationListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model = new OperationListResult();
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
    }
}