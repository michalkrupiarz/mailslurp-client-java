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

import com.mailslurp.client.ApiException;
import com.mailslurp.models.Email;
import com.mailslurp.models.EmailPreview;
import com.mailslurp.models.MatchOptions;
import java.util.UUID;
import com.mailslurp.models.WaitForConditions;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WaitForControllerApi
 */
@Ignore
public class WaitForControllerApiTest {

    private final WaitForControllerApi api = new WaitForControllerApi();

    
    /**
     * Wait for conditions to be met
     *
     * Generic waitFor method that will wait until an inbox meets given conditions or return immediately if already met
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void waitForTest() throws ApiException {
        WaitForConditions waitForConditions = null;
        List<EmailPreview> response = api.waitFor(waitForConditions);

        // TODO: test validations
    }
    
    /**
     * Wait for and return count number of emails 
     *
     * If inbox contains count or more emails at time of request then return count worth of emails. If not wait until the count is reached and return those or return an error if timeout is exceeded.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void waitForEmailCountTest() throws ApiException {
        Integer count = null;
        UUID inboxId = null;
        Long timeout = null;
        Boolean unreadOnly = null;
        List<EmailPreview> response = api.waitForEmailCount(count, inboxId, timeout, unreadOnly);

        // TODO: test validations
    }
    
    /**
     * Fetch inbox&#39;s latest email or if empty wait for an email to arrive
     *
     * Will return either the last received email or wait for an email to arrive and return that. If you need to wait for an email for a non-empty inbox set &#x60;unreadOnly&#x3D;true&#x60; or see the other receive methods such as &#x60;waitForNthEmail&#x60; or &#x60;waitForEmailCount&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void waitForLatestEmailTest() throws ApiException {
        UUID inboxId = null;
        Long timeout = null;
        Boolean unreadOnly = null;
        Email response = api.waitForLatestEmail(inboxId, timeout, unreadOnly);

        // TODO: test validations
    }
    
    /**
     * Wait or return list of emails that match simple matching patterns
     *
     * Perform a search of emails in an inbox with the given patterns. If results match expected count then return or else retry the search until results are found or timeout is reached. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM. See the &#x60;MatchOptions&#x60; object for options.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void waitForMatchingEmailTest() throws ApiException {
        MatchOptions matchOptions = null;
        Integer count = null;
        UUID inboxId = null;
        Long timeout = null;
        Boolean unreadOnly = null;
        List<EmailPreview> response = api.waitForMatchingEmail(matchOptions, count, inboxId, timeout, unreadOnly);

        // TODO: test validations
    }
    
    /**
     * Wait for or fetch the email with a given index in the inbox specified
     *
     * If nth email is already present in inbox then return it. If not hold the connection open until timeout expires or the nth email is received and returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void waitForNthEmailTest() throws ApiException {
        UUID inboxId = null;
        Integer index = null;
        Long timeout = null;
        Boolean unreadOnly = null;
        Email response = api.waitForNthEmail(inboxId, index, timeout, unreadOnly);

        // TODO: test validations
    }
    
}
