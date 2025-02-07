// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * SAPHana specific recoverypoint, specifically encapsulates full/diff recoverypoints.
 */
@Fluent
public final class AzureWorkloadSapHanaRecoveryPoint extends AzureWorkloadRecoveryPoint {
    /*
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of
     * types.
     */
    private String objectType = "AzureWorkloadSAPHanaRecoveryPoint";

    /**
     * Creates an instance of AzureWorkloadSapHanaRecoveryPoint class.
     */
    public AzureWorkloadSapHanaRecoveryPoint() {
    }

    /**
     * Get the objectType property: This property will be used as the discriminator for deciding the specific types in
     * the polymorphic chain of types.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSapHanaRecoveryPoint withRecoveryPointTimeInUtc(OffsetDateTime recoveryPointTimeInUtc) {
        super.withRecoveryPointTimeInUtc(recoveryPointTimeInUtc);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSapHanaRecoveryPoint withType(RestorePointType type) {
        super.withType(type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSapHanaRecoveryPoint
        withRecoveryPointTierDetails(List<RecoveryPointTierInformationV2> recoveryPointTierDetails) {
        super.withRecoveryPointTierDetails(recoveryPointTierDetails);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSapHanaRecoveryPoint
        withRecoveryPointMoveReadinessInfo(Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo) {
        super.withRecoveryPointMoveReadinessInfo(recoveryPointMoveReadinessInfo);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSapHanaRecoveryPoint
        withRecoveryPointProperties(RecoveryPointProperties recoveryPointProperties) {
        super.withRecoveryPointProperties(recoveryPointProperties);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (recoveryPointTierDetails() != null) {
            recoveryPointTierDetails().forEach(e -> e.validate());
        }
        if (recoveryPointMoveReadinessInfo() != null) {
            recoveryPointMoveReadinessInfo().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (recoveryPointProperties() != null) {
            recoveryPointProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("recoveryPointTimeInUTC",
            recoveryPointTimeInUtc() == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(recoveryPointTimeInUtc()));
        jsonWriter.writeStringField("type", type() == null ? null : type().toString());
        jsonWriter.writeArrayField("recoveryPointTierDetails", recoveryPointTierDetails(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeMapField("recoveryPointMoveReadinessInfo", recoveryPointMoveReadinessInfo(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("recoveryPointProperties", recoveryPointProperties());
        jsonWriter.writeStringField("objectType", this.objectType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureWorkloadSapHanaRecoveryPoint from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureWorkloadSapHanaRecoveryPoint if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureWorkloadSapHanaRecoveryPoint.
     */
    public static AzureWorkloadSapHanaRecoveryPoint fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureWorkloadSapHanaRecoveryPoint deserializedAzureWorkloadSapHanaRecoveryPoint
                = new AzureWorkloadSapHanaRecoveryPoint();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("recoveryPointTimeInUTC".equals(fieldName)) {
                    deserializedAzureWorkloadSapHanaRecoveryPoint.withRecoveryPointTimeInUtc(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("type".equals(fieldName)) {
                    deserializedAzureWorkloadSapHanaRecoveryPoint
                        .withType(RestorePointType.fromString(reader.getString()));
                } else if ("recoveryPointTierDetails".equals(fieldName)) {
                    List<RecoveryPointTierInformationV2> recoveryPointTierDetails
                        = reader.readArray(reader1 -> RecoveryPointTierInformationV2.fromJson(reader1));
                    deserializedAzureWorkloadSapHanaRecoveryPoint
                        .withRecoveryPointTierDetails(recoveryPointTierDetails);
                } else if ("recoveryPointMoveReadinessInfo".equals(fieldName)) {
                    Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo
                        = reader.readMap(reader1 -> RecoveryPointMoveReadinessInfo.fromJson(reader1));
                    deserializedAzureWorkloadSapHanaRecoveryPoint
                        .withRecoveryPointMoveReadinessInfo(recoveryPointMoveReadinessInfo);
                } else if ("recoveryPointProperties".equals(fieldName)) {
                    deserializedAzureWorkloadSapHanaRecoveryPoint
                        .withRecoveryPointProperties(RecoveryPointProperties.fromJson(reader));
                } else if ("objectType".equals(fieldName)) {
                    deserializedAzureWorkloadSapHanaRecoveryPoint.objectType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureWorkloadSapHanaRecoveryPoint;
        });
    }
}
