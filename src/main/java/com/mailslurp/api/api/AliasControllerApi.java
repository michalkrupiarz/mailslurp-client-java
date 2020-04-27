/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: d1659dc1567a5b62f65d0612107a50aace03e085
 * 
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


import com.mailslurp.models.Alias;
import com.mailslurp.models.CreateAnonymousAliasOptions;
import com.mailslurp.models.CreateOwnedAliasOptions;
import com.mailslurp.models.PageAlias;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AliasControllerApi {
    private ApiClient localVarApiClient;

    public AliasControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AliasControllerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createAlias
     * @param createOwnedAliasOptions createOwnedAliasOptions (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAliasCall(CreateOwnedAliasOptions createOwnedAliasOptions, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createOwnedAliasOptions;

        // create path and map variables
        String localVarPath = "/aliases";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createAliasValidateBeforeCall(CreateOwnedAliasOptions createOwnedAliasOptions, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'createOwnedAliasOptions' is set
        if (createOwnedAliasOptions == null) {
            throw new ApiException("Missing the required parameter 'createOwnedAliasOptions' when calling createAlias(Async)");
        }
        

        okhttp3.Call localVarCall = createAliasCall(createOwnedAliasOptions, _callback);
        return localVarCall;

    }

    /**
     * Create an email alias
     * Create an email alias belonging to a user ID. To create anonymous aliases use the &#x60;createAnonymousAlias&#x60; method.
     * @param createOwnedAliasOptions createOwnedAliasOptions (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public void createAlias(CreateOwnedAliasOptions createOwnedAliasOptions) throws ApiException {
        createAliasWithHttpInfo(createOwnedAliasOptions);
    }

    /**
     * Create an email alias
     * Create an email alias belonging to a user ID. To create anonymous aliases use the &#x60;createAnonymousAlias&#x60; method.
     * @param createOwnedAliasOptions createOwnedAliasOptions (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> createAliasWithHttpInfo(CreateOwnedAliasOptions createOwnedAliasOptions) throws ApiException {
        okhttp3.Call localVarCall = createAliasValidateBeforeCall(createOwnedAliasOptions, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Create an email alias (asynchronously)
     * Create an email alias belonging to a user ID. To create anonymous aliases use the &#x60;createAnonymousAlias&#x60; method.
     * @param createOwnedAliasOptions createOwnedAliasOptions (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAliasAsync(CreateOwnedAliasOptions createOwnedAliasOptions, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAliasValidateBeforeCall(createOwnedAliasOptions, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for createAnonymousAlias
     * @param createAnonymousAliasOptions createAnonymousAliasOptions (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAnonymousAliasCall(CreateAnonymousAliasOptions createAnonymousAliasOptions, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createAnonymousAliasOptions;

        // create path and map variables
        String localVarPath = "/aliases/anonymous";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createAnonymousAliasValidateBeforeCall(CreateAnonymousAliasOptions createAnonymousAliasOptions, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'createAnonymousAliasOptions' is set
        if (createAnonymousAliasOptions == null) {
            throw new ApiException("Missing the required parameter 'createAnonymousAliasOptions' when calling createAnonymousAlias(Async)");
        }
        

        okhttp3.Call localVarCall = createAnonymousAliasCall(createAnonymousAliasOptions, _callback);
        return localVarCall;

    }

    /**
     * Create an anonymous email alias
     * 
     * @param createAnonymousAliasOptions createAnonymousAliasOptions (required)
     * @return Alias
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public Alias createAnonymousAlias(CreateAnonymousAliasOptions createAnonymousAliasOptions) throws ApiException {
        ApiResponse<Alias> localVarResp = createAnonymousAliasWithHttpInfo(createAnonymousAliasOptions);
        return localVarResp.getData();
    }

    /**
     * Create an anonymous email alias
     * 
     * @param createAnonymousAliasOptions createAnonymousAliasOptions (required)
     * @return ApiResponse&lt;Alias&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Alias> createAnonymousAliasWithHttpInfo(CreateAnonymousAliasOptions createAnonymousAliasOptions) throws ApiException {
        okhttp3.Call localVarCall = createAnonymousAliasValidateBeforeCall(createAnonymousAliasOptions, null);
        Type localVarReturnType = new TypeToken<Alias>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create an anonymous email alias (asynchronously)
     * 
     * @param createAnonymousAliasOptions createAnonymousAliasOptions (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAnonymousAliasAsync(CreateAnonymousAliasOptions createAnonymousAliasOptions, final ApiCallback<Alias> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAnonymousAliasValidateBeforeCall(createAnonymousAliasOptions, _callback);
        Type localVarReturnType = new TypeToken<Alias>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteAlias
     * @param aliasId aliasId (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAliasCall(UUID aliasId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/aliases/{aliasId}"
            .replaceAll("\\{" + "aliasId" + "\\}", localVarApiClient.escapeString(aliasId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteAliasValidateBeforeCall(UUID aliasId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'aliasId' is set
        if (aliasId == null) {
            throw new ApiException("Missing the required parameter 'aliasId' when calling deleteAlias(Async)");
        }
        

        okhttp3.Call localVarCall = deleteAliasCall(aliasId, _callback);
        return localVarCall;

    }

    /**
     * Delete an owned alias
     * 
     * @param aliasId aliasId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public void deleteAlias(UUID aliasId) throws ApiException {
        deleteAliasWithHttpInfo(aliasId);
    }

    /**
     * Delete an owned alias
     * 
     * @param aliasId aliasId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteAliasWithHttpInfo(UUID aliasId) throws ApiException {
        okhttp3.Call localVarCall = deleteAliasValidateBeforeCall(aliasId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete an owned alias (asynchronously)
     * 
     * @param aliasId aliasId (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAliasAsync(UUID aliasId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteAliasValidateBeforeCall(aliasId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAlias
     * @param aliasId aliasId (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAliasCall(UUID aliasId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/aliases/{aliasId}"
            .replaceAll("\\{" + "aliasId" + "\\}", localVarApiClient.escapeString(aliasId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAliasValidateBeforeCall(UUID aliasId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'aliasId' is set
        if (aliasId == null) {
            throw new ApiException("Missing the required parameter 'aliasId' when calling getAlias(Async)");
        }
        

        okhttp3.Call localVarCall = getAliasCall(aliasId, _callback);
        return localVarCall;

    }

    /**
     * Get an email alias
     * Get an email alias by ID
     * @param aliasId aliasId (required)
     * @return Alias
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public Alias getAlias(UUID aliasId) throws ApiException {
        ApiResponse<Alias> localVarResp = getAliasWithHttpInfo(aliasId);
        return localVarResp.getData();
    }

    /**
     * Get an email alias
     * Get an email alias by ID
     * @param aliasId aliasId (required)
     * @return ApiResponse&lt;Alias&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Alias> getAliasWithHttpInfo(UUID aliasId) throws ApiException {
        okhttp3.Call localVarCall = getAliasValidateBeforeCall(aliasId, null);
        Type localVarReturnType = new TypeToken<Alias>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get an email alias (asynchronously)
     * Get an email alias by ID
     * @param aliasId aliasId (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAliasAsync(UUID aliasId, final ApiCallback<Alias> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAliasValidateBeforeCall(aliasId, _callback);
        Type localVarReturnType = new TypeToken<Alias>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAliases
     * @param page Optional page index in alias list pagination (optional, default to 0)
     * @param size Optional page size in alias list pagination (optional, default to 20)
     * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAliasesCall(Integer page, Integer size, String sort, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/aliases";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAliasesValidateBeforeCall(Integer page, Integer size, String sort, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAliasesCall(page, size, sort, _callback);
        return localVarCall;

    }

    /**
     * Get all email aliases
     * Get all email aliases in paginated form
     * @param page Optional page index in alias list pagination (optional, default to 0)
     * @param size Optional page size in alias list pagination (optional, default to 20)
     * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
     * @return PageAlias
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public PageAlias getAliases(Integer page, Integer size, String sort) throws ApiException {
        ApiResponse<PageAlias> localVarResp = getAliasesWithHttpInfo(page, size, sort);
        return localVarResp.getData();
    }

    /**
     * Get all email aliases
     * Get all email aliases in paginated form
     * @param page Optional page index in alias list pagination (optional, default to 0)
     * @param size Optional page size in alias list pagination (optional, default to 20)
     * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
     * @return ApiResponse&lt;PageAlias&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PageAlias> getAliasesWithHttpInfo(Integer page, Integer size, String sort) throws ApiException {
        okhttp3.Call localVarCall = getAliasesValidateBeforeCall(page, size, sort, null);
        Type localVarReturnType = new TypeToken<PageAlias>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all email aliases (asynchronously)
     * Get all email aliases in paginated form
     * @param page Optional page index in alias list pagination (optional, default to 0)
     * @param size Optional page size in alias list pagination (optional, default to 20)
     * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAliasesAsync(Integer page, Integer size, String sort, final ApiCallback<PageAlias> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAliasesValidateBeforeCall(page, size, sort, _callback);
        Type localVarReturnType = new TypeToken<PageAlias>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateAlias
     * @param aliasId aliasId (required)
     * @param createOwnedAliasOptions createOwnedAliasOptions (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAliasCall(UUID aliasId, CreateOwnedAliasOptions createOwnedAliasOptions, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createOwnedAliasOptions;

        // create path and map variables
        String localVarPath = "/aliases/{aliasId}"
            .replaceAll("\\{" + "aliasId" + "\\}", localVarApiClient.escapeString(aliasId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateAliasValidateBeforeCall(UUID aliasId, CreateOwnedAliasOptions createOwnedAliasOptions, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'aliasId' is set
        if (aliasId == null) {
            throw new ApiException("Missing the required parameter 'aliasId' when calling updateAlias(Async)");
        }
        
        // verify the required parameter 'createOwnedAliasOptions' is set
        if (createOwnedAliasOptions == null) {
            throw new ApiException("Missing the required parameter 'createOwnedAliasOptions' when calling updateAlias(Async)");
        }
        

        okhttp3.Call localVarCall = updateAliasCall(aliasId, createOwnedAliasOptions, _callback);
        return localVarCall;

    }

    /**
     * Update an owned alias
     * 
     * @param aliasId aliasId (required)
     * @param createOwnedAliasOptions createOwnedAliasOptions (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public void updateAlias(UUID aliasId, CreateOwnedAliasOptions createOwnedAliasOptions) throws ApiException {
        updateAliasWithHttpInfo(aliasId, createOwnedAliasOptions);
    }

    /**
     * Update an owned alias
     * 
     * @param aliasId aliasId (required)
     * @param createOwnedAliasOptions createOwnedAliasOptions (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateAliasWithHttpInfo(UUID aliasId, CreateOwnedAliasOptions createOwnedAliasOptions) throws ApiException {
        okhttp3.Call localVarCall = updateAliasValidateBeforeCall(aliasId, createOwnedAliasOptions, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update an owned alias (asynchronously)
     * 
     * @param aliasId aliasId (required)
     * @param createOwnedAliasOptions createOwnedAliasOptions (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAliasAsync(UUID aliasId, CreateOwnedAliasOptions createOwnedAliasOptions, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateAliasValidateBeforeCall(aliasId, createOwnedAliasOptions, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}