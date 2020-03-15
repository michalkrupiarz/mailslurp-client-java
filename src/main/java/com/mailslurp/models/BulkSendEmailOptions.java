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
import com.mailslurp.models.SendEmailOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Options for bulk sending an email from multiple addresses
 */
@ApiModel(description = "Options for bulk sending an email from multiple addresses")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-15T11:55:03.941557+01:00[Europe/Berlin]")
public class BulkSendEmailOptions {
  public static final String SERIALIZED_NAME_INBOX_IDS = "inboxIds";
  @SerializedName(SERIALIZED_NAME_INBOX_IDS)
  private List<UUID> inboxIds = null;

  public static final String SERIALIZED_NAME_SEND_EMAIL_OPTIONS = "sendEmailOptions";
  @SerializedName(SERIALIZED_NAME_SEND_EMAIL_OPTIONS)
  private SendEmailOptions sendEmailOptions;


  public BulkSendEmailOptions inboxIds(List<UUID> inboxIds) {
    
    this.inboxIds = inboxIds;
    return this;
  }

  public BulkSendEmailOptions addInboxIdsItem(UUID inboxIdsItem) {
    if (this.inboxIds == null) {
      this.inboxIds = new ArrayList<UUID>();
    }
    this.inboxIds.add(inboxIdsItem);
    return this;
  }

   /**
   * Inboxes to send the email from
   * @return inboxIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Inboxes to send the email from")

  public List<UUID> getInboxIds() {
    return inboxIds;
  }


  public void setInboxIds(List<UUID> inboxIds) {
    this.inboxIds = inboxIds;
  }


  public BulkSendEmailOptions sendEmailOptions(SendEmailOptions sendEmailOptions) {
    
    this.sendEmailOptions = sendEmailOptions;
    return this;
  }

   /**
   * Get sendEmailOptions
   * @return sendEmailOptions
  **/
  @ApiModelProperty(required = true, value = "")

  public SendEmailOptions getSendEmailOptions() {
    return sendEmailOptions;
  }


  public void setSendEmailOptions(SendEmailOptions sendEmailOptions) {
    this.sendEmailOptions = sendEmailOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSendEmailOptions bulkSendEmailOptions = (BulkSendEmailOptions) o;
    return Objects.equals(this.inboxIds, bulkSendEmailOptions.inboxIds) &&
        Objects.equals(this.sendEmailOptions, bulkSendEmailOptions.sendEmailOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboxIds, sendEmailOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendEmailOptions {\n");
    sb.append("    inboxIds: ").append(toIndentedString(inboxIds)).append("\n");
    sb.append("    sendEmailOptions: ").append(toIndentedString(sendEmailOptions)).append("\n");
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

