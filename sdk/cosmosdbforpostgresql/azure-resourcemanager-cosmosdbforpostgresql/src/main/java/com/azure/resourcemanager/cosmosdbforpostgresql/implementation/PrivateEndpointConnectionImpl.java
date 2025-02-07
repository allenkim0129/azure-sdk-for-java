// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateEndpoint;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateEndpointConnection;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateEndpointConnectionProvisioningState;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateLinkServiceConnectionState;
import java.util.Collections;
import java.util.List;

public final class PrivateEndpointConnectionImpl
    implements PrivateEndpointConnection, PrivateEndpointConnection.Definition, PrivateEndpointConnection.Update {
    private PrivateEndpointConnectionInner innerObject;

    private final com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<String> groupIds() {
        List<String> inner = this.innerModel().groupIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateEndpoint privateEndpoint() {
        return this.innerModel().privateEndpoint();
    }

    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String privateEndpointConnectionName;

    public PrivateEndpointConnectionImpl withExistingServerGroupsv2(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    public PrivateEndpointConnection create() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnections()
            .createOrUpdate(resourceGroupName, clusterName, privateEndpointConnectionName, this.innerModel(),
                Context.NONE);
        return this;
    }

    public PrivateEndpointConnection create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnections()
            .createOrUpdate(resourceGroupName, clusterName, privateEndpointConnectionName, this.innerModel(), context);
        return this;
    }

    PrivateEndpointConnectionImpl(String name,
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
    }

    public PrivateEndpointConnectionImpl update() {
        return this;
    }

    public PrivateEndpointConnection apply() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnections()
            .createOrUpdate(resourceGroupName, clusterName, privateEndpointConnectionName, this.innerModel(),
                Context.NONE);
        return this;
    }

    public PrivateEndpointConnection apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnections()
            .createOrUpdate(resourceGroupName, clusterName, privateEndpointConnectionName, this.innerModel(), context);
        return this;
    }

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner innerObject,
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "serverGroupsv2");
        this.privateEndpointConnectionName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "privateEndpointConnections");
    }

    public PrivateEndpointConnection refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnections()
            .getWithResponse(resourceGroupName, clusterName, privateEndpointConnectionName, Context.NONE)
            .getValue();
        return this;
    }

    public PrivateEndpointConnection refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnections()
            .getWithResponse(resourceGroupName, clusterName, privateEndpointConnectionName, context)
            .getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.innerModel().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    public PrivateEndpointConnectionImpl
        withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.innerModel().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }
}
