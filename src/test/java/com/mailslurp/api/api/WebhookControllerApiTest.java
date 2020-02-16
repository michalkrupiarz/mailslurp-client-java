/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Overview  #### Inboxes  Inboxes have real email addresses that can send and receive emails. You can create inboxes with specific email addresses (using custom domains). You can also use randomly assigned MailSlurp addresses as unique, disposable test addresses.   See the InboxController or [inbox and email address guide](https://www.mailslurp.com/guides/) for more information.  #### Receive Emails You can receive emails in a number of ways. You can fetch emails and attachments directly from an inbox. Or you can use `waitFor` endpoints to hold a connection open until an email is received that matches given criteria (such as subject or body content). You can also use webhooks to have emails from multiple inboxes forwarded to your server via HTTP POST.  InboxController methods with `waitFor` in the name have a long timeout period and instruct MailSlurp to wait until an expected email is received. You can set conditions on email counts, subject or body matches, and more.  Most receive methods only return an email ID and not the full email (to keep response sizes low). To fetch the full body or attachments for an email use the email's ID with EmailController endpoints.  See the InboxController or [receiving emails guide](https://www.mailslurp.com/guides/) for more information.  #### Send Emails You can send templated HTML emails in several ways. You must first create an inbox to send an email. An inbox can have a specific address or a randomly assigned one. You can send emails from an inbox using `to`, `cc`, and `bcc` recipient lists or with contacts and contact groups.   Emails can contain plain-text or HTML bodies. You can also use email templates that support [moustache](https://mustache.github.io/) template variables. You can send attachments by first posting files to the AttachmentController and then using the returned IDs in the `attachments` field of the send options.  See the InboxController or [sending emails guide](https://www.mailslurp.com/guides/) for more information.  ## Templates MailSlurp emails support templates. You can create templates in the dashboard or API that contain [moustache](https://mustache.github.io/) style variables: for instance `Hello {{name}}`. Then when sending emails you can pass a map of variables names and values to be used. Additionally, when sending emails with contact groups you can use properties of the contact in your templates like `{{firstName}}` and `{{lastName}}``.  ## Explore     
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mailslurp.api.api;

import com.mailslurp.client.ApiException;
import com.mailslurp.models.CreateWebhookOptions;
import com.mailslurp.models.PageWebhookProjection;
import java.util.UUID;
import com.mailslurp.models.WebhookDto;
import com.mailslurp.models.WebhookTestResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhookControllerApi
 */
@Ignore
public class WebhookControllerApiTest {

    private final WebhookControllerApi api = new WebhookControllerApi();

    
    /**
     * Attach a WebHook URL to an inbox
     *
     * Get notified whenever an inbox receives an email via a WebHook URL. An emailID will be posted to this URL every time an email is received for this inbox. The URL must be publicly reachable by the MailSlurp server. You can provide basicAuth values if you wish to secure this endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWebhookTest() throws ApiException {
        UUID inboxId = null;
        CreateWebhookOptions webhookOptions = null;
        WebhookDto response = api.createWebhook(inboxId, webhookOptions);

        // TODO: test validations
    }
    
    /**
     * Delete and disable a Webhook for an Inbox
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWebhookTest() throws ApiException {
        UUID inboxId = null;
        UUID webhookId = null;
        api.deleteWebhook(inboxId, webhookId);

        // TODO: test validations
    }
    
    /**
     * List Webhooks Paginated
     *
     * List webhooks in paginated form. Allows for page index, page size, and sort direction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllWebhooksTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String sort = null;
        PageWebhookProjection response = api.getAllWebhooks(page, size, sort);

        // TODO: test validations
    }
    
    /**
     * Get a webhook for an Inbox
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookTest() throws ApiException {
        UUID webhookId = null;
        WebhookDto response = api.getWebhook(webhookId);

        // TODO: test validations
    }
    
    /**
     * Get all Webhooks for an Inbox
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhooksTest() throws ApiException {
        UUID inboxId = null;
        List<WebhookDto> response = api.getWebhooks(inboxId);

        // TODO: test validations
    }
    
    /**
     * Send webhook test data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTestDataTest() throws ApiException {
        UUID webhookId = null;
        WebhookTestResult response = api.sendTestData(webhookId);

        // TODO: test validations
    }
    
}
