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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Options for uploading files for attachments
 */
@ApiModel(description = "Options for uploading files for attachments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-11T16:08:37.473+02:00[Europe/Berlin]")
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
   * Optional contentType for file. For instance application/pdf
   * @return contentType
  **/
  @ApiModelProperty(value = "Optional contentType for file. For instance application/pdf")
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

