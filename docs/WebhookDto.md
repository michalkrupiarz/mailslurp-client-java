

# WebhookDto

Representation of a webhook for an inbox. The URL specified will be using by MailSlurp whenever an email is received by the attached inbox.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basicAuth** | **Boolean** | Does webhook expect basic authentication? If true it means you created this webhook with a username and password. MailSlurp will use these in the URL to authenticate itself. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the webhook was created |  [optional]
**id** | [**UUID**](UUID.md) | ID of the Webhook |  [optional]
**inboxId** | [**UUID**](UUID.md) | The inbox that the Webhook will be triggered by |  [optional]
**method** | [**MethodEnum**](#MethodEnum) | HTTP method that your server endpoint must listen for |  [optional]
**name** | **String** | Name of the webhook |  [optional]
**payloadJsonSchema** | **String** | JSON Schema for the payload that will be sent to your URL via the HTTP method described. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**url** | **String** | URL of your server that the webhook will be sent to. The schema of the JSON that is sent is described by the payloadJsonSchema. |  [optional]



## Enum: MethodEnum

Name | Value
---- | -----
GET | &quot;GET&quot;
HEAD | &quot;HEAD&quot;
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
PATCH | &quot;PATCH&quot;
DELETE | &quot;DELETE&quot;
OPTIONS | &quot;OPTIONS&quot;
TRACE | &quot;TRACE&quot;



