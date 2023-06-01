// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Azure service impacted by the service health event. */
@Fluent
public final class Impact {
    /*
     * Impacted service name.
     */
    @JsonProperty(value = "impactedService")
    private String impactedService;

    /*
     * List regions impacted by the service health event.
     */
    @JsonProperty(value = "impactedRegions")
    private List<ImpactedServiceRegion> impactedRegions;

    /** Creates an instance of Impact class. */
    public Impact() {
    }

    /**
     * Get the impactedService property: Impacted service name.
     *
     * @return the impactedService value.
     */
    public String impactedService() {
        return this.impactedService;
    }

    /**
     * Set the impactedService property: Impacted service name.
     *
     * @param impactedService the impactedService value to set.
     * @return the Impact object itself.
     */
    public Impact withImpactedService(String impactedService) {
        this.impactedService = impactedService;
        return this;
    }

    /**
     * Get the impactedRegions property: List regions impacted by the service health event.
     *
     * @return the impactedRegions value.
     */
    public List<ImpactedServiceRegion> impactedRegions() {
        return this.impactedRegions;
    }

    /**
     * Set the impactedRegions property: List regions impacted by the service health event.
     *
     * @param impactedRegions the impactedRegions value to set.
     * @return the Impact object itself.
     */
    public Impact withImpactedRegions(List<ImpactedServiceRegion> impactedRegions) {
        this.impactedRegions = impactedRegions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (impactedRegions() != null) {
            impactedRegions().forEach(e -> e.validate());
        }
    }
}