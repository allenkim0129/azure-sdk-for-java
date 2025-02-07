// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Information about a Provider. A Provider is an entity that offers Targets to run Azure Quantum Jobs.
 */
@Fluent
public final class Provider implements JsonSerializable<Provider> {
    /*
     * Unique id of this provider.
     */
    private String providerId;

    /*
     * The sku associated with pricing information for this provider.
     */
    private String providerSku;

    /*
     * A Uri identifying the specific instance of this provider.
     */
    private String instanceUri;

    /*
     * The provider's marketplace application display name.
     */
    private String applicationName;

    /*
     * Provisioning status field
     */
    private Status provisioningState;

    /*
     * Id to track resource usage for the provider.
     */
    private String resourceUsageId;

    /**
     * Creates an instance of Provider class.
     */
    public Provider() {
    }

    /**
     * Get the providerId property: Unique id of this provider.
     * 
     * @return the providerId value.
     */
    public String providerId() {
        return this.providerId;
    }

    /**
     * Set the providerId property: Unique id of this provider.
     * 
     * @param providerId the providerId value to set.
     * @return the Provider object itself.
     */
    public Provider withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * Get the providerSku property: The sku associated with pricing information for this provider.
     * 
     * @return the providerSku value.
     */
    public String providerSku() {
        return this.providerSku;
    }

    /**
     * Set the providerSku property: The sku associated with pricing information for this provider.
     * 
     * @param providerSku the providerSku value to set.
     * @return the Provider object itself.
     */
    public Provider withProviderSku(String providerSku) {
        this.providerSku = providerSku;
        return this;
    }

    /**
     * Get the instanceUri property: A Uri identifying the specific instance of this provider.
     * 
     * @return the instanceUri value.
     */
    public String instanceUri() {
        return this.instanceUri;
    }

    /**
     * Set the instanceUri property: A Uri identifying the specific instance of this provider.
     * 
     * @param instanceUri the instanceUri value to set.
     * @return the Provider object itself.
     */
    public Provider withInstanceUri(String instanceUri) {
        this.instanceUri = instanceUri;
        return this;
    }

    /**
     * Get the applicationName property: The provider's marketplace application display name.
     * 
     * @return the applicationName value.
     */
    public String applicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: The provider's marketplace application display name.
     * 
     * @param applicationName the applicationName value to set.
     * @return the Provider object itself.
     */
    public Provider withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning status field.
     * 
     * @return the provisioningState value.
     */
    public Status provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning status field.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the Provider object itself.
     */
    public Provider withProvisioningState(Status provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the resourceUsageId property: Id to track resource usage for the provider.
     * 
     * @return the resourceUsageId value.
     */
    public String resourceUsageId() {
        return this.resourceUsageId;
    }

    /**
     * Set the resourceUsageId property: Id to track resource usage for the provider.
     * 
     * @param resourceUsageId the resourceUsageId value to set.
     * @return the Provider object itself.
     */
    public Provider withResourceUsageId(String resourceUsageId) {
        this.resourceUsageId = resourceUsageId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("providerId", this.providerId);
        jsonWriter.writeStringField("providerSku", this.providerSku);
        jsonWriter.writeStringField("instanceUri", this.instanceUri);
        jsonWriter.writeStringField("applicationName", this.applicationName);
        jsonWriter.writeStringField("provisioningState",
            this.provisioningState == null ? null : this.provisioningState.toString());
        jsonWriter.writeStringField("resourceUsageId", this.resourceUsageId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Provider from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Provider if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Provider.
     */
    public static Provider fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Provider deserializedProvider = new Provider();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("providerId".equals(fieldName)) {
                    deserializedProvider.providerId = reader.getString();
                } else if ("providerSku".equals(fieldName)) {
                    deserializedProvider.providerSku = reader.getString();
                } else if ("instanceUri".equals(fieldName)) {
                    deserializedProvider.instanceUri = reader.getString();
                } else if ("applicationName".equals(fieldName)) {
                    deserializedProvider.applicationName = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedProvider.provisioningState = Status.fromString(reader.getString());
                } else if ("resourceUsageId".equals(fieldName)) {
                    deserializedProvider.resourceUsageId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProvider;
        });
    }
}
