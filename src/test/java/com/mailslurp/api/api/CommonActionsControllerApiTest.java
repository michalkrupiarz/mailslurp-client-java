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
import com.mailslurp.models.Inbox;
import com.mailslurp.models.SimpleSendEmailOptions;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommonActionsControllerApi
 */
@Ignore
public class CommonActionsControllerApiTest {

    private final CommonActionsControllerApi api = new CommonActionsControllerApi();

    
    /**
     * Create new random inbox
     *
     * Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNewEmailAddressTest() throws ApiException {
        Inbox response = api.createNewEmailAddress();

        // TODO: test validations
    }
    
    /**
     * Create new random inbox
     *
     * Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNewEmailAddress1Test() throws ApiException {
        Inbox response = api.createNewEmailAddress1();

        // TODO: test validations
    }
    
    /**
     * Delete all emails in an inbox
     *
     * Deletes all emails
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emptyInboxTest() throws ApiException {
        UUID inboxId = null;
        api.emptyInbox(inboxId);

        // TODO: test validations
    }
    
    /**
     * Send an email
     *
     * If no senderId or inboxId provided a random email address will be used to send from.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendEmailSimpleTest() throws ApiException {
        SimpleSendEmailOptions emailOptions = null;
        api.sendEmailSimple(emailOptions);

        // TODO: test validations
    }
    
}
