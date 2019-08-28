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


package com.mailslurp.models;

import org.apache.commons.lang3.ObjectUtils;
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
 * Representation of a webhook for an inbox.
 */
@ApiModel(description = "Representation of a webhook for an inbox.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-28T15:16:06.179408+02:00[Europe/Berlin]")
public class Webhook {
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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Webhook basicAuth(Boolean basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Does Webhook expect basic authentication
   * @return basicAuth
  **/
  @ApiModelProperty(value = "Does Webhook expect basic authentication")
  public Boolean getBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(Boolean basicAuth) {
    this.basicAuth = basicAuth;
  }

  public Webhook createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Webhook id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the Webhook
   * @return id
  **/
  @ApiModelProperty(value = "ID of the Webhook")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Webhook inboxId(UUID inboxId) {
    this.inboxId = inboxId;
    return this;
  }

   /**
   * The inbox that the Webhook will be triggered by
   * @return inboxId
  **/
  @ApiModelProperty(value = "The inbox that the Webhook will be triggered by")
  public UUID getInboxId() {
    return inboxId;
  }

  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }

  public Webhook name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Webhook updatedAt(OffsetDateTime updatedAt) {
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


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Webhook webhook = (Webhook) o;
    return ObjectUtils.equals(this.basicAuth, webhook.basicAuth) &&
    ObjectUtils.equals(this.createdAt, webhook.createdAt) &&
    ObjectUtils.equals(this.id, webhook.id) &&
    ObjectUtils.equals(this.inboxId, webhook.inboxId) &&
    ObjectUtils.equals(this.name, webhook.name) &&
    ObjectUtils.equals(this.updatedAt, webhook.updatedAt);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(basicAuth, createdAt, id, inboxId, name, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

