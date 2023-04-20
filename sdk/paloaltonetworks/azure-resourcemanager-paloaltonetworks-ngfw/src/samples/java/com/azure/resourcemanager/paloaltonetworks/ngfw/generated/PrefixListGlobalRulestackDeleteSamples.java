// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for PrefixListGlobalRulestack Delete. */
public final class PrefixListGlobalRulestackDeleteSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/PrefixListGlobalRulestack_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrefixListGlobalRulestack_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void prefixListGlobalRulestackDeleteMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.prefixListGlobalRulestacks().delete("praval", "armid1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/PrefixListGlobalRulestack_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrefixListGlobalRulestack_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void prefixListGlobalRulestackDeleteMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.prefixListGlobalRulestacks().delete("praval", "armid1", com.azure.core.util.Context.NONE);
    }
}