# mailslurp-java-sdk-client

MailSlurp API
- API version: 0.0.1-alpha
  - Build date: 2019-08-27T12:40:29.556437+02:00[Europe/Berlin]

For documentation see [developer guide](https://www.mailslurp.com/developers). [Create an account](https://app.mailslurp.com) in the MailSlurp Dashboard to [view your API Key](https://app). For all bugs, feature requests, or help please [see support](https://www.mailslurp.com/support/).

  For more information, please visit [https://www.mailslurp.com](https://www.mailslurp.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.6+
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
  <groupId>com.mailslurp.api</groupId>
  <artifactId>mailslurp-java-sdk-client</artifactId>
  <version>4.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mailslurp.api:mailslurp-java-sdk-client:4.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/mailslurp-java-sdk-client-4.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import mailslurp.*;
import mailslurp.auth.*;
import modesl.*;
import api.CommonOperationsApi;

import java.io.File;
import java.util.*;

public class CommonOperationsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: API_KEY
        ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
        API_KEY.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //API_KEY.setApiKeyPrefix("Token");

        CommonOperationsApi apiInstance = new CommonOperationsApi();
        try {
            Inbox result = apiInstance.createNewEmailAddressUsingPOST();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommonOperationsApi#createNewEmailAddressUsingPOST");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.mailslurp.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CommonOperationsApi* | [**createNewEmailAddressUsingPOST**](docs/CommonOperationsApi.md#createNewEmailAddressUsingPOST) | **POST** /newEmailAddress | Create new email address
*CommonOperationsApi* | [**fetchLatestEmailUsingGET**](docs/CommonOperationsApi.md#fetchLatestEmailUsingGET) | **GET** /fetchLatestEmail | Fetch inbox&#39;s latest email or if empty wait for email to arrive
*CommonOperationsApi* | [**sendEmailSimpleUsingPOST**](docs/CommonOperationsApi.md#sendEmailSimpleUsingPOST) | **POST** /sendEmail | Send an email from a random email address
*ExtraOperationsApi* | [**bulkCreateInboxesUsingPOST**](docs/ExtraOperationsApi.md#bulkCreateInboxesUsingPOST) | **POST** /bulk/inboxes | Bulk create Inboxes (email addresses)
*ExtraOperationsApi* | [**bulkDeleteInboxesUsingDELETE**](docs/ExtraOperationsApi.md#bulkDeleteInboxesUsingDELETE) | **DELETE** /bulk/inboxes | Bulk Delete Inboxes
*ExtraOperationsApi* | [**bulkSendEmailsUsingPOST**](docs/ExtraOperationsApi.md#bulkSendEmailsUsingPOST) | **POST** /bulk/send | Bulk Send Emails
*ExtraOperationsApi* | [**createInboxUsingPOST**](docs/ExtraOperationsApi.md#createInboxUsingPOST) | **POST** /inboxes | Create an Inbox (email address)
*ExtraOperationsApi* | [**createInboxWebhookUsingPOST**](docs/ExtraOperationsApi.md#createInboxWebhookUsingPOST) | **POST** /inboxes/{inboxId}/webhooks | Attach a webhook URL to an inbox
*ExtraOperationsApi* | [**deleteEmailUsingDELETE**](docs/ExtraOperationsApi.md#deleteEmailUsingDELETE) | **DELETE** /emails/{emailId} | Delete Email
*ExtraOperationsApi* | [**deleteInboxUsingDELETE**](docs/ExtraOperationsApi.md#deleteInboxUsingDELETE) | **DELETE** /inboxes/{inboxId} | Delete Inbox
*ExtraOperationsApi* | [**getEmailAttachmentUsingGET**](docs/ExtraOperationsApi.md#getEmailAttachmentUsingGET) | **GET** /emails/{emailId}/attachments/{attachmentId} | Get email attachment
*ExtraOperationsApi* | [**getEmailUsingGET**](docs/ExtraOperationsApi.md#getEmailUsingGET) | **GET** /emails/{emailId} | Get Email Content
*ExtraOperationsApi* | [**getEmailsUsingGET**](docs/ExtraOperationsApi.md#getEmailsUsingGET) | **GET** /inboxes/{inboxId}/emails | List an Inbox&#39;s Emails
*ExtraOperationsApi* | [**getInboxUsingGET**](docs/ExtraOperationsApi.md#getInboxUsingGET) | **GET** /inboxes/{inboxId} | Get Inbox
*ExtraOperationsApi* | [**getInboxWebhooksUsingDELETE**](docs/ExtraOperationsApi.md#getInboxWebhooksUsingDELETE) | **DELETE** /inboxes/{inboxId}/webhooks/{webhookId} | Delete and disable a webhook for an inbox
*ExtraOperationsApi* | [**getInboxWebhooksUsingGET**](docs/ExtraOperationsApi.md#getInboxWebhooksUsingGET) | **GET** /inboxes/{inboxId}/webhooks | Get all webhooks for an inbox
*ExtraOperationsApi* | [**getInboxesUsingGET**](docs/ExtraOperationsApi.md#getInboxesUsingGET) | **GET** /inboxes | List Inboxes
*ExtraOperationsApi* | [**getRawEmailUsingGET**](docs/ExtraOperationsApi.md#getRawEmailUsingGET) | **GET** /emails/{emailId}/raw | Get Raw Email Content
*ExtraOperationsApi* | [**sendEmailUsingPOST**](docs/ExtraOperationsApi.md#sendEmailUsingPOST) | **POST** /inboxes/{inboxId} | Send Email


## Documentation for Models

 - [BasicAuthOptions](docs/BasicAuthOptions.md)
 - [BulkSendEmailOptions](docs/BulkSendEmailOptions.md)
 - [CreateWebhookOptions](docs/CreateWebhookOptions.md)
 - [Email](docs/Email.md)
 - [EmailAnalysis](docs/EmailAnalysis.md)
 - [EmailPreview](docs/EmailPreview.md)
 - [Inbox](docs/Inbox.md)
 - [SendEmailOptions](docs/SendEmailOptions.md)
 - [Webhook](docs/Webhook.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### API_KEY

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contact@mailslurp.dev

