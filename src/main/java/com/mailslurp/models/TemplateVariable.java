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
 * TemplateVariable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T12:57:19.939+02:00[Europe/Berlin]")
public class TemplateVariable {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets variableType
   */
  @JsonAdapter(VariableTypeEnum.Adapter.class)
  public enum VariableTypeEnum {
    STRING("STRING");

    private String value;

    VariableTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VariableTypeEnum fromValue(String value) {
      for (VariableTypeEnum b : VariableTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VariableTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VariableTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VariableTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VariableTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VARIABLE_TYPE = "variableType";
  @SerializedName(SERIALIZED_NAME_VARIABLE_TYPE)
  private VariableTypeEnum variableType;


  public TemplateVariable name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TemplateVariable variableType(VariableTypeEnum variableType) {
    
    this.variableType = variableType;
    return this;
  }

   /**
   * Get variableType
   * @return variableType
  **/
  @ApiModelProperty(required = true, value = "")

  public VariableTypeEnum getVariableType() {
    return variableType;
  }


  public void setVariableType(VariableTypeEnum variableType) {
    this.variableType = variableType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateVariable templateVariable = (TemplateVariable) o;
    return Objects.equals(this.name, templateVariable.name) &&
        Objects.equals(this.variableType, templateVariable.variableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, variableType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateVariable {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
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

