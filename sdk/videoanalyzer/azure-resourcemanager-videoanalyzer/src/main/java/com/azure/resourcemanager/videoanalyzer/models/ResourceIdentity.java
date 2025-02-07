// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The user assigned managed identity to use when accessing a resource. */
@Fluent
public class ResourceIdentity {
    /*
     * The user assigned managed identity's resource identifier to use when
     * accessing a resource.
     */
    @JsonProperty(value = "userAssignedIdentity", required = true)
    private String userAssignedIdentity;

    /**
     * Get the userAssignedIdentity property: The user assigned managed identity's resource identifier to use when
     * accessing a resource.
     *
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: The user assigned managed identity's resource identifier to use when
     * accessing a resource.
     *
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the ResourceIdentity object itself.
     */
    public ResourceIdentity withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentity() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property userAssignedIdentity in model ResourceIdentity"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceIdentity.class);
}
