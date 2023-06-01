// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.resourcehealth.models.EventLevelValues;
import com.azure.resourcemanager.resourcehealth.models.EventPropertiesAdditionalInformation;
import com.azure.resourcemanager.resourcehealth.models.EventPropertiesArticle;
import com.azure.resourcemanager.resourcehealth.models.EventPropertiesRecommendedActions;
import com.azure.resourcemanager.resourcehealth.models.EventSourceValues;
import com.azure.resourcemanager.resourcehealth.models.EventStatusValues;
import com.azure.resourcemanager.resourcehealth.models.EventTypeValues;
import com.azure.resourcemanager.resourcehealth.models.Faq;
import com.azure.resourcemanager.resourcehealth.models.Impact;
import com.azure.resourcemanager.resourcehealth.models.LevelValues;
import com.azure.resourcemanager.resourcehealth.models.Link;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Service health event. */
@Fluent
public final class EventInner extends ProxyResource {
    /*
     * Properties of event.
     */
    @JsonProperty(value = "properties")
    private EventProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of EventInner class. */
    public EventInner() {
    }

    /**
     * Get the innerProperties property: Properties of event.
     *
     * @return the innerProperties value.
     */
    private EventProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the eventType property: Type of event.
     *
     * @return the eventType value.
     */
    public EventTypeValues eventType() {
        return this.innerProperties() == null ? null : this.innerProperties().eventType();
    }

    /**
     * Set the eventType property: Type of event.
     *
     * @param eventType the eventType value to set.
     * @return the EventInner object itself.
     */
    public EventInner withEventType(EventTypeValues eventType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withEventType(eventType);
        return this;
    }

    /**
     * Get the eventSource property: Source of event.
     *
     * @return the eventSource value.
     */
    public EventSourceValues eventSource() {
        return this.innerProperties() == null ? null : this.innerProperties().eventSource();
    }

    /**
     * Set the eventSource property: Source of event.
     *
     * @param eventSource the eventSource value to set.
     * @return the EventInner object itself.
     */
    public EventInner withEventSource(EventSourceValues eventSource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withEventSource(eventSource);
        return this;
    }

    /**
     * Get the status property: Current status of event.
     *
     * @return the status value.
     */
    public EventStatusValues status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: Current status of event.
     *
     * @param status the status value to set.
     * @return the EventInner object itself.
     */
    public EventInner withStatus(EventStatusValues status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the title property: Title text of event.
     *
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Set the title property: Title text of event.
     *
     * @param title the title value to set.
     * @return the EventInner object itself.
     */
    public EventInner withTitle(String title) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withTitle(title);
        return this;
    }

    /**
     * Get the summary property: Summary text of event.
     *
     * @return the summary value.
     */
    public String summary() {
        return this.innerProperties() == null ? null : this.innerProperties().summary();
    }

    /**
     * Set the summary property: Summary text of event.
     *
     * @param summary the summary value to set.
     * @return the EventInner object itself.
     */
    public EventInner withSummary(String summary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withSummary(summary);
        return this;
    }

    /**
     * Get the headerProperty property: Header text of event.
     *
     * @return the headerProperty value.
     */
    public String headerProperty() {
        return this.innerProperties() == null ? null : this.innerProperties().headerProperty();
    }

    /**
     * Set the headerProperty property: Header text of event.
     *
     * @param headerProperty the headerProperty value to set.
     * @return the EventInner object itself.
     */
    public EventInner withHeaderProperty(String headerProperty) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withHeaderProperty(headerProperty);
        return this;
    }

    /**
     * Get the level property: Level of insight.
     *
     * @return the level value.
     */
    public LevelValues level() {
        return this.innerProperties() == null ? null : this.innerProperties().level();
    }

    /**
     * Set the level property: Level of insight.
     *
     * @param level the level value to set.
     * @return the EventInner object itself.
     */
    public EventInner withLevel(LevelValues level) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withLevel(level);
        return this;
    }

    /**
     * Get the eventLevel property: Level of event.
     *
     * @return the eventLevel value.
     */
    public EventLevelValues eventLevel() {
        return this.innerProperties() == null ? null : this.innerProperties().eventLevel();
    }

    /**
     * Set the eventLevel property: Level of event.
     *
     * @param eventLevel the eventLevel value to set.
     * @return the EventInner object itself.
     */
    public EventInner withEventLevel(EventLevelValues eventLevel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withEventLevel(eventLevel);
        return this;
    }

    /**
     * Get the externalIncidentId property: The id of the Incident.
     *
     * @return the externalIncidentId value.
     */
    public String externalIncidentId() {
        return this.innerProperties() == null ? null : this.innerProperties().externalIncidentId();
    }

    /**
     * Set the externalIncidentId property: The id of the Incident.
     *
     * @param externalIncidentId the externalIncidentId value to set.
     * @return the EventInner object itself.
     */
    public EventInner withExternalIncidentId(String externalIncidentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withExternalIncidentId(externalIncidentId);
        return this;
    }

    /**
     * Get the reason property: The reason for the Incident.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.innerProperties() == null ? null : this.innerProperties().reason();
    }

    /**
     * Set the reason property: The reason for the Incident.
     *
     * @param reason the reason value to set.
     * @return the EventInner object itself.
     */
    public EventInner withReason(String reason) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withReason(reason);
        return this;
    }

    /**
     * Get the article property: Article of event.
     *
     * @return the article value.
     */
    public EventPropertiesArticle article() {
        return this.innerProperties() == null ? null : this.innerProperties().article();
    }

    /**
     * Set the article property: Article of event.
     *
     * @param article the article value to set.
     * @return the EventInner object itself.
     */
    public EventInner withArticle(EventPropertiesArticle article) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withArticle(article);
        return this;
    }

    /**
     * Get the links property: Useful links of event.
     *
     * @return the links value.
     */
    public List<Link> links() {
        return this.innerProperties() == null ? null : this.innerProperties().links();
    }

    /**
     * Set the links property: Useful links of event.
     *
     * @param links the links value to set.
     * @return the EventInner object itself.
     */
    public EventInner withLinks(List<Link> links) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withLinks(links);
        return this;
    }

    /**
     * Get the impactStartTime property: It provides the Timestamp for when the health impacting event started.
     *
     * @return the impactStartTime value.
     */
    public OffsetDateTime impactStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().impactStartTime();
    }

    /**
     * Set the impactStartTime property: It provides the Timestamp for when the health impacting event started.
     *
     * @param impactStartTime the impactStartTime value to set.
     * @return the EventInner object itself.
     */
    public EventInner withImpactStartTime(OffsetDateTime impactStartTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withImpactStartTime(impactStartTime);
        return this;
    }

    /**
     * Get the impactMitigationTime property: It provides the Timestamp for when the health impacting event resolved.
     *
     * @return the impactMitigationTime value.
     */
    public OffsetDateTime impactMitigationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().impactMitigationTime();
    }

    /**
     * Set the impactMitigationTime property: It provides the Timestamp for when the health impacting event resolved.
     *
     * @param impactMitigationTime the impactMitigationTime value to set.
     * @return the EventInner object itself.
     */
    public EventInner withImpactMitigationTime(OffsetDateTime impactMitigationTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withImpactMitigationTime(impactMitigationTime);
        return this;
    }

    /**
     * Get the impact property: List services impacted by the service health event.
     *
     * @return the impact value.
     */
    public List<Impact> impact() {
        return this.innerProperties() == null ? null : this.innerProperties().impact();
    }

    /**
     * Set the impact property: List services impacted by the service health event.
     *
     * @param impact the impact value to set.
     * @return the EventInner object itself.
     */
    public EventInner withImpact(List<Impact> impact) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withImpact(impact);
        return this;
    }

    /**
     * Get the recommendedActions property: Recommended actions of event.
     *
     * @return the recommendedActions value.
     */
    public EventPropertiesRecommendedActions recommendedActions() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendedActions();
    }

    /**
     * Set the recommendedActions property: Recommended actions of event.
     *
     * @param recommendedActions the recommendedActions value to set.
     * @return the EventInner object itself.
     */
    public EventInner withRecommendedActions(EventPropertiesRecommendedActions recommendedActions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withRecommendedActions(recommendedActions);
        return this;
    }

    /**
     * Get the faqs property: Frequently asked questions for the service health event.
     *
     * @return the faqs value.
     */
    public List<Faq> faqs() {
        return this.innerProperties() == null ? null : this.innerProperties().faqs();
    }

    /**
     * Set the faqs property: Frequently asked questions for the service health event.
     *
     * @param faqs the faqs value to set.
     * @return the EventInner object itself.
     */
    public EventInner withFaqs(List<Faq> faqs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withFaqs(faqs);
        return this;
    }

    /**
     * Get the isHir property: It provides information if the event is High incident rate event or not.
     *
     * @return the isHir value.
     */
    public Boolean isHir() {
        return this.innerProperties() == null ? null : this.innerProperties().isHir();
    }

    /**
     * Set the isHir property: It provides information if the event is High incident rate event or not.
     *
     * @param isHir the isHir value to set.
     * @return the EventInner object itself.
     */
    public EventInner withIsHir(Boolean isHir) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withIsHir(isHir);
        return this;
    }

    /**
     * Get the enableMicrosoftSupport property: Tells if we want to enable or disable Microsoft Support for this event.
     *
     * @return the enableMicrosoftSupport value.
     */
    public Boolean enableMicrosoftSupport() {
        return this.innerProperties() == null ? null : this.innerProperties().enableMicrosoftSupport();
    }

    /**
     * Set the enableMicrosoftSupport property: Tells if we want to enable or disable Microsoft Support for this event.
     *
     * @param enableMicrosoftSupport the enableMicrosoftSupport value to set.
     * @return the EventInner object itself.
     */
    public EventInner withEnableMicrosoftSupport(Boolean enableMicrosoftSupport) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withEnableMicrosoftSupport(enableMicrosoftSupport);
        return this;
    }

    /**
     * Get the description property: Contains the communication message for the event, that could include summary, root
     * cause and other details.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Contains the communication message for the event, that could include summary, root
     * cause and other details.
     *
     * @param description the description value to set.
     * @return the EventInner object itself.
     */
    public EventInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the platformInitiated property: Is true if the event is platform initiated.
     *
     * @return the platformInitiated value.
     */
    public Boolean platformInitiated() {
        return this.innerProperties() == null ? null : this.innerProperties().platformInitiated();
    }

    /**
     * Set the platformInitiated property: Is true if the event is platform initiated.
     *
     * @param platformInitiated the platformInitiated value to set.
     * @return the EventInner object itself.
     */
    public EventInner withPlatformInitiated(Boolean platformInitiated) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withPlatformInitiated(platformInitiated);
        return this;
    }

    /**
     * Get the enableChatWithUs property: Tells if we want to enable or disable Microsoft Support for this event.
     *
     * @return the enableChatWithUs value.
     */
    public Boolean enableChatWithUs() {
        return this.innerProperties() == null ? null : this.innerProperties().enableChatWithUs();
    }

    /**
     * Set the enableChatWithUs property: Tells if we want to enable or disable Microsoft Support for this event.
     *
     * @param enableChatWithUs the enableChatWithUs value to set.
     * @return the EventInner object itself.
     */
    public EventInner withEnableChatWithUs(Boolean enableChatWithUs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withEnableChatWithUs(enableChatWithUs);
        return this;
    }

    /**
     * Get the priority property: Priority level of the event. Has value from 0 to 23. 0 is the highest priority.
     * Service issue events have higher priority followed by planned maintenance and health advisory. Critical events
     * have higher priority followed by error, warning and informational. Furthermore, active events have higher
     * priority than resolved.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Set the priority property: Priority level of the event. Has value from 0 to 23. 0 is the highest priority.
     * Service issue events have higher priority followed by planned maintenance and health advisory. Critical events
     * have higher priority followed by error, warning and informational. Furthermore, active events have higher
     * priority than resolved.
     *
     * @param priority the priority value to set.
     * @return the EventInner object itself.
     */
    public EventInner withPriority(Integer priority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withPriority(priority);
        return this;
    }

    /**
     * Get the lastUpdateTime property: It provides the Timestamp for when the health impacting event was last updated.
     *
     * @return the lastUpdateTime value.
     */
    public OffsetDateTime lastUpdateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdateTime();
    }

    /**
     * Set the lastUpdateTime property: It provides the Timestamp for when the health impacting event was last updated.
     *
     * @param lastUpdateTime the lastUpdateTime value to set.
     * @return the EventInner object itself.
     */
    public EventInner withLastUpdateTime(OffsetDateTime lastUpdateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * Get the hirStage property: Stage for HIR Document.
     *
     * @return the hirStage value.
     */
    public String hirStage() {
        return this.innerProperties() == null ? null : this.innerProperties().hirStage();
    }

    /**
     * Set the hirStage property: Stage for HIR Document.
     *
     * @param hirStage the hirStage value to set.
     * @return the EventInner object itself.
     */
    public EventInner withHirStage(String hirStage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withHirStage(hirStage);
        return this;
    }

    /**
     * Get the additionalInformation property: Additional information.
     *
     * @return the additionalInformation value.
     */
    public EventPropertiesAdditionalInformation additionalInformation() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalInformation();
    }

    /**
     * Set the additionalInformation property: Additional information.
     *
     * @param additionalInformation the additionalInformation value to set.
     * @return the EventInner object itself.
     */
    public EventInner withAdditionalInformation(EventPropertiesAdditionalInformation additionalInformation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withAdditionalInformation(additionalInformation);
        return this;
    }

    /**
     * Get the duration property: duration in seconds.
     *
     * @return the duration value.
     */
    public Integer duration() {
        return this.innerProperties() == null ? null : this.innerProperties().duration();
    }

    /**
     * Set the duration property: duration in seconds.
     *
     * @param duration the duration value to set.
     * @return the EventInner object itself.
     */
    public EventInner withDuration(Integer duration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withDuration(duration);
        return this;
    }

    /**
     * Get the impactType property: The type of the impact.
     *
     * @return the impactType value.
     */
    public String impactType() {
        return this.innerProperties() == null ? null : this.innerProperties().impactType();
    }

    /**
     * Set the impactType property: The type of the impact.
     *
     * @param impactType the impactType value to set.
     * @return the EventInner object itself.
     */
    public EventInner withImpactType(String impactType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withImpactType(impactType);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}