// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.playwrighttesting.generated;

/**
 * Samples for AccountQuotas ListByAccount.
 */
public final class AccountQuotasListByAccountSamples {
    /*
     * x-ms-original-file: 2024-12-01/AccountQuotas_ListByAccount.json
     */
    /**
     * Sample code: AccountQuotas_ListByAccount.
     * 
     * @param manager Entry point to PlaywrightTestingManager.
     */
    public static void
        accountQuotasListByAccount(com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager manager) {
        manager.accountQuotas().listByAccount("dummyrg", "myPlaywrightAccount", com.azure.core.util.Context.NONE);
    }
}
