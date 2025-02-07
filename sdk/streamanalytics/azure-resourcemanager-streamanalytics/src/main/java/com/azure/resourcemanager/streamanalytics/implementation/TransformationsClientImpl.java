// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.streamanalytics.fluent.TransformationsClient;
import com.azure.resourcemanager.streamanalytics.fluent.models.TransformationInner;
import com.azure.resourcemanager.streamanalytics.models.TransformationsCreateOrReplaceResponse;
import com.azure.resourcemanager.streamanalytics.models.TransformationsGetResponse;
import com.azure.resourcemanager.streamanalytics.models.TransformationsUpdateResponse;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in TransformationsClient.
 */
public final class TransformationsClientImpl implements TransformationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final TransformationsService service;

    /**
     * The service client containing this operation class.
     */
    private final StreamAnalyticsManagementClientImpl client;

    /**
     * Initializes an instance of TransformationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    TransformationsClientImpl(StreamAnalyticsManagementClientImpl client) {
        this.service
            = RestProxy.create(TransformationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StreamAnalyticsManagementClientTransformations to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StreamAnalyticsManag")
    public interface TransformationsService {
        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.StreamAnalytics/streamingjobs/{jobName}/transformations/{transformationName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<TransformationsCreateOrReplaceResponse> createOrReplace(@HostParam("$host") String endpoint,
            @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("jobName") String jobName,
            @PathParam("transformationName") String transformationName,
            @BodyParam("application/json") TransformationInner transformation, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.StreamAnalytics/streamingjobs/{jobName}/transformations/{transformationName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<TransformationsUpdateResponse> update(@HostParam("$host") String endpoint,
            @HeaderParam("If-Match") String ifMatch, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("jobName") String jobName,
            @PathParam("transformationName") String transformationName,
            @BodyParam("application/json") TransformationInner transformation, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.StreamAnalytics/streamingjobs/{jobName}/transformations/{transformationName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<TransformationsGetResponse> get(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("jobName") String jobName,
            @PathParam("transformationName") String transformationName, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Creates a transformation or replaces an already existing transformation under an existing streaming job.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param transformation The definition of the transformation that will be used to create a new transformation or
     * replace the existing one under the streaming job.
     * @param ifMatch The ETag of the transformation. Omit this value to always overwrite the current transformation.
     * Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new transformation to be created, but to prevent updating an existing
     * transformation. Other values will result in a 412 Pre-condition Failed response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a transformation object, containing all information associated with the named transformation on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TransformationsCreateOrReplaceResponse> createOrReplaceWithResponseAsync(String resourceGroupName,
        String jobName, String transformationName, TransformationInner transformation, String ifMatch,
        String ifNoneMatch) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (jobName == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobName is required and cannot be null."));
        }
        if (transformationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter transformationName is required and cannot be null."));
        }
        if (transformation == null) {
            return Mono.error(new IllegalArgumentException("Parameter transformation is required and cannot be null."));
        } else {
            transformation.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.createOrReplace(this.client.getEndpoint(), ifMatch, ifNoneMatch,
                this.client.getApiVersion(), this.client.getSubscriptionId(), resourceGroupName, jobName,
                transformationName, transformation, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Creates a transformation or replaces an already existing transformation under an existing streaming job.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param transformation The definition of the transformation that will be used to create a new transformation or
     * replace the existing one under the streaming job.
     * @param ifMatch The ETag of the transformation. Omit this value to always overwrite the current transformation.
     * Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new transformation to be created, but to prevent updating an existing
     * transformation. Other values will result in a 412 Pre-condition Failed response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a transformation object, containing all information associated with the named transformation on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TransformationsCreateOrReplaceResponse> createOrReplaceWithResponseAsync(String resourceGroupName,
        String jobName, String transformationName, TransformationInner transformation, String ifMatch,
        String ifNoneMatch, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (jobName == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobName is required and cannot be null."));
        }
        if (transformationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter transformationName is required and cannot be null."));
        }
        if (transformation == null) {
            return Mono.error(new IllegalArgumentException("Parameter transformation is required and cannot be null."));
        } else {
            transformation.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.createOrReplace(this.client.getEndpoint(), ifMatch, ifNoneMatch, this.client.getApiVersion(),
            this.client.getSubscriptionId(), resourceGroupName, jobName, transformationName, transformation, accept,
            context);
    }

    /**
     * Creates a transformation or replaces an already existing transformation under an existing streaming job.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param transformation The definition of the transformation that will be used to create a new transformation or
     * replace the existing one under the streaming job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a transformation object, containing all information associated with the named transformation on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TransformationInner> createOrReplaceAsync(String resourceGroupName, String jobName,
        String transformationName, TransformationInner transformation) {
        final String ifMatch = null;
        final String ifNoneMatch = null;
        return createOrReplaceWithResponseAsync(resourceGroupName, jobName, transformationName, transformation, ifMatch,
            ifNoneMatch).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Creates a transformation or replaces an already existing transformation under an existing streaming job.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param transformation The definition of the transformation that will be used to create a new transformation or
     * replace the existing one under the streaming job.
     * @param ifMatch The ETag of the transformation. Omit this value to always overwrite the current transformation.
     * Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new transformation to be created, but to prevent updating an existing
     * transformation. Other values will result in a 412 Pre-condition Failed response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a transformation object, containing all information associated with the named transformation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TransformationsCreateOrReplaceResponse createOrReplaceWithResponse(String resourceGroupName, String jobName,
        String transformationName, TransformationInner transformation, String ifMatch, String ifNoneMatch,
        Context context) {
        return createOrReplaceWithResponseAsync(resourceGroupName, jobName, transformationName, transformation, ifMatch,
            ifNoneMatch, context).block();
    }

    /**
     * Creates a transformation or replaces an already existing transformation under an existing streaming job.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param transformation The definition of the transformation that will be used to create a new transformation or
     * replace the existing one under the streaming job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a transformation object, containing all information associated with the named transformation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TransformationInner createOrReplace(String resourceGroupName, String jobName, String transformationName,
        TransformationInner transformation) {
        final String ifMatch = null;
        final String ifNoneMatch = null;
        return createOrReplaceWithResponse(resourceGroupName, jobName, transformationName, transformation, ifMatch,
            ifNoneMatch, Context.NONE).getValue();
    }

    /**
     * Updates an existing transformation under an existing streaming job. This can be used to partially update (ie.
     * update one or two properties) a transformation without affecting the rest the job or transformation definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param transformation A Transformation object. The properties specified here will overwrite the corresponding
     * properties in the existing transformation (ie. Those properties will be updated). Any properties that are set to
     * null here will mean that the corresponding property in the existing transformation will remain the same and not
     * change as a result of this PATCH operation.
     * @param ifMatch The ETag of the transformation. Omit this value to always overwrite the current transformation.
     * Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a transformation object, containing all information associated with the named transformation on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TransformationsUpdateResponse> updateWithResponseAsync(String resourceGroupName, String jobName,
        String transformationName, TransformationInner transformation, String ifMatch) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (jobName == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobName is required and cannot be null."));
        }
        if (transformationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter transformationName is required and cannot be null."));
        }
        if (transformation == null) {
            return Mono.error(new IllegalArgumentException("Parameter transformation is required and cannot be null."));
        } else {
            transformation.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.update(this.client.getEndpoint(), ifMatch, this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, jobName, transformationName, transformation, accept,
                context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Updates an existing transformation under an existing streaming job. This can be used to partially update (ie.
     * update one or two properties) a transformation without affecting the rest the job or transformation definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param transformation A Transformation object. The properties specified here will overwrite the corresponding
     * properties in the existing transformation (ie. Those properties will be updated). Any properties that are set to
     * null here will mean that the corresponding property in the existing transformation will remain the same and not
     * change as a result of this PATCH operation.
     * @param ifMatch The ETag of the transformation. Omit this value to always overwrite the current transformation.
     * Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a transformation object, containing all information associated with the named transformation on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TransformationsUpdateResponse> updateWithResponseAsync(String resourceGroupName, String jobName,
        String transformationName, TransformationInner transformation, String ifMatch, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (jobName == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobName is required and cannot be null."));
        }
        if (transformationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter transformationName is required and cannot be null."));
        }
        if (transformation == null) {
            return Mono.error(new IllegalArgumentException("Parameter transformation is required and cannot be null."));
        } else {
            transformation.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.update(this.client.getEndpoint(), ifMatch, this.client.getApiVersion(),
            this.client.getSubscriptionId(), resourceGroupName, jobName, transformationName, transformation, accept,
            context);
    }

    /**
     * Updates an existing transformation under an existing streaming job. This can be used to partially update (ie.
     * update one or two properties) a transformation without affecting the rest the job or transformation definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param transformation A Transformation object. The properties specified here will overwrite the corresponding
     * properties in the existing transformation (ie. Those properties will be updated). Any properties that are set to
     * null here will mean that the corresponding property in the existing transformation will remain the same and not
     * change as a result of this PATCH operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a transformation object, containing all information associated with the named transformation on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TransformationInner> updateAsync(String resourceGroupName, String jobName, String transformationName,
        TransformationInner transformation) {
        final String ifMatch = null;
        return updateWithResponseAsync(resourceGroupName, jobName, transformationName, transformation, ifMatch)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Updates an existing transformation under an existing streaming job. This can be used to partially update (ie.
     * update one or two properties) a transformation without affecting the rest the job or transformation definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param transformation A Transformation object. The properties specified here will overwrite the corresponding
     * properties in the existing transformation (ie. Those properties will be updated). Any properties that are set to
     * null here will mean that the corresponding property in the existing transformation will remain the same and not
     * change as a result of this PATCH operation.
     * @param ifMatch The ETag of the transformation. Omit this value to always overwrite the current transformation.
     * Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a transformation object, containing all information associated with the named transformation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TransformationsUpdateResponse updateWithResponse(String resourceGroupName, String jobName,
        String transformationName, TransformationInner transformation, String ifMatch, Context context) {
        return updateWithResponseAsync(resourceGroupName, jobName, transformationName, transformation, ifMatch, context)
            .block();
    }

    /**
     * Updates an existing transformation under an existing streaming job. This can be used to partially update (ie.
     * update one or two properties) a transformation without affecting the rest the job or transformation definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param transformation A Transformation object. The properties specified here will overwrite the corresponding
     * properties in the existing transformation (ie. Those properties will be updated). Any properties that are set to
     * null here will mean that the corresponding property in the existing transformation will remain the same and not
     * change as a result of this PATCH operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a transformation object, containing all information associated with the named transformation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TransformationInner update(String resourceGroupName, String jobName, String transformationName,
        TransformationInner transformation) {
        final String ifMatch = null;
        return updateWithResponse(resourceGroupName, jobName, transformationName, transformation, ifMatch, Context.NONE)
            .getValue();
    }

    /**
     * Gets details about the specified transformation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified transformation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TransformationsGetResponse> getWithResponseAsync(String resourceGroupName, String jobName,
        String transformationName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (jobName == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobName is required and cannot be null."));
        }
        if (transformationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter transformationName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, jobName, transformationName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets details about the specified transformation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified transformation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TransformationsGetResponse> getWithResponseAsync(String resourceGroupName, String jobName,
        String transformationName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (jobName == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobName is required and cannot be null."));
        }
        if (transformationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter transformationName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            resourceGroupName, jobName, transformationName, accept, context);
    }

    /**
     * Gets details about the specified transformation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified transformation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TransformationInner> getAsync(String resourceGroupName, String jobName, String transformationName) {
        return getWithResponseAsync(resourceGroupName, jobName, transformationName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets details about the specified transformation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified transformation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TransformationsGetResponse getWithResponse(String resourceGroupName, String jobName,
        String transformationName, Context context) {
        return getWithResponseAsync(resourceGroupName, jobName, transformationName, context).block();
    }

    /**
     * Gets details about the specified transformation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified transformation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TransformationInner get(String resourceGroupName, String jobName, String transformationName) {
        return getWithResponse(resourceGroupName, jobName, transformationName, Context.NONE).getValue();
    }
}
