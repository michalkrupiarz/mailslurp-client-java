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
 * Sort
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-29T20:55:35.418+02:00[Europe/Berlin]")
public class Sort {
  public static final String SERIALIZED_NAME_SORTED = "sorted";
  @SerializedName(SERIALIZED_NAME_SORTED)
  private Boolean sorted;

  public static final String SERIALIZED_NAME_UNSORTED = "unsorted";
  @SerializedName(SERIALIZED_NAME_UNSORTED)
  private Boolean unsorted;

  public Sort sorted(Boolean sorted) {
    this.sorted = sorted;
    return this;
  }

   /**
   * Get sorted
   * @return sorted
  **/
  @ApiModelProperty(value = "")
  public Boolean getSorted() {
    return sorted;
  }

  public void setSorted(Boolean sorted) {
    this.sorted = sorted;
  }

  public Sort unsorted(Boolean unsorted) {
    this.unsorted = unsorted;
    return this;
  }

   /**
   * Get unsorted
   * @return unsorted
  **/
  @ApiModelProperty(value = "")
  public Boolean getUnsorted() {
    return unsorted;
  }

  public void setUnsorted(Boolean unsorted) {
    this.unsorted = unsorted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sort sort = (Sort) o;
    return Objects.equals(this.sorted, sort.sorted) &&
        Objects.equals(this.unsorted, sort.unsorted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sorted, unsorted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sort {\n");
    
    sb.append("    sorted: ").append(toIndentedString(sorted)).append("\n");
    sb.append("    unsorted: ").append(toIndentedString(unsorted)).append("\n");
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
