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
 * Representation of an email
 */
@ApiModel(description = "Representation of an email")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-18T17:35:42.599+02:00[Europe/Berlin]")
public class Email {
  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private EmailAnalysis analysis = null;

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

  public static final String SERIALIZED_NAME_HTML = "html";
  @SerializedName(SERIALIZED_NAME_HTML)
  private Boolean html;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  public static final String SERIALIZED_NAME_RAW_URL = "rawUrl";
  @SerializedName(SERIALIZED_NAME_RAW_URL)
  private String rawUrl;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = new ArrayList<String>();

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
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "")
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
   * Get bcc
   * @return bcc
  **/
  @ApiModelProperty(value = "")
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
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
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
   * Get cc
   * @return cc
  **/
  @ApiModelProperty(value = "")
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
   * Get charset
   * @return charset
  **/
  @ApiModelProperty(value = "")
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

  public Email from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public Email html(Boolean html) {
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @ApiModelProperty(value = "")
  public Boolean getHtml() {
    return html;
  }

  public void setHtml(Boolean html) {
    this.html = html;
  }

  public Email id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
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
   * Get inboxId
   * @return inboxId
  **/
  @ApiModelProperty(required = true, value = "")
  public UUID getInboxId() {
    return inboxId;
  }

  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }

  public Email rawUrl(String rawUrl) {
    this.rawUrl = rawUrl;
    return this;
  }

   /**
   * Get rawUrl
   * @return rawUrl
  **/
  @ApiModelProperty(value = "")
  public String getRawUrl() {
    return rawUrl;
  }

  public void setRawUrl(String rawUrl) {
    this.rawUrl = rawUrl;
  }

  public Email subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")
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

  public Email updatedAt(OffsetDateTime updatedAt) {
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

  public Email userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
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
        Objects.equals(this.html, email.html) &&
        Objects.equals(this.id, email.id) &&
        Objects.equals(this.inboxId, email.inboxId) &&
        Objects.equals(this.rawUrl, email.rawUrl) &&
        Objects.equals(this.subject, email.subject) &&
        Objects.equals(this.to, email.to) &&
        Objects.equals(this.updatedAt, email.updatedAt) &&
        Objects.equals(this.userId, email.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysis, attachments, bcc, body, cc, charset, createdAt, from, headers, html, id, inboxId, rawUrl, subject, to, updatedAt, userId);
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
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    rawUrl: ").append(toIndentedString(rawUrl)).append("\n");
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

