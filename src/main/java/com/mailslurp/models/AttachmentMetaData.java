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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Meta data associated with an attachment. Attachments are stored as byte blobs so the meta data is stored separately.
 */
@ApiModel(description = "Meta data associated with an attachment. Attachments are stored as byte blobs so the meta data is stored separately.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-23T11:40:26.387+02:00[Europe/Berlin]")
public class AttachmentMetaData {
  public static final String SERIALIZED_NAME_CONTENT_LENGTH = "contentLength";
  @SerializedName(SERIALIZED_NAME_CONTENT_LENGTH)
  private Long contentLength;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public AttachmentMetaData contentLength(Long contentLength) {
    
    this.contentLength = contentLength;
    return this;
  }

   /**
   * Size of attachment in bytes
   * @return contentLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of attachment in bytes")

  public Long getContentLength() {
    return contentLength;
  }


  public void setContentLength(Long contentLength) {
    this.contentLength = contentLength;
  }


  public AttachmentMetaData contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Content type of attachment
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Content type of attachment")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public AttachmentMetaData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of attachment
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of attachment")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AttachmentMetaData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of attachment
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of attachment")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentMetaData attachmentMetaData = (AttachmentMetaData) o;
    return Objects.equals(this.contentLength, attachmentMetaData.contentLength) &&
        Objects.equals(this.contentType, attachmentMetaData.contentType) &&
        Objects.equals(this.id, attachmentMetaData.id) &&
        Objects.equals(this.name, attachmentMetaData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLength, contentType, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentMetaData {\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

