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
import com.mailslurp.models.ValidationMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HTMLValidationResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T12:57:19.939+02:00[Europe/Berlin]")
public class HTMLValidationResult {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ValidationMessage> errors = new ArrayList<ValidationMessage>();

  public static final String SERIALIZED_NAME_IS_VALID = "isValid";
  @SerializedName(SERIALIZED_NAME_IS_VALID)
  private Boolean isValid;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<ValidationMessage> warnings = new ArrayList<ValidationMessage>();


  public HTMLValidationResult errors(List<ValidationMessage> errors) {
    
    this.errors = errors;
    return this;
  }

  public HTMLValidationResult addErrorsItem(ValidationMessage errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ValidationMessage> getErrors() {
    return errors;
  }


  public void setErrors(List<ValidationMessage> errors) {
    this.errors = errors;
  }


  public HTMLValidationResult isValid(Boolean isValid) {
    
    this.isValid = isValid;
    return this;
  }

   /**
   * Get isValid
   * @return isValid
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsValid() {
    return isValid;
  }


  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }


  public HTMLValidationResult warnings(List<ValidationMessage> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public HTMLValidationResult addWarningsItem(ValidationMessage warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ValidationMessage> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<ValidationMessage> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTMLValidationResult htMLValidationResult = (HTMLValidationResult) o;
    return Objects.equals(this.errors, htMLValidationResult.errors) &&
        Objects.equals(this.isValid, htMLValidationResult.isValid) &&
        Objects.equals(this.warnings, htMLValidationResult.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, isValid, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTMLValidationResult {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

