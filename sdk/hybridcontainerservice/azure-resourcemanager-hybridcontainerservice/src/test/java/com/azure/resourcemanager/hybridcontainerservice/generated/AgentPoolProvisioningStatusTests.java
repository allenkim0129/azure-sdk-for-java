// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProvisioningStatus;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProvisioningStatusStatus;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolUpdateProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AgentPoolProvisioningStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentPoolProvisioningStatus model = BinaryData.fromString(
            "{\"provisioningState\":\"Accepted\",\"status\":{\"currentState\":\"Succeeded\",\"errorMessage\":\"ulpkudjkrl\",\"readyReplicas\":[{\"count\":375716095,\"vmSize\":\"epgzgqexz\",\"kubernetesVersion\":\"c\"},{\"count\":149734817,\"vmSize\":\"aierhhb\",\"kubernetesVersion\":\"glu\"},{\"count\":187934940,\"vmSize\":\"tjaodxobnb\",\"kubernetesVersion\":\"k\"},{\"count\":397818750,\"vmSize\":\"kajionpim\",\"kubernetesVersion\":\"gstxgcp\"}]}}")
            .toObject(AgentPoolProvisioningStatus.class);
        Assertions.assertEquals("ulpkudjkrl", model.status().errorMessage());
        Assertions.assertEquals(375716095, model.status().readyReplicas().get(0).count());
        Assertions.assertEquals("epgzgqexz", model.status().readyReplicas().get(0).vmSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentPoolProvisioningStatus model = new AgentPoolProvisioningStatus()
            .withStatus(new AgentPoolProvisioningStatusStatus().withErrorMessage("ulpkudjkrl")
                .withReadyReplicas(
                    Arrays.asList(new AgentPoolUpdateProfile().withCount(375716095).withVmSize("epgzgqexz"),
                        new AgentPoolUpdateProfile().withCount(149734817).withVmSize("aierhhb"),
                        new AgentPoolUpdateProfile().withCount(187934940).withVmSize("tjaodxobnb"),
                        new AgentPoolUpdateProfile().withCount(397818750).withVmSize("kajionpim"))));
        model = BinaryData.fromObject(model).toObject(AgentPoolProvisioningStatus.class);
        Assertions.assertEquals("ulpkudjkrl", model.status().errorMessage());
        Assertions.assertEquals(375716095, model.status().readyReplicas().get(0).count());
        Assertions.assertEquals("epgzgqexz", model.status().readyReplicas().get(0).vmSize());
    }
}
