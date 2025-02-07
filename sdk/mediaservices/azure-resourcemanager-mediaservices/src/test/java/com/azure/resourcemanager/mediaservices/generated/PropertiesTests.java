// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.Properties;

public final class PropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Properties model = BinaryData.fromString(
            "{\"serviceSpecification\":{\"logSpecifications\":[{\"name\":\"urzafb\",\"displayName\":\"j\",\"blobDuration\":\"btoqcjmkljavbqid\"},{\"name\":\"ajzyul\",\"displayName\":\"u\",\"blobDuration\":\"krlkhbzhfepg\"},{\"name\":\"qex\",\"displayName\":\"ocxscpaierhhbcs\",\"blobDuration\":\"ummajtjaod\"},{\"name\":\"bnbdxkqpxokajion\",\"displayName\":\"mexgstxgcp\",\"blobDuration\":\"gmaajrm\"}],\"metricSpecifications\":[{\"name\":\"zrlovmclwhijcoej\",\"displayName\":\"bzaqsqsycbkbfk\",\"displayDescription\":\"kdkexxp\",\"unit\":\"Count\",\"aggregationType\":\"Average\",\"lockAggregationType\":\"Total\",\"supportedAggregationTypes\":[\"jpgd\",\"toc\",\"j\",\"hvpmoue\"],\"dimensions\":[{\"name\":\"xibqeojnx\",\"displayName\":\"zvddntwndeicbtwn\",\"toBeExportedForShoebox\":false},{\"name\":\"qvuhrhcffcyddglm\",\"displayName\":\"hjq\",\"toBeExportedForShoebox\":false},{\"name\":\"eicxmqciwqvhkhi\",\"displayName\":\"igdtopbob\",\"toBeExportedForShoebox\":false},{\"name\":\"m\",\"displayName\":\"u\",\"toBeExportedForShoebox\":false}],\"enableRegionalMdmAccount\":true,\"sourceMdmAccount\":\"z\",\"sourceMdmNamespace\":\"vvtpgvdfgio\",\"supportedTimeGrainTypes\":[\"tutqxlngxlefgug\",\"xkrxdqmi\",\"tthzrvqd\",\"abhjybi\"]},{\"name\":\"h\",\"displayName\":\"fbowskanyk\",\"displayDescription\":\"lcuiywgqywgndr\",\"unit\":\"Count\",\"aggregationType\":\"Total\",\"lockAggregationType\":\"Total\",\"supportedAggregationTypes\":[\"rcgyn\"],\"dimensions\":[{\"name\":\"ecfvmm\",\"displayName\":\"ofsx\",\"toBeExportedForShoebox\":false},{\"name\":\"gbmqjqabcypmiv\",\"displayName\":\"lzu\",\"toBeExportedForShoebox\":false},{\"name\":\"wnfnbacf\",\"displayName\":\"nlebxetqgtzxd\",\"toBeExportedForShoebox\":false},{\"name\":\"qqwx\",\"displayName\":\"feallnwsu\",\"toBeExportedForShoebox\":true}],\"enableRegionalMdmAccount\":true,\"sourceMdmAccount\":\"mpmngnzscxaqwoo\",\"sourceMdmNamespace\":\"cbonqvpk\",\"supportedTimeGrainTypes\":[\"xnj\",\"ase\",\"pheoflokeyy\",\"enjbdlwtgrhp\"]}]}}")
            .toObject(Properties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Properties model = new Properties();
        model = BinaryData.fromObject(model).toObject(Properties.class);
    }
}
