// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FqdnListGlobalRulestackResourceInner;
import java.util.Arrays;

/** Samples for FqdnListGlobalRulestack CreateOrUpdate. */
public final class FqdnListGlobalRulestackCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/FqdnListGlobalRulestack_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: FqdnListGlobalRulestack_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void fqdnListGlobalRulestackCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .fqdnListGlobalRulestacks()
            .createOrUpdate(
                "praval",
                "armid1",
                new FqdnListGlobalRulestackResourceInner()
                    .withDescription("string")
                    .withFqdnList(Arrays.asList("string1", "string2"))
                    .withEtag("aaaaaaaaaaaaaaaaaa")
                    .withAuditComment("string"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/FqdnListGlobalRulestack_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: FqdnListGlobalRulestack_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void fqdnListGlobalRulestackCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .fqdnListGlobalRulestacks()
            .createOrUpdate(
                "praval",
                "armid1",
                new FqdnListGlobalRulestackResourceInner().withFqdnList(Arrays.asList("string1", "string2")),
                com.azure.core.util.Context.NONE);
    }
}