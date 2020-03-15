/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: 67c9a1eda264be4cfe0bb2c76151f0aadf0862bc
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
import org.threeten.bp.OffsetDateTime;

/**
 * Options for updating inbox properties
 */
@ApiModel(description = "Options for updating inbox properties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-15T11:55:54.663251+01:00[Europe/Berlin]")
public class UpdateInboxOptions {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expiresAt";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_FAVOURITE = "favourite";
  @SerializedName(SERIALIZED_NAME_FAVOURITE)
  private Boolean favourite;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;


  public UpdateInboxOptions description(String description) {
    
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


  public UpdateInboxOptions expiresAt(OffsetDateTime expiresAt) {
    
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


  public UpdateInboxOptions favourite(Boolean favourite) {
    
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


  public UpdateInboxOptions name(String name) {
    
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


  public UpdateInboxOptions tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateInboxOptions addTagsItem(String tagsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInboxOptions updateInboxOptions = (UpdateInboxOptions) o;
    return Objects.equals(this.description, updateInboxOptions.description) &&
        Objects.equals(this.expiresAt, updateInboxOptions.expiresAt) &&
        Objects.equals(this.favourite, updateInboxOptions.favourite) &&
        Objects.equals(this.name, updateInboxOptions.name) &&
        Objects.equals(this.tags, updateInboxOptions.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expiresAt, favourite, name, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInboxOptions {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

