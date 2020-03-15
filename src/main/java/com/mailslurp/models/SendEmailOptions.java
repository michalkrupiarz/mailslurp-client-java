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
import java.util.UUID;

/**
 * Options for sending an email message from an inbox. You must provide one of: &#x60;to&#x60;, &#x60;toGroup&#x60;, or &#x60;toContacts&#x60; to send an email. All other parameters are optional.
 */
@ApiModel(description = "Options for sending an email message from an inbox. You must provide one of: `to`, `toGroup`, or `toContacts` to send an email. All other parameters are optional.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-15T11:55:54.663251+01:00[Europe/Berlin]")
public class SendEmailOptions {
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

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_IS_H_T_M_L = "isHTML";
  @SerializedName(SERIALIZED_NAME_IS_H_T_M_L)
  private Boolean isHTML;

  public static final String SERIALIZED_NAME_REPLY_TO = "replyTo";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private String replyTo;

  /**
   * Optional strategy to use when sending the email
   */
  @JsonAdapter(SendStrategyEnum.Adapter.class)
  public enum SendStrategyEnum {
    SINGLE_MESSAGE("SINGLE_MESSAGE");

    private String value;

    SendStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SendStrategyEnum fromValue(String value) {
      for (SendStrategyEnum b : SendStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SendStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SendStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SendStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SendStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEND_STRATEGY = "sendStrategy";
  @SerializedName(SERIALIZED_NAME_SEND_STRATEGY)
  private SendStrategyEnum sendStrategy;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private UUID template;

  public static final String SERIALIZED_NAME_TEMPLATE_VARIABLES = "templateVariables";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VARIABLES)
  private Object templateVariables;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = null;

  public static final String SERIALIZED_NAME_TO_CONTACTS = "toContacts";
  @SerializedName(SERIALIZED_NAME_TO_CONTACTS)
  private List<UUID> toContacts = null;

  public static final String SERIALIZED_NAME_TO_GROUP = "toGroup";
  @SerializedName(SERIALIZED_NAME_TO_GROUP)
  private UUID toGroup;


  public SendEmailOptions attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public SendEmailOptions addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<String>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Optional list of attachment IDs to send with this email. You must first upload each attachment separately in order to obtain attachment IDs. This way you can reuse attachments with different emails once uploaded.
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional list of attachment IDs to send with this email. You must first upload each attachment separately in order to obtain attachment IDs. This way you can reuse attachments with different emails once uploaded.")

  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


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
  @javax.annotation.Nullable
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
   * Optional contents of email. If body contains HTML then set &#x60;isHTML&#x60; to true to ensure that email clients render it correctly. You can use moustache template syntax in the email body in conjunction with &#x60;toGroup&#x60; contact variables or &#x60;templateVariables&#x60; data. If you need more templating control consider creating a template and using the &#x60;template&#x60; property instead of the body.
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional contents of email. If body contains HTML then set `isHTML` to true to ensure that email clients render it correctly. You can use moustache template syntax in the email body in conjunction with `toGroup` contact variables or `templateVariables` data. If you need more templating control consider creating a template and using the `template` property instead of the body.")

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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
   * Optional from address. If not set the source inbox address will be used for this field. Beware of potential spam penalties when setting this field to an address not used by the inbox. For custom email addresses use a custom domain.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional from address. If not set the source inbox address will be used for this field. Beware of potential spam penalties when setting this field to an address not used by the inbox. For custom email addresses use a custom domain.")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public SendEmailOptions isHTML(Boolean isHTML) {
    
    this.isHTML = isHTML;
    return this;
  }

   /**
   * Optional HTML flag. If true the &#x60;content-type&#x60; of the email will be &#x60;text/html&#x60;. Set to true when sending HTML to ensure proper rending on email clients
   * @return isHTML
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional HTML flag. If true the `content-type` of the email will be `text/html`. Set to true when sending HTML to ensure proper rending on email clients")

  public Boolean getIsHTML() {
    return isHTML;
  }


  public void setIsHTML(Boolean isHTML) {
    this.isHTML = isHTML;
  }


  public SendEmailOptions replyTo(String replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Optional replyTo header
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional replyTo header")

  public String getReplyTo() {
    return replyTo;
  }


  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }


  public SendEmailOptions sendStrategy(SendStrategyEnum sendStrategy) {
    
    this.sendStrategy = sendStrategy;
    return this;
  }

   /**
   * Optional strategy to use when sending the email
   * @return sendStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional strategy to use when sending the email")

  public SendStrategyEnum getSendStrategy() {
    return sendStrategy;
  }


  public void setSendStrategy(SendStrategyEnum sendStrategy) {
    this.sendStrategy = sendStrategy;
  }


  public SendEmailOptions subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Optional email subject line
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional email subject line")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public SendEmailOptions template(UUID template) {
    
    this.template = template;
    return this;
  }

   /**
   * Optional template ID to use for body. Will override body if provided. When using a template make sure you pass the corresponding map of &#x60;templateVariables&#x60;. You can find which variables are needed by fetching the template itself or viewing it in the dashboard.
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional template ID to use for body. Will override body if provided. When using a template make sure you pass the corresponding map of `templateVariables`. You can find which variables are needed by fetching the template itself or viewing it in the dashboard.")

  public UUID getTemplate() {
    return template;
  }


  public void setTemplate(UUID template) {
    this.template = template;
  }


  public SendEmailOptions templateVariables(Object templateVariables) {
    
    this.templateVariables = templateVariables;
    return this;
  }

   /**
   * Optional map of template variables. Will replace moustache syntax variables in subject and body or template with the associated values if found.
   * @return templateVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional map of template variables. Will replace moustache syntax variables in subject and body or template with the associated values if found.")

  public Object getTemplateVariables() {
    return templateVariables;
  }


  public void setTemplateVariables(Object templateVariables) {
    this.templateVariables = templateVariables;
  }


  public SendEmailOptions to(List<String> to) {
    
    this.to = to;
    return this;
  }

  public SendEmailOptions addToItem(String toItem) {
    if (this.to == null) {
      this.to = new ArrayList<String>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * List of destination email addresses. Even single recipients must be in array form. Maximum recipients per email depends on your plan. If you need to send many emails try using contacts or contact groups or use a non standard sendStrategy to ensure that spam filters are not triggered (many recipients in one email can affect your spam rating).
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of destination email addresses. Even single recipients must be in array form. Maximum recipients per email depends on your plan. If you need to send many emails try using contacts or contact groups or use a non standard sendStrategy to ensure that spam filters are not triggered (many recipients in one email can affect your spam rating).")

  public List<String> getTo() {
    return to;
  }


  public void setTo(List<String> to) {
    this.to = to;
  }


  public SendEmailOptions toContacts(List<UUID> toContacts) {
    
    this.toContacts = toContacts;
    return this;
  }

  public SendEmailOptions addToContactsItem(UUID toContactsItem) {
    if (this.toContacts == null) {
      this.toContacts = new ArrayList<UUID>();
    }
    this.toContacts.add(toContactsItem);
    return this;
  }

   /**
   * Optional list of contact IDs to send email to. Manage your contacts via the API or dashboard. When contacts are used the email is sent to each contact separately so they will not see other recipients.
   * @return toContacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional list of contact IDs to send email to. Manage your contacts via the API or dashboard. When contacts are used the email is sent to each contact separately so they will not see other recipients.")

  public List<UUID> getToContacts() {
    return toContacts;
  }


  public void setToContacts(List<UUID> toContacts) {
    this.toContacts = toContacts;
  }


  public SendEmailOptions toGroup(UUID toGroup) {
    
    this.toGroup = toGroup;
    return this;
  }

   /**
   * Optional contact group ID to send email to. You can create contacts and contact groups in the API or dashboard and use them for email campaigns. When contact groups are used the email is sent to each contact separately so they will not see other recipients
   * @return toGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional contact group ID to send email to. You can create contacts and contact groups in the API or dashboard and use them for email campaigns. When contact groups are used the email is sent to each contact separately so they will not see other recipients")

  public UUID getToGroup() {
    return toGroup;
  }


  public void setToGroup(UUID toGroup) {
    this.toGroup = toGroup;
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
    return Objects.equals(this.attachments, sendEmailOptions.attachments) &&
        Objects.equals(this.bcc, sendEmailOptions.bcc) &&
        Objects.equals(this.body, sendEmailOptions.body) &&
        Objects.equals(this.cc, sendEmailOptions.cc) &&
        Objects.equals(this.charset, sendEmailOptions.charset) &&
        Objects.equals(this.from, sendEmailOptions.from) &&
        Objects.equals(this.isHTML, sendEmailOptions.isHTML) &&
        Objects.equals(this.replyTo, sendEmailOptions.replyTo) &&
        Objects.equals(this.sendStrategy, sendEmailOptions.sendStrategy) &&
        Objects.equals(this.subject, sendEmailOptions.subject) &&
        Objects.equals(this.template, sendEmailOptions.template) &&
        Objects.equals(this.templateVariables, sendEmailOptions.templateVariables) &&
        Objects.equals(this.to, sendEmailOptions.to) &&
        Objects.equals(this.toContacts, sendEmailOptions.toContacts) &&
        Objects.equals(this.toGroup, sendEmailOptions.toGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, bcc, body, cc, charset, from, isHTML, replyTo, sendStrategy, subject, template, templateVariables, to, toContacts, toGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEmailOptions {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    isHTML: ").append(toIndentedString(isHTML)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    sendStrategy: ").append(toIndentedString(sendStrategy)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    toContacts: ").append(toIndentedString(toContacts)).append("\n");
    sb.append("    toGroup: ").append(toIndentedString(toGroup)).append("\n");
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

