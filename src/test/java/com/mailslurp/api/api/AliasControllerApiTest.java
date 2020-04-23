/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: beb7302db3b2458f4bba957b81a42c95e2289b11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mailslurp.api.api;

import com.mailslurp.client.ApiException;
import com.mailslurp.models.Alias;
import com.mailslurp.models.CreateAnonymousAliasOptions;
import com.mailslurp.models.CreateOwnedAliasOptions;
import com.mailslurp.models.PageAlias;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AliasControllerApi
 */
@Ignore
public class AliasControllerApiTest {

    private final AliasControllerApi api = new AliasControllerApi();

    
    /**
     * Create an email alias
     *
     * Create an email alias belonging to a user ID. To create anonymous aliases use the &#x60;createAnonymousAlias&#x60; method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAliasTest() throws ApiException {
        CreateOwnedAliasOptions createOwnedAliasOptions = null;
        api.createAlias(createOwnedAliasOptions);

        // TODO: test validations
    }
    
    /**
     * Create an anonymous email alias
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAnonymousAliasTest() throws ApiException {
        CreateAnonymousAliasOptions createAnonymousAliasOptions = null;
        Alias response = api.createAnonymousAlias(createAnonymousAliasOptions);

        // TODO: test validations
    }
    
    /**
     * Delete an owned alias
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAliasTest() throws ApiException {
        UUID aliasId = null;
        api.deleteAlias(aliasId);

        // TODO: test validations
    }
    
    /**
     * Get an email alias
     *
     * Get an email alias by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAliasTest() throws ApiException {
        UUID aliasId = null;
        Alias response = api.getAlias(aliasId);

        // TODO: test validations
    }
    
    /**
     * Get all email aliases
     *
     * Get all email aliases in paginated form
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAliasesTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String sort = null;
        PageAlias response = api.getAliases(page, size, sort);

        // TODO: test validations
    }
    
    /**
     * Update an owned alias
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAliasTest() throws ApiException {
        UUID aliasId = null;
        CreateOwnedAliasOptions createOwnedAliasOptions = null;
        api.updateAlias(aliasId, createOwnedAliasOptions);

        // TODO: test validations
    }
    
}
