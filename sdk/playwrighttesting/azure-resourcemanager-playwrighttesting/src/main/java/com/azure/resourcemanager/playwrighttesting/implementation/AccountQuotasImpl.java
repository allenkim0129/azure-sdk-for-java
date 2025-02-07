// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.playwrighttesting.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.playwrighttesting.fluent.AccountQuotasClient;
import com.azure.resourcemanager.playwrighttesting.fluent.models.AccountQuotaInner;
import com.azure.resourcemanager.playwrighttesting.models.AccountQuota;
import com.azure.resourcemanager.playwrighttesting.models.AccountQuotas;
import com.azure.resourcemanager.playwrighttesting.models.QuotaNames;

public final class AccountQuotasImpl implements AccountQuotas {
    private static final ClientLogger LOGGER = new ClientLogger(AccountQuotasImpl.class);

    private final AccountQuotasClient innerClient;

    private final com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager serviceManager;

    public AccountQuotasImpl(AccountQuotasClient innerClient,
        com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<AccountQuota> getWithResponse(String resourceGroupName, String accountName, QuotaNames quotaName,
        Context context) {
        Response<AccountQuotaInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, accountName, quotaName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccountQuotaImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccountQuota get(String resourceGroupName, String accountName, QuotaNames quotaName) {
        AccountQuotaInner inner = this.serviceClient().get(resourceGroupName, accountName, quotaName);
        if (inner != null) {
            return new AccountQuotaImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<AccountQuota> listByAccount(String resourceGroupName, String accountName) {
        PagedIterable<AccountQuotaInner> inner = this.serviceClient().listByAccount(resourceGroupName, accountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AccountQuotaImpl(inner1, this.manager()));
    }

    public PagedIterable<AccountQuota> listByAccount(String resourceGroupName, String accountName, Context context) {
        PagedIterable<AccountQuotaInner> inner
            = this.serviceClient().listByAccount(resourceGroupName, accountName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AccountQuotaImpl(inner1, this.manager()));
    }

    private AccountQuotasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager manager() {
        return this.serviceManager;
    }
}
