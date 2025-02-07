// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Details about the target where the backup content will be stored.
 */
@Fluent
public final class BackupStoreDetails implements JsonSerializable<BackupStoreDetails> {
    /*
     * List of SAS uri of storage containers where backup data is to be streamed/copied.
     */
    private List<String> sasUriList;

    /**
     * Creates an instance of BackupStoreDetails class.
     */
    public BackupStoreDetails() {
    }

    /**
     * Get the sasUriList property: List of SAS uri of storage containers where backup data is to be streamed/copied.
     * 
     * @return the sasUriList value.
     */
    public List<String> sasUriList() {
        return this.sasUriList;
    }

    /**
     * Set the sasUriList property: List of SAS uri of storage containers where backup data is to be streamed/copied.
     * 
     * @param sasUriList the sasUriList value to set.
     * @return the BackupStoreDetails object itself.
     */
    public BackupStoreDetails withSasUriList(List<String> sasUriList) {
        this.sasUriList = sasUriList;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sasUriList() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sasUriList in model BackupStoreDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BackupStoreDetails.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("sasUriList", this.sasUriList, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BackupStoreDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BackupStoreDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BackupStoreDetails.
     */
    public static BackupStoreDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BackupStoreDetails deserializedBackupStoreDetails = new BackupStoreDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sasUriList".equals(fieldName)) {
                    List<String> sasUriList = reader.readArray(reader1 -> reader1.getString());
                    deserializedBackupStoreDetails.sasUriList = sasUriList;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBackupStoreDetails;
        });
    }
}
