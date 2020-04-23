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
 * Options for matching emails in an inbox. Each match option object contains a &#x60;field&#x60;, &#x60;should&#x60; and &#x60;value&#x60; property. Together they form logical conditions such as &#x60;SUBJECT&#x60; should &#x60;CONTAIN&#x60; value.
 */
@ApiModel(description = "Options for matching emails in an inbox. Each match option object contains a `field`, `should` and `value` property. Together they form logical conditions such as `SUBJECT` should `CONTAIN` value.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-23T11:40:26.387+02:00[Europe/Berlin]")
public class MatchOption {
  /**
   * The email property to match on. One of SUBJECT, TO, BCC, CC or FROM
   */
  @JsonAdapter(FieldEnum.Adapter.class)
  public enum FieldEnum {
    SUBJECT("SUBJECT"),
    
    TO("TO"),
    
    BCC("BCC"),
    
    CC("CC"),
    
    FROM("FROM");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldEnum fromValue(String value) {
      for (FieldEnum b : FieldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FieldEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private FieldEnum field;

  /**
   * What criteria to apply. CONTAIN or EQUAL. Note CONTAIN is recommended due to some SMTP servers adding new lines to fields and body content.
   */
  @JsonAdapter(ShouldEnum.Adapter.class)
  public enum ShouldEnum {
    CONTAIN("CONTAIN"),
    
    EQUAL("EQUAL");

    private String value;

    ShouldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShouldEnum fromValue(String value) {
      for (ShouldEnum b : ShouldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShouldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShouldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShouldEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShouldEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHOULD = "should";
  @SerializedName(SERIALIZED_NAME_SHOULD)
  private ShouldEnum should;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public MatchOption field(FieldEnum field) {
    
    this.field = field;
    return this;
  }

   /**
   * The email property to match on. One of SUBJECT, TO, BCC, CC or FROM
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email property to match on. One of SUBJECT, TO, BCC, CC or FROM")

  public FieldEnum getField() {
    return field;
  }


  public void setField(FieldEnum field) {
    this.field = field;
  }


  public MatchOption should(ShouldEnum should) {
    
    this.should = should;
    return this;
  }

   /**
   * What criteria to apply. CONTAIN or EQUAL. Note CONTAIN is recommended due to some SMTP servers adding new lines to fields and body content.
   * @return should
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "What criteria to apply. CONTAIN or EQUAL. Note CONTAIN is recommended due to some SMTP servers adding new lines to fields and body content.")

  public ShouldEnum getShould() {
    return should;
  }


  public void setShould(ShouldEnum should) {
    this.should = should;
  }


  public MatchOption value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value you wish to compare with the value of the field specified using the &#x60;should&#x60; value passed. For example &#x60;BODY&#x60; should &#x60;CONTAIN&#x60; a value passed.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value you wish to compare with the value of the field specified using the `should` value passed. For example `BODY` should `CONTAIN` a value passed.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchOption matchOption = (MatchOption) o;
    return Objects.equals(this.field, matchOption.field) &&
        Objects.equals(this.should, matchOption.should) &&
        Objects.equals(this.value, matchOption.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, should, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchOption {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    should: ").append(toIndentedString(should)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

