// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Customer Managed Identity.
 */
@Immutable
public final class MyWorkbookUserAssignedIdentities implements JsonSerializable<MyWorkbookUserAssignedIdentities> {
    /*
     * The principal ID of resource identity.
     */
    private String principalId;

    /*
     * The tenant ID of resource.
     */
    private String tenantId;

    /**
     * Creates an instance of MyWorkbookUserAssignedIdentities class.
     */
    public MyWorkbookUserAssignedIdentities() {
    }

    /**
     * Get the principalId property: The principal ID of resource identity.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant ID of resource.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MyWorkbookUserAssignedIdentities from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MyWorkbookUserAssignedIdentities if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MyWorkbookUserAssignedIdentities.
     */
    public static MyWorkbookUserAssignedIdentities fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MyWorkbookUserAssignedIdentities deserializedMyWorkbookUserAssignedIdentities
                = new MyWorkbookUserAssignedIdentities();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("principalId".equals(fieldName)) {
                    deserializedMyWorkbookUserAssignedIdentities.principalId = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedMyWorkbookUserAssignedIdentities.tenantId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMyWorkbookUserAssignedIdentities;
        });
    }
}
