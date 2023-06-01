// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.resourcemanager.databox.models.MarkDevicesShippedRequest;
import com.azure.resourcemanager.databox.models.PackageCarrierInfo;

/** Samples for Jobs MarkDevicesShipped. */
public final class JobsMarkDevicesShippedSamples {
    /*
     * x-ms-original-file: specification/databox/resource-manager/Microsoft.DataBox/stable/2022-12-01/examples/MarkDevicesShipped.json
     */
    /**
     * Sample code: MarkDevicesShipped.
     *
     * @param manager Entry point to DataBoxManager.
     */
    public static void markDevicesShipped(com.azure.resourcemanager.databox.DataBoxManager manager) {
        manager
            .jobs()
            .markDevicesShippedWithResponse(
                "TestJobName1",
                "YourResourceGroupName",
                new MarkDevicesShippedRequest()
                    .withDeliverToDcPackageDetails(
                        new PackageCarrierInfo().withCarrierName("testCarrier").withTrackingId("000000")),
                com.azure.core.util.Context.NONE);
    }
}