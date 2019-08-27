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


package api;

import mailslurp.ApiException;
import modesl.BulkSendEmailOptions;
import modesl.CreateWebhookOptions;
import modesl.Email;
import modesl.EmailPreview;
import modesl.Inbox;
import org.threeten.bp.OffsetDateTime;
import modesl.SendEmailOptions;
import java.util.UUID;
import modesl.Webhook;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExtraOperationsApi
 */
@Ignore
public class ExtraOperationsApiTest {

    private final ExtraOperationsApi api = new ExtraOperationsApi();

    
    /**
     * Bulk create Inboxes (email addresses)
     *
     * Enterprise Plan Required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkCreateInboxesUsingPOSTTest() throws ApiException {
        Integer count = null;
        List<Inbox> response = api.bulkCreateInboxesUsingPOST(count);

        // TODO: test validations
    }
    
    /**
     * Bulk Delete Inboxes
     *
     * Enterprise Plan Required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkDeleteInboxesUsingDELETETest() throws ApiException {
        List<UUID> UUID = null;
        api.bulkDeleteInboxesUsingDELETE(UUID);

        // TODO: test validations
    }
    
    /**
     * Bulk Send Emails
     *
     * Enterprise Plan Required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkSendEmailsUsingPOSTTest() throws ApiException {
        BulkSendEmailOptions bulkSendEmailOptions = null;
        api.bulkSendEmailsUsingPOST(bulkSendEmailOptions);

        // TODO: test validations
    }
    
    /**
     * Create an Inbox (email address)
     *
     * Create a new inbox and ephemeral email address to send and receive from. This is a necessary step before sending or receiving emails. The response contains the inbox&#39;s ID and its associated email address. It is recommended that you create a new inbox during each test method so that it is unique and empty
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInboxUsingPOSTTest() throws ApiException {
        Inbox response = api.createInboxUsingPOST();

        // TODO: test validations
    }
    
    /**
     * Attach a webhook URL to an inbox
     *
     * Get notified whenever an inbox receives an email via a webhook URL. An emailID will be posted to this URL every time an email is received for this inbox. The URL must be publicly reachable by the MailSlurp server. You can provide basicAuth values if you wish to secure this endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInboxWebhookUsingPOSTTest() throws ApiException {
        UUID inboxId = null;
        CreateWebhookOptions createWebhookOptions = null;
        Webhook response = api.createInboxWebhookUsingPOST(inboxId, createWebhookOptions);

        // TODO: test validations
    }
    
    /**
     * Delete Email
     *
     * Deletes an email and removes it from the inbox
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEmailUsingDELETETest() throws ApiException {
        UUID emailId = null;
        api.deleteEmailUsingDELETE(emailId);

        // TODO: test validations
    }
    
    /**
     * Delete Inbox
     *
     * Permanently delete an inbox and associated email address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInboxUsingDELETETest() throws ApiException {
        UUID inboxId = null;
        api.deleteInboxUsingDELETE(inboxId);

        // TODO: test validations
    }
    
    /**
     * Get email attachment
     *
     * Returns the specified attachment for a given email as a byte stream (file download). Get the attachmentId from the email response. Requires enterprise account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailAttachmentUsingGETTest() throws ApiException {
        String attachmentId = null;
        UUID emailId = null;
        api.getEmailAttachmentUsingGET(attachmentId, emailId);

        // TODO: test validations
    }
    
    /**
     * Get Email Content
     *
     * Returns a email summary object with headers and content. To retrieve the raw unparsed email use the getRawMessage endpoint
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailUsingGETTest() throws ApiException {
        UUID emailId = null;
        Email response = api.getEmailUsingGET(emailId);

        // TODO: test validations
    }
    
    /**
     * List an Inbox&#39;s Emails
     *
     * List emails that an inbox has received. Only emails that are sent to the inbox&#39;s email address will appear in the inbox. It may take several seconds for any email you send to an inbox&#39;s email address to appear in the inbox. To make this endpoint wait for a minimum number of emails use the &#x60;minCount&#x60; parameter. The server will retry the inbox database until the &#x60;minCount&#x60; is satisfied or the &#x60;retryTimeout&#x60; is reached
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailsUsingGETTest() throws ApiException {
        UUID inboxId = null;
        Integer limit = null;
        Long minCount = null;
        Long retryTimeout = null;
        OffsetDateTime since = null;
        List<EmailPreview> response = api.getEmailsUsingGET(inboxId, limit, minCount, retryTimeout, since);

        // TODO: test validations
    }
    
    /**
     * Get Inbox
     *
     * Returns an inbox&#39;s properties, including its email address and ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInboxUsingGETTest() throws ApiException {
        UUID inboxId = null;
        Inbox response = api.getInboxUsingGET(inboxId);

        // TODO: test validations
    }
    
    /**
     * Delete and disable a webhook for an inbox
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInboxWebhooksUsingDELETETest() throws ApiException {
        UUID inboxId = null;
        UUID webhookId = null;
        api.getInboxWebhooksUsingDELETE(inboxId, webhookId);

        // TODO: test validations
    }
    
    /**
     * Get all webhooks for an inbox
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInboxWebhooksUsingGETTest() throws ApiException {
        UUID inboxId = null;
        List<Webhook> response = api.getInboxWebhooksUsingGET(inboxId);

        // TODO: test validations
    }
    
    /**
     * List Inboxes
     *
     * List the inboxes you have created
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInboxesUsingGETTest() throws ApiException {
        List<Inbox> response = api.getInboxesUsingGET();

        // TODO: test validations
    }
    
    /**
     * Get Raw Email Content
     *
     * Returns a raw, unparsed and unprocessed email
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRawEmailUsingGETTest() throws ApiException {
        UUID emailId = null;
        String response = api.getRawEmailUsingGET(emailId);

        // TODO: test validations
    }
    
    /**
     * Send Email
     *
     * Send an email from the inbox&#39;s email address. Specify the email recipients and contents in the request body. See the &#x60;SendEmailOptions&#x60; for more information. Note the &#x60;inboxId&#x60; refers to the inbox&#39;s id NOT its email address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendEmailUsingPOSTTest() throws ApiException {
        UUID inboxId = null;
        SendEmailOptions sendEmailOptions = null;
        api.sendEmailUsingPOST(inboxId, sendEmailOptions);

        // TODO: test validations
    }
    
}
