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

/**
 * Options for uploading files for attachments. When sending emails with the API that require attachments first upload each attachment. Then use the returned attachment ID in your &#x60;SendEmailOptions&#x60; when sending an email. This way you can use attachments multiple times once they have been uploaded.
 */
@ApiModel(description = "Options for uploading files for attachments. When sending emails with the API that require attachments first upload each attachment. Then use the returned attachment ID in your `SendEmailOptions` when sending an email. This way you can use attachments multiple times once they have been uploaded.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-22T14:23:52.628+02:00[Europe/Berlin]")
public class UploadAttachmentOptions {
  public static final String SERIALIZED_NAME_BASE64_CONTENTS = "base64Contents";
  @SerializedName(SERIALIZED_NAME_BASE64_CONTENTS)
  private String base64Contents;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;


  public UploadAttachmentOptions base64Contents(String base64Contents) {
    
    this.base64Contents = base64Contents;
    return this;
  }

   /**
   * Base64 encoded string of file contents
   * @return base64Contents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded string of file contents")

  public String getBase64Contents() {
    return base64Contents;
  }


  public void setBase64Contents(String base64Contents) {
    this.base64Contents = base64Contents;
  }


  public UploadAttachmentOptions contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Optional contentType for file. For instance &#x60;application/pdf&#x60;
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional contentType for file. For instance `application/pdf`")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public UploadAttachmentOptions filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Optional filename to save upload with
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional filename to save upload with")

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadAttachmentOptions uploadAttachmentOptions = (UploadAttachmentOptions) o;
    return Objects.equals(this.base64Contents, uploadAttachmentOptions.base64Contents) &&
        Objects.equals(this.contentType, uploadAttachmentOptions.contentType) &&
        Objects.equals(this.filename, uploadAttachmentOptions.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64Contents, contentType, filename);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadAttachmentOptions {\n");
    sb.append("    base64Contents: ").append(toIndentedString(base64Contents)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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

