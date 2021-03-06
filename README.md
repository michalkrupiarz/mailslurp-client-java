# mailslurp-client

MailSlurp API
- API version: d1659dc1567a5b62f65d0612107a50aace03e085
  - Build date: 2020-04-27T12:57:19.939+02:00[Europe/Berlin]

MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more. 

## Resources
- [Homepage](https://www.mailslurp.com)
- Get an [API KEY](https://app.mailslurp.com/sign-up/)
- Generated [SDK Clients](https://www.mailslurp.com/docs/)
- [Examples](https://github.com/mailslurp/examples) repository



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.mailslurp</groupId>
  <artifactId>mailslurp-client</artifactId>
  <version>7.0.11</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mailslurp:mailslurp-client:7.0.11"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/mailslurp-client-7.0.11.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.AliasControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AliasControllerApi apiInstance = new AliasControllerApi(defaultClient);
    CreateOwnedAliasOptions createOwnedAliasOptions = new CreateOwnedAliasOptions(); // CreateOwnedAliasOptions | createOwnedAliasOptions
    try {
      apiInstance.createAlias(createOwnedAliasOptions);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasControllerApi#createAlias");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.mailslurp.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AliasControllerApi* | [**createAlias**](docs/AliasControllerApi.md#createAlias) | **POST** /aliases | Create an email alias
*AliasControllerApi* | [**createAnonymousAlias**](docs/AliasControllerApi.md#createAnonymousAlias) | **POST** /aliases/anonymous | Create an anonymous email alias
*AliasControllerApi* | [**deleteAlias**](docs/AliasControllerApi.md#deleteAlias) | **DELETE** /aliases/{aliasId} | Delete an owned alias
*AliasControllerApi* | [**getAlias**](docs/AliasControllerApi.md#getAlias) | **GET** /aliases/{aliasId} | Get an email alias
*AliasControllerApi* | [**getAliases**](docs/AliasControllerApi.md#getAliases) | **GET** /aliases | Get all email aliases
*AliasControllerApi* | [**updateAlias**](docs/AliasControllerApi.md#updateAlias) | **PUT** /aliases/{aliasId} | Update an owned alias
*AttachmentControllerApi* | [**uploadAttachment**](docs/AttachmentControllerApi.md#uploadAttachment) | **POST** /attachments | Upload an attachment for sending
*AttachmentControllerApi* | [**uploadMultipartForm**](docs/AttachmentControllerApi.md#uploadMultipartForm) | **POST** /attachments/multipart | Upload an attachment for sending using Multipart Form
*BulkActionsControllerApi* | [**bulkCreateInboxes**](docs/BulkActionsControllerApi.md#bulkCreateInboxes) | **POST** /bulk/inboxes | Bulk create Inboxes (email addresses)
*BulkActionsControllerApi* | [**bulkDeleteInboxes**](docs/BulkActionsControllerApi.md#bulkDeleteInboxes) | **DELETE** /bulk/inboxes | Bulk Delete Inboxes
*BulkActionsControllerApi* | [**bulkSendEmails**](docs/BulkActionsControllerApi.md#bulkSendEmails) | **POST** /bulk/send | Bulk Send Emails
*CommonActionsControllerApi* | [**createNewEmailAddress**](docs/CommonActionsControllerApi.md#createNewEmailAddress) | **POST** /createInbox | Create new random inbox
*CommonActionsControllerApi* | [**createNewEmailAddress1**](docs/CommonActionsControllerApi.md#createNewEmailAddress1) | **POST** /newEmailAddress | Create new random inbox
*CommonActionsControllerApi* | [**emptyInbox**](docs/CommonActionsControllerApi.md#emptyInbox) | **DELETE** /emptyInbox | Delete all emails in an inbox
*CommonActionsControllerApi* | [**sendEmailSimple**](docs/CommonActionsControllerApi.md#sendEmailSimple) | **POST** /sendEmail | Send an email
*ContactControllerApi* | [**createContact**](docs/ContactControllerApi.md#createContact) | **POST** /contacts | Create a contact
*ContactControllerApi* | [**deleteContact**](docs/ContactControllerApi.md#deleteContact) | **DELETE** /contacts/{contactId} | Delete contact
*ContactControllerApi* | [**getAllContacts**](docs/ContactControllerApi.md#getAllContacts) | **GET** /contacts/paginated | Get all contacts
*ContactControllerApi* | [**getContact**](docs/ContactControllerApi.md#getContact) | **GET** /contacts/{contactId} | Get contact
*ContactControllerApi* | [**getContacts**](docs/ContactControllerApi.md#getContacts) | **GET** /contacts | Get all contacts
*DomainControllerApi* | [**createDomain**](docs/DomainControllerApi.md#createDomain) | **POST** /domains | Create Domain
*DomainControllerApi* | [**deleteDomain**](docs/DomainControllerApi.md#deleteDomain) | **DELETE** /domains/{id} | Delete a domain
*DomainControllerApi* | [**getDomain**](docs/DomainControllerApi.md#getDomain) | **GET** /domains/{id} | Get a domain
*DomainControllerApi* | [**getDomains**](docs/DomainControllerApi.md#getDomains) | **GET** /domains | Get domains
*EmailControllerApi* | [**deleteAllEmails**](docs/EmailControllerApi.md#deleteAllEmails) | **DELETE** /emails | Delete all emails
*EmailControllerApi* | [**deleteEmail**](docs/EmailControllerApi.md#deleteEmail) | **DELETE** /emails/{emailId} | Delete an email
*EmailControllerApi* | [**downloadAttachment**](docs/EmailControllerApi.md#downloadAttachment) | **GET** /emails/{emailId}/attachments/{attachmentId} | Get email attachment bytes
*EmailControllerApi* | [**forwardEmail**](docs/EmailControllerApi.md#forwardEmail) | **POST** /emails/{emailId}/forward | Forward email
*EmailControllerApi* | [**getAttachmentMetaData**](docs/EmailControllerApi.md#getAttachmentMetaData) | **GET** /emails/{emailId}/attachments/{attachmentId}/metadata | Get email attachment metadata
*EmailControllerApi* | [**getAttachments**](docs/EmailControllerApi.md#getAttachments) | **GET** /emails/{emailId}/attachments | Get all email attachment metadata
*EmailControllerApi* | [**getEmail**](docs/EmailControllerApi.md#getEmail) | **GET** /emails/{emailId} | Get email content
*EmailControllerApi* | [**getEmailHTML**](docs/EmailControllerApi.md#getEmailHTML) | **GET** /emails/{emailId}/html | Get email content as HTML
*EmailControllerApi* | [**getEmailsPaginated**](docs/EmailControllerApi.md#getEmailsPaginated) | **GET** /emails | Get all emails
*EmailControllerApi* | [**getRawEmailContents**](docs/EmailControllerApi.md#getRawEmailContents) | **GET** /emails/{emailId}/raw | Get raw email string
*EmailControllerApi* | [**getRawEmailJson**](docs/EmailControllerApi.md#getRawEmailJson) | **GET** /emails/{emailId}/raw/json | Get raw email in JSON
*EmailControllerApi* | [**getUnreadEmailCount**](docs/EmailControllerApi.md#getUnreadEmailCount) | **GET** /emails/unreadCount | Get unread email count
*EmailControllerApi* | [**validateEmail**](docs/EmailControllerApi.md#validateEmail) | **POST** /emails/{emailId}/validate | Validate email
*FormControllerApi* | [**submitForm**](docs/FormControllerApi.md#submitForm) | **POST** /forms | Submit a form to be parsed and sent as an email to an address determined by the form fields
*GroupControllerApi* | [**addContactsToGroup**](docs/GroupControllerApi.md#addContactsToGroup) | **PUT** /groups/{groupId}/contacts | Add contacts to a group
*GroupControllerApi* | [**createGroup**](docs/GroupControllerApi.md#createGroup) | **POST** /groups | Create a group
*GroupControllerApi* | [**deleteGroup**](docs/GroupControllerApi.md#deleteGroup) | **DELETE** /groups/{groupId} | Delete group
*GroupControllerApi* | [**getAllGroups**](docs/GroupControllerApi.md#getAllGroups) | **GET** /groups/paginated | Get all Contact Groups in paginated format
*GroupControllerApi* | [**getGroup**](docs/GroupControllerApi.md#getGroup) | **GET** /groups/{groupId} | Get group
*GroupControllerApi* | [**getGroupWithContacts**](docs/GroupControllerApi.md#getGroupWithContacts) | **GET** /groups/{groupId}/contacts | Get group and contacts belonging to it
*GroupControllerApi* | [**getGroups**](docs/GroupControllerApi.md#getGroups) | **GET** /groups | Get all groups
*GroupControllerApi* | [**removeContactsFromGroup**](docs/GroupControllerApi.md#removeContactsFromGroup) | **DELETE** /groups/{groupId}/contacts | Remove contacts from a group
*InboxControllerApi* | [**createInbox**](docs/InboxControllerApi.md#createInbox) | **POST** /inboxes | Create an Inbox (email address)
*InboxControllerApi* | [**deleteAllInboxes**](docs/InboxControllerApi.md#deleteAllInboxes) | **DELETE** /inboxes | Delete all inboxes
*InboxControllerApi* | [**deleteInbox**](docs/InboxControllerApi.md#deleteInbox) | **DELETE** /inboxes/{inboxId} | Delete inbox
*InboxControllerApi* | [**getAllInboxes**](docs/InboxControllerApi.md#getAllInboxes) | **GET** /inboxes/paginated | List Inboxes Paginated
*InboxControllerApi* | [**getEmails**](docs/InboxControllerApi.md#getEmails) | **GET** /inboxes/{inboxId}/emails | Get emails in an Inbox
*InboxControllerApi* | [**getInbox**](docs/InboxControllerApi.md#getInbox) | **GET** /inboxes/{inboxId} | Get Inbox
*InboxControllerApi* | [**getInboxEmailsPaginated**](docs/InboxControllerApi.md#getInboxEmailsPaginated) | **GET** /inboxes/{inboxId}/emails/paginated | Get inbox emails paginated
*InboxControllerApi* | [**getInboxTags**](docs/InboxControllerApi.md#getInboxTags) | **GET** /inboxes/tags | Get inbox tags
*InboxControllerApi* | [**getInboxes**](docs/InboxControllerApi.md#getInboxes) | **GET** /inboxes | List Inboxes / Email Addresses
*InboxControllerApi* | [**sendEmail**](docs/InboxControllerApi.md#sendEmail) | **POST** /inboxes/{inboxId} | Send Email
*InboxControllerApi* | [**setInboxFavourited**](docs/InboxControllerApi.md#setInboxFavourited) | **PUT** /inboxes/{inboxId}/favourite | Set inbox favourited state
*InboxControllerApi* | [**updateInbox**](docs/InboxControllerApi.md#updateInbox) | **PATCH** /inboxes/{inboxId} | Update Inbox
*TemplateControllerApi* | [**createTemplate**](docs/TemplateControllerApi.md#createTemplate) | **POST** /templates | Create a Template
*TemplateControllerApi* | [**deleteTemplate**](docs/TemplateControllerApi.md#deleteTemplate) | **DELETE** /templates/{TemplateId} | Delete Template
*TemplateControllerApi* | [**getAllTemplates**](docs/TemplateControllerApi.md#getAllTemplates) | **GET** /templates/paginated | Get all Templates in paginated format
*TemplateControllerApi* | [**getTemplate**](docs/TemplateControllerApi.md#getTemplate) | **GET** /templates/{TemplateId} | Get Template
*TemplateControllerApi* | [**getTemplates**](docs/TemplateControllerApi.md#getTemplates) | **GET** /templates | Get all Templates
*WaitForControllerApi* | [**waitFor**](docs/WaitForControllerApi.md#waitFor) | **POST** /waitFor | Wait for conditions to be met
*WaitForControllerApi* | [**waitForEmailCount**](docs/WaitForControllerApi.md#waitForEmailCount) | **GET** /waitForEmailCount | Wait for and return count number of emails 
*WaitForControllerApi* | [**waitForLatestEmail**](docs/WaitForControllerApi.md#waitForLatestEmail) | **GET** /waitForLatestEmail | Fetch inbox&#39;s latest email or if empty wait for an email to arrive
*WaitForControllerApi* | [**waitForMatchingEmail**](docs/WaitForControllerApi.md#waitForMatchingEmail) | **POST** /waitForMatchingEmails | Wait or return list of emails that match simple matching patterns
*WaitForControllerApi* | [**waitForNthEmail**](docs/WaitForControllerApi.md#waitForNthEmail) | **GET** /waitForNthEmail | Wait for or fetch the email with a given index in the inbox specified
*WebhookControllerApi* | [**createWebhook**](docs/WebhookControllerApi.md#createWebhook) | **POST** /inboxes/{inboxId}/webhooks | Attach a WebHook URL to an inbox
*WebhookControllerApi* | [**deleteWebhook**](docs/WebhookControllerApi.md#deleteWebhook) | **DELETE** /inboxes/{inboxId}/webhooks/{webhookId} | Delete and disable a Webhook for an Inbox
*WebhookControllerApi* | [**getAllWebhooks**](docs/WebhookControllerApi.md#getAllWebhooks) | **GET** /webhooks/paginated | List Webhooks Paginated
*WebhookControllerApi* | [**getWebhook**](docs/WebhookControllerApi.md#getWebhook) | **GET** /webhooks/{webhookId} | Get a webhook for an Inbox
*WebhookControllerApi* | [**getWebhooks**](docs/WebhookControllerApi.md#getWebhooks) | **GET** /inboxes/{inboxId}/webhooks | Get all Webhooks for an Inbox
*WebhookControllerApi* | [**sendTestData**](docs/WebhookControllerApi.md#sendTestData) | **POST** /webhooks/{webhookId}/test | Send webhook test data


## Documentation for Models

 - [Alias](docs/Alias.md)
 - [AttachmentMetaData](docs/AttachmentMetaData.md)
 - [BasicAuthOptions](docs/BasicAuthOptions.md)
 - [BulkSendEmailOptions](docs/BulkSendEmailOptions.md)
 - [ContactDto](docs/ContactDto.md)
 - [ContactProjection](docs/ContactProjection.md)
 - [CreateAnonymousAliasOptions](docs/CreateAnonymousAliasOptions.md)
 - [CreateContactOptions](docs/CreateContactOptions.md)
 - [CreateDomainOptions](docs/CreateDomainOptions.md)
 - [CreateGroupOptions](docs/CreateGroupOptions.md)
 - [CreateOwnedAliasOptions](docs/CreateOwnedAliasOptions.md)
 - [CreateTemplateOptions](docs/CreateTemplateOptions.md)
 - [CreateWebhookOptions](docs/CreateWebhookOptions.md)
 - [DomainDto](docs/DomainDto.md)
 - [DomainPreview](docs/DomainPreview.md)
 - [Email](docs/Email.md)
 - [EmailAnalysis](docs/EmailAnalysis.md)
 - [EmailPreview](docs/EmailPreview.md)
 - [EmailProjection](docs/EmailProjection.md)
 - [ForwardEmailOptions](docs/ForwardEmailOptions.md)
 - [GroupContactsDto](docs/GroupContactsDto.md)
 - [GroupDto](docs/GroupDto.md)
 - [GroupProjection](docs/GroupProjection.md)
 - [HTMLValidationResult](docs/HTMLValidationResult.md)
 - [Inbox](docs/Inbox.md)
 - [InboxProjection](docs/InboxProjection.md)
 - [JsonNode](docs/JsonNode.md)
 - [MatchOption](docs/MatchOption.md)
 - [MatchOptions](docs/MatchOptions.md)
 - [PageAlias](docs/PageAlias.md)
 - [PageContactProjection](docs/PageContactProjection.md)
 - [PageEmailPreview](docs/PageEmailPreview.md)
 - [PageEmailProjection](docs/PageEmailProjection.md)
 - [PageGroupProjection](docs/PageGroupProjection.md)
 - [PageInboxProjection](docs/PageInboxProjection.md)
 - [PageTemplateProjection](docs/PageTemplateProjection.md)
 - [PageWebhookProjection](docs/PageWebhookProjection.md)
 - [Pageable](docs/Pageable.md)
 - [RawEmailJson](docs/RawEmailJson.md)
 - [SendEmailOptions](docs/SendEmailOptions.md)
 - [SetInboxFavouritedOptions](docs/SetInboxFavouritedOptions.md)
 - [SimpleSendEmailOptions](docs/SimpleSendEmailOptions.md)
 - [Sort](docs/Sort.md)
 - [TemplateDto](docs/TemplateDto.md)
 - [TemplateProjection](docs/TemplateProjection.md)
 - [TemplateVariable](docs/TemplateVariable.md)
 - [UnreadCount](docs/UnreadCount.md)
 - [UpdateGroupContacts](docs/UpdateGroupContacts.md)
 - [UpdateInboxOptions](docs/UpdateInboxOptions.md)
 - [UploadAttachmentOptions](docs/UploadAttachmentOptions.md)
 - [ValidationDto](docs/ValidationDto.md)
 - [ValidationMessage](docs/ValidationMessage.md)
 - [WaitForConditions](docs/WaitForConditions.md)
 - [WebhookDto](docs/WebhookDto.md)
 - [WebhookProjection](docs/WebhookProjection.md)
 - [WebhookTestRequest](docs/WebhookTestRequest.md)
 - [WebhookTestResponse](docs/WebhookTestResponse.md)
 - [WebhookTestResult](docs/WebhookTestResult.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### API_KEY

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



