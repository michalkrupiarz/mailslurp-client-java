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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WebhookTestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T12:57:19.939+02:00[Europe/Berlin]")
public class WebhookTestRequest {
  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, String> headers = new HashMap<String, String>();

  /**
   * Gets or Sets method
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    GET("GET"),
    
    HEAD("HEAD"),
    
    POST("POST"),
    
    PUT("PUT"),
    
    PATCH("PATCH"),
    
    DELETE("DELETE"),
    
    OPTIONS("OPTIONS"),
    
    TRACE("TRACE");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public WebhookTestRequest headers(Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public WebhookTestRequest putHeadersItem(String key, String headersItem) {
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, String> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  public WebhookTestRequest method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(required = true, value = "")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public WebhookTestRequest payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public WebhookTestRequest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookTestRequest webhookTestRequest = (WebhookTestRequest) o;
    return Objects.equals(this.headers, webhookTestRequest.headers) &&
        Objects.equals(this.method, webhookTestRequest.method) &&
        Objects.equals(this.payload, webhookTestRequest.payload) &&
        Objects.equals(this.url, webhookTestRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, method, payload, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookTestRequest {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

