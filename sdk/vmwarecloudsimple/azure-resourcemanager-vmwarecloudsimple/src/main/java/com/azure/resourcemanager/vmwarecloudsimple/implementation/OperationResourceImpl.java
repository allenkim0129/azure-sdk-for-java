// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.implementation;

import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.OperationResourceInner;
import com.azure.resourcemanager.vmwarecloudsimple.models.OperationError;
import com.azure.resourcemanager.vmwarecloudsimple.models.OperationResource;
import java.time.OffsetDateTime;

public final class OperationResourceImpl implements OperationResource {
    private OperationResourceInner innerObject;

    private final com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager serviceManager;

    OperationResourceImpl(OperationResourceInner innerObject,
        com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public OperationError error() {
        return this.innerModel().error();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public String status() {
        return this.innerModel().status();
    }

    public OperationResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager manager() {
        return this.serviceManager;
    }
}
