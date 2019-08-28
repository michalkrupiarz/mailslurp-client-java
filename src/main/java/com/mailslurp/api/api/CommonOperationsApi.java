/*
 * MailSlurp API
 * For documentation see [developer guide](https://www.mailslurp.com/developers). [Create an account](https://app.mailslurp.com) in the MailSlurp Dashboard to [view your API Key](https://app). For all bugs, feature requests, or help please [see support](https://www.mailslurp.com/support/).
 *
 * OpenAPI spec version: 0.0.1-alpha
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mailslurp.api.api;

import com.mailslurp.client.ApiCallback;
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.ApiResponse;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.Pair;
import com.mailslurp.client.ProgressRequestBody;
import com.mailslurp.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.mailslurp.models.Email;
import com.mailslurp.models.Inbox;
import com.mailslurp.models.SendEmailOptions;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonOperationsApi {
    private ApiClient apiClient;

    public CommonOperationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CommonOperationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createNewEmailAddress
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createNewEmailAddressCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/newEmailAddress";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createNewEmailAddressValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createNewEmailAddressCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create new email address
     * Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;
     * @return Inbox
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Inbox createNewEmailAddress() throws ApiException {
        ApiResponse<Inbox> resp = createNewEmailAddressWithHttpInfo();
        return resp.getData();
    }

    /**
     * Create new email address
     * Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;
     * @return ApiResponse&lt;Inbox&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Inbox> createNewEmailAddressWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = createNewEmailAddressValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<Inbox>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new email address (asynchronously)
     * Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createNewEmailAddressAsync(final ApiCallback<Inbox> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createNewEmailAddressValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Inbox>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for sendEmailSimple
     * @param sendEmailOptions sendEmailOptions (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call sendEmailSimpleCall(SendEmailOptions sendEmailOptions, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = sendEmailOptions;

        // create path and map variables
        String localVarPath = "/sendEmail";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call sendEmailSimpleValidateBeforeCall(SendEmailOptions sendEmailOptions, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'sendEmailOptions' is set
        if (sendEmailOptions == null) {
            throw new ApiException("Missing the required parameter 'sendEmailOptions' when calling sendEmailSimple(Async)");
        }
        

        com.squareup.okhttp.Call call = sendEmailSimpleCall(sendEmailOptions, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Send an email from a random email address
     * To specify an email address first create an inbox and use that with the other send email methods
     * @param sendEmailOptions sendEmailOptions (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void sendEmailSimple(SendEmailOptions sendEmailOptions) throws ApiException {
        sendEmailSimpleWithHttpInfo(sendEmailOptions);
    }

    /**
     * Send an email from a random email address
     * To specify an email address first create an inbox and use that with the other send email methods
     * @param sendEmailOptions sendEmailOptions (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> sendEmailSimpleWithHttpInfo(SendEmailOptions sendEmailOptions) throws ApiException {
        com.squareup.okhttp.Call call = sendEmailSimpleValidateBeforeCall(sendEmailOptions, null, null);
        return apiClient.execute(call);
    }

    /**
     * Send an email from a random email address (asynchronously)
     * To specify an email address first create an inbox and use that with the other send email methods
     * @param sendEmailOptions sendEmailOptions (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendEmailSimpleAsync(SendEmailOptions sendEmailOptions, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = sendEmailSimpleValidateBeforeCall(sendEmailOptions, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for waitForLatestEmail
     * @param inboxEmailAddress Email address of the inbox we are fetching emails from (optional)
     * @param inboxId Id of the inbox we are fetching emails from (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call waitForLatestEmailCall(String inboxEmailAddress, UUID inboxId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fetchLatestEmail";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (inboxEmailAddress != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("inboxEmailAddress", inboxEmailAddress));
        }

        if (inboxId != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("inboxId", inboxId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call waitForLatestEmailValidateBeforeCall(String inboxEmailAddress, UUID inboxId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = waitForLatestEmailCall(inboxEmailAddress, inboxId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch inbox&#39;s latest email or if empty wait for email to arrive
     * Will return either the last received email or wait for an email to arrive and return that. If you need to wait for an email for a non-empty inbox see the other receive methods.
     * @param inboxEmailAddress Email address of the inbox we are fetching emails from (optional)
     * @param inboxId Id of the inbox we are fetching emails from (optional)
     * @return Email
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Email waitForLatestEmail(String inboxEmailAddress, UUID inboxId) throws ApiException {
        ApiResponse<Email> resp = waitForLatestEmailWithHttpInfo(inboxEmailAddress, inboxId);
        return resp.getData();
    }

    /**
     * Fetch inbox&#39;s latest email or if empty wait for email to arrive
     * Will return either the last received email or wait for an email to arrive and return that. If you need to wait for an email for a non-empty inbox see the other receive methods.
     * @param inboxEmailAddress Email address of the inbox we are fetching emails from (optional)
     * @param inboxId Id of the inbox we are fetching emails from (optional)
     * @return ApiResponse&lt;Email&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Email> waitForLatestEmailWithHttpInfo(String inboxEmailAddress, UUID inboxId) throws ApiException {
        com.squareup.okhttp.Call call = waitForLatestEmailValidateBeforeCall(inboxEmailAddress, inboxId, null, null);
        Type localVarReturnType = new TypeToken<Email>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch inbox&#39;s latest email or if empty wait for email to arrive (asynchronously)
     * Will return either the last received email or wait for an email to arrive and return that. If you need to wait for an email for a non-empty inbox see the other receive methods.
     * @param inboxEmailAddress Email address of the inbox we are fetching emails from (optional)
     * @param inboxId Id of the inbox we are fetching emails from (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call waitForLatestEmailAsync(String inboxEmailAddress, UUID inboxId, final ApiCallback<Email> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = waitForLatestEmailValidateBeforeCall(inboxEmailAddress, inboxId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Email>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}