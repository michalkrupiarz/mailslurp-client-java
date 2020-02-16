/*
 * MailSlurp API
 * ## Introduction  [MailSlurp](https://www.mailslurp.com) is an Email API for developers and QA testers. It let's users: - create emails addresses on demand - receive emails and attachments in code - send templated HTML emails  ## About  This page contains the REST API documentation for MailSlurp. All requests require API Key authentication passed as an `x-api-key` header.  Create an account to [get your free API Key](https://app.mailslurp.com/sign-up/).  ## Resources - 🔑 [Get API Key](https://app.mailslurp.com/sign-up/)                    - 🎓 [Developer Portal](https://www.mailslurp.com/docs/)           - 📦 [Library SDKs](https://www.mailslurp.com/docs/) - ✍️ [Code Examples](https://www.mailslurp.com/examples) - ⚠️ [Report an issue](https://drift.me/mailslurp)  ## Explore  
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