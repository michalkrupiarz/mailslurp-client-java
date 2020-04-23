/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: beb7302db3b2458f4bba957b81a42c95e2289b11
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
import com.mailslurp.models.EmailAnalysis;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Email model (also referred to as EmailDto). Represents an email that was received by an inbox. If you want the original SMTP message see the &#x60;getRawEmail&#x60; endpoint.
 */
@ApiModel(description = "Email model (also referred to as EmailDto). Represents an email that was received by an inbox. If you want the original SMTP message see the `getRawEmail` endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-23T11:40:26.387+02:00[Europe/Berlin]")
public class Email {
  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private EmailAnalysis analysis;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments = null;

  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private List<String> bcc = null;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private List<String> cc = null;

  public static final String SERIALIZED_NAME_CHARSET = "charset";
  @SerializedName(SERIALIZED_NAME_CHARSET)
  private String charset;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, String> headers = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  public static final String SERIALIZED_NAME_IS_H_T_M_L = "isHTML";
  @SerializedName(SERIALIZED_NAME_IS_H_T_M_L)
  private Boolean isHTML;

  public static final String SERIALIZED_NAME_READ = "read";
  @SerializedName(SERIALIZED_NAME_READ)
  private Boolean read;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = null;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;


  public Email analysis(EmailAnalysis analysis) {
    
    this.analysis = analysis;
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmailAnalysis getAnalysis() {
    return analysis;
  }


  public void setAnalysis(EmailAnalysis analysis) {
    this.analysis = analysis;
  }


  public Email attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public Email addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<String>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension.
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension.")

  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  public Email bcc(List<String> bcc) {
    
    this.bcc = bcc;
    return this;
  }

  public Email addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<String>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * List of &#x60;BCC&#x60; recipients email was addressed to
   * @return bcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of `BCC` recipients email was addressed to")

  public List<String> getBcc() {
    return bcc;
  }


  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }


  public Email body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The body of the email message
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The body of the email message")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public Email cc(List<String> cc) {
    
    this.cc = cc;
    return this;
  }

  public Email addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<String>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * List of &#x60;CC&#x60; recipients email was addressed to
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of `CC` recipients email was addressed to")

  public List<String> getCc() {
    return cc;
  }


  public void setCc(List<String> cc) {
    this.cc = cc;
  }


  public Email charset(String charset) {
    
    this.charset = charset;
    return this;
  }

   /**
   * Detected character set of the email body such as UTF-8
   * @return charset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Detected character set of the email body such as UTF-8")

  public String getCharset() {
    return charset;
  }


  public void setCharset(String charset) {
    this.charset = charset;
  }


  public Email createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When was the email received by MailSlurp
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When was the email received by MailSlurp")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Email from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Who the email was sent from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Who the email was sent from")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public Email headers(Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public Email putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, String>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  public Email id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the email
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the email")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Email inboxId(UUID inboxId) {
    
    this.inboxId = inboxId;
    return this;
  }

   /**
   * ID of the inbox that received the email
   * @return inboxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the inbox that received the email")

  public UUID getInboxId() {
    return inboxId;
  }


  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }


  public Email isHTML(Boolean isHTML) {
    
    this.isHTML = isHTML;
    return this;
  }

   /**
   * Was HTML sent in the email body
   * @return isHTML
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Was HTML sent in the email body")

  public Boolean getIsHTML() {
    return isHTML;
  }


  public void setIsHTML(Boolean isHTML) {
    this.isHTML = isHTML;
  }


  public Email read(Boolean read) {
    
    this.read = read;
    return this;
  }

   /**
   * Has the email been viewed ever
   * @return read
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Has the email been viewed ever")

  public Boolean getRead() {
    return read;
  }


  public void setRead(Boolean read) {
    this.read = read;
  }


  public Email subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The subject line of the email message
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject line of the email message")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public Email to(List<String> to) {
    
    this.to = to;
    return this;
  }

  public Email addToItem(String toItem) {
    if (this.to == null) {
      this.to = new ArrayList<String>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * List of &#x60;To&#x60; recipients email was addressed to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of `To` recipients email was addressed to")

  public List<String> getTo() {
    return to;
  }


  public void setTo(List<String> to) {
    this.to = to;
  }


  public Email updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * When was the email last updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When was the email last updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Email userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * ID of user that email belongs
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of user that email belongs")

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
    Email email = (Email) o;
    return Objects.equals(this.analysis, email.analysis) &&
        Objects.equals(this.attachments, email.attachments) &&
        Objects.equals(this.bcc, email.bcc) &&
        Objects.equals(this.body, email.body) &&
        Objects.equals(this.cc, email.cc) &&
        Objects.equals(this.charset, email.charset) &&
        Objects.equals(this.createdAt, email.createdAt) &&
        Objects.equals(this.from, email.from) &&
        Objects.equals(this.headers, email.headers) &&
        Objects.equals(this.id, email.id) &&
        Objects.equals(this.inboxId, email.inboxId) &&
        Objects.equals(this.isHTML, email.isHTML) &&
        Objects.equals(this.read, email.read) &&
        Objects.equals(this.subject, email.subject) &&
        Objects.equals(this.to, email.to) &&
        Objects.equals(this.updatedAt, email.updatedAt) &&
        Objects.equals(this.userId, email.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysis, attachments, bcc, body, cc, charset, createdAt, from, headers, id, inboxId, isHTML, read, subject, to, updatedAt, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    isHTML: ").append(toIndentedString(isHTML)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

