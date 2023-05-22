// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The category of hardware validation to perform. */
public final class BareMetalMachineHardwareValidationCategory
    extends ExpandableStringEnum<BareMetalMachineHardwareValidationCategory> {
    /** Static value BasicValidation for BareMetalMachineHardwareValidationCategory. */
    public static final BareMetalMachineHardwareValidationCategory BASIC_VALIDATION = fromString("BasicValidation");

    /**
     * Creates a new instance of BareMetalMachineHardwareValidationCategory value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BareMetalMachineHardwareValidationCategory() {
    }

    /**
     * Creates or finds a BareMetalMachineHardwareValidationCategory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BareMetalMachineHardwareValidationCategory.
     */
    @JsonCreator
    public static BareMetalMachineHardwareValidationCategory fromString(String name) {
        return fromString(name, BareMetalMachineHardwareValidationCategory.class);
    }

    /**
     * Gets known BareMetalMachineHardwareValidationCategory values.
     *
     * @return known BareMetalMachineHardwareValidationCategory values.
     */
    public static Collection<BareMetalMachineHardwareValidationCategory> values() {
        return values(BareMetalMachineHardwareValidationCategory.class);
    }
}