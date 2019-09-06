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
import java.util.ArrayList;
import java.util.List;

/**
 * Options for sending an email message from an inbox
 */
@ApiModel(description = "Options for sending an email message from an inbox")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-06T21:36:20.774+02:00[Europe/Berlin]")
public class SendEmailOptions {
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

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_HTML = "html";
  @SerializedName(SERIALIZED_NAME_HTML)
  private Boolean html;

  public static final String SERIALIZED_NAME_REPLY_TO = "replyTo";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private String replyTo;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = new ArrayList<String>();

  public SendEmailOptions bcc(List<String> bcc) {
    this.bcc = bcc;
    return this;
  }

  public SendEmailOptions addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<String>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * Optional list of bcc destination email addresses
   * @return bcc
  **/
  @ApiModelProperty(value = "Optional list of bcc destination email addresses")
  public List<String> getBcc() {
    return bcc;
  }

  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }

  public SendEmailOptions body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Contents of email
   * @return body
  **/
  @ApiModelProperty(value = "Contents of email")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public SendEmailOptions cc(List<String> cc) {
    this.cc = cc;
    return this;
  }

  public SendEmailOptions addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<String>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Optional list of cc destination email addresses
   * @return cc
  **/
  @ApiModelProperty(value = "Optional list of cc destination email addresses")
  public List<String> getCc() {
    return cc;
  }

  public void setCc(List<String> cc) {
    this.cc = cc;
  }

  public SendEmailOptions charset(String charset) {
    this.charset = charset;
    return this;
  }

   /**
   * Optional charset
   * @return charset
  **/
  @ApiModelProperty(value = "Optional charset")
  public String getCharset() {
    return charset;
  }

  public void setCharset(String charset) {
    this.charset = charset;
  }

  public SendEmailOptions from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Optional from address. If not set source inbox address will be used
   * @return from
  **/
  @ApiModelProperty(value = "Optional from address. If not set source inbox address will be used")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public SendEmailOptions html(Boolean html) {
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

  public SendEmailOptions replyTo(String replyTo) {
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Optional replyTo header
   * @return replyTo
  **/
  @ApiModelProperty(value = "Optional replyTo header")
  public String getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }

  public SendEmailOptions subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Optional email subject line
   * @return subject
  **/
  @ApiModelProperty(value = "Optional email subject line")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public SendEmailOptions to(List<String> to) {
    this.to = to;
    return this;
  }

  public SendEmailOptions addToItem(String toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * List of destination email addresses. Even single recipients must be in array form.
   * @return to
  **/
  @ApiModelProperty(required = true, value = "List of destination email addresses. Even single recipients must be in array form.")
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
    SendEmailOptions sendEmailOptions = (SendEmailOptions) o;
    return ObjectUtils.equals(this.bcc, sendEmailOptions.bcc) &&
    ObjectUtils.equals(this.body, sendEmailOptions.body) &&
    ObjectUtils.equals(this.cc, sendEmailOptions.cc) &&
    ObjectUtils.equals(this.charset, sendEmailOptions.charset) &&
    ObjectUtils.equals(this.from, sendEmailOptions.from) &&
    ObjectUtils.equals(this.html, sendEmailOptions.html) &&
    ObjectUtils.equals(this.replyTo, sendEmailOptions.replyTo) &&
    ObjectUtils.equals(this.subject, sendEmailOptions.subject) &&
    ObjectUtils.equals(this.to, sendEmailOptions.to);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(bcc, body, cc, charset, from, html, replyTo, subject, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEmailOptions {\n");
    
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
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

