// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Live Pipeline represents an unique instance of a pipeline topology which is used for real-time content ingestion and
 * analysis.
 */
@Fluent
public class LivePipeline implements JsonSerializable<LivePipeline> {
    /*
     * Live pipeline unique identifier.
     */
    private final String name;

    /*
     * Read-only system metadata associated with this object.
     */
    private SystemData systemData;

    /*
     * Live pipeline properties.
     */
    private LivePipelineProperties properties;

    /**
     * Creates an instance of LivePipeline class.
     * 
     * @param name the name value to set.
     */
    public LivePipeline(String name) {
        this.name = name;
    }

    /**
     * Get the name property: Live pipeline unique identifier.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the systemData property: Read-only system metadata associated with this object.
     * 
     * @return the systemData value.
     */
    public SystemData getSystemData() {
        return this.systemData;
    }

    /**
     * Set the systemData property: Read-only system metadata associated with this object.
     * 
     * @param systemData the systemData value to set.
     * @return the LivePipeline object itself.
     */
    public LivePipeline setSystemData(SystemData systemData) {
        this.systemData = systemData;
        return this;
    }

    /**
     * Get the properties property: Live pipeline properties.
     * 
     * @return the properties value.
     */
    public LivePipelineProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Live pipeline properties.
     * 
     * @param properties the properties value to set.
     * @return the LivePipeline object itself.
     */
    public LivePipeline setProperties(LivePipelineProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("systemData", this.systemData);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LivePipeline from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LivePipeline if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LivePipeline.
     */
    public static LivePipeline fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            SystemData systemData = null;
            LivePipelineProperties properties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("systemData".equals(fieldName)) {
                    systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    properties = LivePipelineProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound) {
                LivePipeline deserializedLivePipeline = new LivePipeline(name);
                deserializedLivePipeline.systemData = systemData;
                deserializedLivePipeline.properties = properties;

                return deserializedLivePipeline;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }
}
