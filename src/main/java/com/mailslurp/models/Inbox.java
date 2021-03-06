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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Representation of an inbox with an email address. Emails can be sent to or from this email address.
 */
@ApiModel(description = "Representation of an inbox with an email address. Emails can be sent to or from this email address.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T12:57:19.939+02:00[Europe/Berlin]")
public class Inbox {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expiresAt";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_FAVOURITE = "favourite";
  @SerializedName(SERIALIZED_NAME_FAVOURITE)
  private Boolean favourite;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;


  public Inbox createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When was the inbox created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When was the inbox created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Inbox description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Optional description of an inbox for labelling purposes
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional description of an inbox for labelling purposes")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Inbox emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The inbox&#39;s email address. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The inbox's email address. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public Inbox expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * When, if ever, will the inbox expire and be deleted. If null then this inbox is permanent and the emails in it won&#39;t be deleted.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When, if ever, will the inbox expire and be deleted. If null then this inbox is permanent and the emails in it won't be deleted.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public Inbox favourite(Boolean favourite) {
    
    this.favourite = favourite;
    return this;
  }

   /**
   * Is the inbox favourited
   * @return favourite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the inbox favourited")

  public Boolean getFavourite() {
    return favourite;
  }


  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
  }


  public Inbox id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the inbox
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the inbox")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Inbox name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Optional name of the inbox. Displayed in the dashboard for easier search
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional name of the inbox. Displayed in the dashboard for easier search")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Inbox tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Inbox addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags that inbox has been tagged with
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags that inbox has been tagged with")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Inbox userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * ID of user that inbox belongs to
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of user that inbox belongs to")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inbox inbox = (Inbox) o;
    return Objects.equals(this.createdAt, inbox.createdAt) &&
        Objects.equals(this.description, inbox.description) &&
        Objects.equals(this.emailAddress, inbox.emailAddress) &&
        Objects.equals(this.expiresAt, inbox.expiresAt) &&
        Objects.equals(this.favourite, inbox.favourite) &&
        Objects.equals(this.id, inbox.id) &&
        Objects.equals(this.name, inbox.name) &&
        Objects.equals(this.tags, inbox.tags) &&
        Objects.equals(this.userId, inbox.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, emailAddress, expiresAt, favourite, id, name, tags, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inbox {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

