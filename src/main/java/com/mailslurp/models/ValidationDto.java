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
import com.mailslurp.models.HTMLValidationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * ValidationDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-15T11:59:35.364694+01:00[Europe/Berlin]")
public class ValidationDto {
  public static final String SERIALIZED_NAME_EMAIL_ID = "emailId";
  @SerializedName(SERIALIZED_NAME_EMAIL_ID)
  private UUID emailId;

  public static final String SERIALIZED_NAME_HTML = "html";
  @SerializedName(SERIALIZED_NAME_HTML)
  private HTMLValidationResult html;


  public ValidationDto emailId(UUID emailId) {
    
    this.emailId = emailId;
    return this;
  }

   /**
   * Get emailId
   * @return emailId
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getEmailId() {
    return emailId;
  }


  public void setEmailId(UUID emailId) {
    this.emailId = emailId;
  }


  public ValidationDto html(HTMLValidationResult html) {
    
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @ApiModelProperty(required = true, value = "")

  public HTMLValidationResult getHtml() {
    return html;
  }


  public void setHtml(HTMLValidationResult html) {
    this.html = html;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationDto validationDto = (ValidationDto) o;
    return Objects.equals(this.emailId, validationDto.emailId) &&
        Objects.equals(this.html, validationDto.html);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailId, html);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationDto {\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
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

