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
import com.mailslurp.models.SendEmailOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Bulk sending options
 */
@ApiModel(description = "Bulk sending options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-28T13:46:52.807793+02:00[Europe/Berlin]")
public class BulkSendEmailOptions {
  public static final String SERIALIZED_NAME_INBOX_IDS = "inboxIds";
  @SerializedName(SERIALIZED_NAME_INBOX_IDS)
  private List<UUID> inboxIds = null;

  public static final String SERIALIZED_NAME_SEND_EMAIL_OPTIONS = "sendEmailOptions";
  @SerializedName(SERIALIZED_NAME_SEND_EMAIL_OPTIONS)
  private SendEmailOptions sendEmailOptions = null;

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
   * Inboxes to send from
   * @return inboxIds
  **/
  @ApiModelProperty(value = "Inboxes to send from")
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
    return ObjectUtils.equals(this.inboxIds, bulkSendEmailOptions.inboxIds) &&
    ObjectUtils.equals(this.sendEmailOptions, bulkSendEmailOptions.sendEmailOptions);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(inboxIds, sendEmailOptions);
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
