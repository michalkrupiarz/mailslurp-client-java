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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Preview of an email message. For full message call the email endpoints with the provided email id.
 */
@ApiModel(description = "Preview of an email message. For full message call the email endpoints with the provided email id.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-16T15:06:53.253313+01:00[Europe/Berlin]")
public class EmailPreview {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments = null;

  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private List<String> bcc = null;

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private List<String> cc = null;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_READ = "read";
  @SerializedName(SERIALIZED_NAME_READ)
  private Boolean read;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = new ArrayList<String>();


  public EmailPreview attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public EmailPreview addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<String>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  public EmailPreview bcc(List<String> bcc) {
    
    this.bcc = bcc;
    return this;
  }

  public EmailPreview addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<String>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * Get bcc
   * @return bcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBcc() {
    return bcc;
  }


  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }


  public EmailPreview cc(List<String> cc) {
    
    this.cc = cc;
    return this;
  }

  public EmailPreview addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<String>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCc() {
    return cc;
  }


  public void setCc(List<String> cc) {
    this.cc = cc;
  }


  public EmailPreview created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public EmailPreview createdAt(OffsetDateTime createdAt) {
    
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


  public EmailPreview id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the Email.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the Email.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public EmailPreview read(Boolean read) {
    
    this.read = read;
    return this;
  }

   /**
   * Get read
   * @return read
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRead() {
    return read;
  }


  public void setRead(Boolean read) {
    this.read = read;
  }


  public EmailPreview subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public EmailPreview to(List<String> to) {
    
    this.to = to;
    return this;
  }

  public EmailPreview addToItem(String toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getTo() {
    return to;
  }


  public void setTo(List<String> to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailPreview emailPreview = (EmailPreview) o;
    return Objects.equals(this.attachments, emailPreview.attachments) &&
        Objects.equals(this.bcc, emailPreview.bcc) &&
        Objects.equals(this.cc, emailPreview.cc) &&
        Objects.equals(this.created, emailPreview.created) &&
        Objects.equals(this.createdAt, emailPreview.createdAt) &&
        Objects.equals(this.id, emailPreview.id) &&
        Objects.equals(this.read, emailPreview.read) &&
        Objects.equals(this.subject, emailPreview.subject) &&
        Objects.equals(this.to, emailPreview.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, bcc, cc, created, createdAt, id, read, subject, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailPreview {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

