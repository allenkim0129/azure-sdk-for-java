// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;

/**
 * Holds details on the destination of the mapped artifact.
 */
@Fluent
public class Sink implements JsonSerializable<Sink> {
    /*
     * The types of asset.
     */
    private StoreKind storeKind = StoreKind.fromString("Sink");

    /*
     * A Store Reference for an artifact or sink.
     */
    private StoreReference storeReference;

    /**
     * Creates an instance of Sink class.
     */
    public Sink() {
    }

    /**
     * Get the storeKind property: The types of asset.
     *
     * @return the storeKind value.
     */
    public StoreKind getStoreKind() {
        return this.storeKind;
    }

    /**
     * Get the storeReference property: A Store Reference for an artifact or sink.
     *
     * @return the storeReference value.
     */
    public StoreReference getStoreReference() {
        return this.storeReference;
    }

    /**
     * Set the storeReference property: A Store Reference for an artifact or sink.
     *
     * @param storeReference the storeReference value to set.
     * @return the Sink object itself.
     */
    public Sink setStoreReference(StoreReference storeReference) {
        this.storeReference = storeReference;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("storeReference", this.storeReference);
        jsonWriter.writeStringField("storeKind", this.storeKind == null ? null : this.storeKind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Sink from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of Sink if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Sink.
     */
    public static Sink fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("storeKind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("AdlsGen2Account".equals(discriminatorValue)) {
                    return AdlsGen2AccountSink.fromJson(readerToUse.reset());
                } else if ("BlobAccount".equals(discriminatorValue)) {
                    return BlobAccountSink.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static Sink fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Sink deserializedSink = new Sink();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("storeReference".equals(fieldName)) {
                    deserializedSink.storeReference = StoreReference.fromJson(reader);
                } else if ("storeKind".equals(fieldName)) {
                    deserializedSink.storeKind = StoreKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSink;
        });
    }
}
