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


package com.mailslurp.models;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mailslurp.models.Pageable;
import com.mailslurp.models.Sort;
import com.mailslurp.models.WebhookProjection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for PageWebhookProjection
 */
public class PageWebhookProjectionTest {
    private final PageWebhookProjection model = new PageWebhookProjection();

    /**
     * Model tests for PageWebhookProjection
     */
    @Test
    public void testPageWebhookProjection() {
        // TODO: test PageWebhookProjection
    }

    /**
     * Test the property 'content'
     */
    @Test
    public void contentTest() {
        // TODO: test content
    }

    /**
     * Test the property 'empty'
     */
    @Test
    public void emptyTest() {
        // TODO: test empty
    }

    /**
     * Test the property 'first'
     */
    @Test
    public void firstTest() {
        // TODO: test first
    }

    /**
     * Test the property 'last'
     */
    @Test
    public void lastTest() {
        // TODO: test last
    }

    /**
     * Test the property 'number'
     */
    @Test
    public void numberTest() {
        // TODO: test number
    }

    /**
     * Test the property 'numberOfElements'
     */
    @Test
    public void numberOfElementsTest() {
        // TODO: test numberOfElements
    }

    /**
     * Test the property 'pageable'
     */
    @Test
    public void pageableTest() {
        // TODO: test pageable
    }

    /**
     * Test the property 'size'
     */
    @Test
    public void sizeTest() {
        // TODO: test size
    }

    /**
     * Test the property 'sort'
     */
    @Test
    public void sortTest() {
        // TODO: test sort
    }

    /**
     * Test the property 'totalElements'
     */
    @Test
    public void totalElementsTest() {
        // TODO: test totalElements
    }

    /**
     * Test the property 'totalPages'
     */
    @Test
    public void totalPagesTest() {
        // TODO: test totalPages
    }

}
