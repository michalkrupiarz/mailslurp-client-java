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


package com.mailslurp.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Representation of a webhook for an inbox. The URL that 
 */
@ApiModel(description = "Representation of a webhook for an inbox. The URL that ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-16T15:06:53.253313+01:00[Europe/Berlin]")
public class WebhookDto {
  public static final String SERIALIZED_NAME_BASIC_AUTH = "basicAuth";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH)
  private Boolean basicAuth;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  /**
   * HTTP method that your server endpoint must listen for
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    GET("GET"),
    
    HEAD("HEAD"),
    
    POST("POST"),
    
    PUT("PUT"),
    
    PATCH("PATCH"),
    
    DELETE("DELETE"),
    
    OPTIONS("OPTIONS"),
    
    TRACE("TRACE");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PAYLOAD_JSON_SCHEMA = "payloadJsonSchema";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_JSON_SCHEMA)
  private String payloadJsonSchema;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public WebhookDto basicAuth(Boolean basicAuth) {
    
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Does webhook expect basic authentication? If true it means you created this webhook with a username and password. MailSlurp will use these in the URL to authenticate itself.
   * @return basicAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Does webhook expect basic authentication? If true it means you created this webhook with a username and password. MailSlurp will use these in the URL to authenticate itself.")

  public Boolean getBasicAuth() {
    return basicAuth;
  }


  public void setBasicAuth(Boolean basicAuth) {
    this.basicAuth = basicAuth;
  }


  public WebhookDto createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When the webhook was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the webhook was created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the Webhook
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the Webhook")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public WebhookDto inboxId(UUID inboxId) {
    
    this.inboxId = inboxId;
    return this;
  }

   /**
   * The inbox that the Webhook will be triggered by
   * @return inboxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The inbox that the Webhook will be triggered by")

  public UUID getInboxId() {
    return inboxId;
  }


  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }


  public WebhookDto method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * HTTP method that your server endpoint must listen for
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP method that your server endpoint must listen for")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public WebhookDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the webhook
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the webhook")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WebhookDto payloadJsonSchema(String payloadJsonSchema) {
    
    this.payloadJsonSchema = payloadJsonSchema;
    return this;
  }

   /**
   * JSON Schema for the payload that will be sent to your URL via the HTTP method described.
   * @return payloadJsonSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSON Schema for the payload that will be sent to your URL via the HTTP method described.")

  public String getPayloadJsonSchema() {
    return payloadJsonSchema;
  }


  public void setPayloadJsonSchema(String payloadJsonSchema) {
    this.payloadJsonSchema = payloadJsonSchema;
  }


  public WebhookDto updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public WebhookDto url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of your server that the webhook will be sent to. The schema of the JSON that is sent is described by the payloadJsonSchema.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of your server that the webhook will be sent to. The schema of the JSON that is sent is described by the payloadJsonSchema.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookDto webhookDto = (WebhookDto) o;
    return Objects.equals(this.basicAuth, webhookDto.basicAuth) &&
        Objects.equals(this.createdAt, webhookDto.createdAt) &&
        Objects.equals(this.id, webhookDto.id) &&
        Objects.equals(this.inboxId, webhookDto.inboxId) &&
        Objects.equals(this.method, webhookDto.method) &&
        Objects.equals(this.name, webhookDto.name) &&
        Objects.equals(this.payloadJsonSchema, webhookDto.payloadJsonSchema) &&
        Objects.equals(this.updatedAt, webhookDto.updatedAt) &&
        Objects.equals(this.url, webhookDto.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuth, createdAt, id, inboxId, method, name, payloadJsonSchema, updatedAt, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookDto {\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payloadJsonSchema: ").append(toIndentedString(payloadJsonSchema)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

