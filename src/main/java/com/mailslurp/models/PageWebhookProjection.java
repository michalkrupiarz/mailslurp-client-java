/*
 * MailSlurp API
 * ## Introduction  [MailSlurp](https://www.mailslurp.com) is an Email API for developers and QA testers. It let's users: - create emails addresses on demand - receive emails and attachments in code - send templated HTML emails  ## About  This page contains the REST API documentation for MailSlurp. All requests require API Key authentication passed as an `x-api-key` header.  Create an account to [get your free API Key](https://app.mailslurp.com/sign-up/).  ## Resources - 🔑 [Get API Key](https://app.mailslurp.com/sign-up/)                    - 🎓 [Developer Portal](https://www.mailslurp.com/docs/)           - 📦 [Library SDKs](https://www.mailslurp.com/docs/) - ✍️ [Code Examples](https://www.mailslurp.com/examples) - ⚠️ [Report an issue](https://drift.me/mailslurp)  ## Explore  
 *
 * The version of the OpenAPI document: 6.5.2
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
import com.mailslurp.models.Pageable;
import com.mailslurp.models.Sort;
import com.mailslurp.models.WebhookProjection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PageWebhookProjection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-16T15:06:53.253313+01:00[Europe/Berlin]")
public class PageWebhookProjection {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<WebhookProjection> content = null;

  public static final String SERIALIZED_NAME_EMPTY = "empty";
  @SerializedName(SERIALIZED_NAME_EMPTY)
  private Boolean empty;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private Boolean first;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private Boolean last;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_NUMBER_OF_ELEMENTS = "numberOfElements";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_ELEMENTS)
  private Integer numberOfElements;

  public static final String SERIALIZED_NAME_PAGEABLE = "pageable";
  @SerializedName(SERIALIZED_NAME_PAGEABLE)
  private Pageable pageable;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private Sort sort;

  public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";
  @SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
  private Long totalElements;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;


  public PageWebhookProjection content(List<WebhookProjection> content) {
    
    this.content = content;
    return this;
  }

  public PageWebhookProjection addContentItem(WebhookProjection contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<WebhookProjection>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WebhookProjection> getContent() {
    return content;
  }


  public void setContent(List<WebhookProjection> content) {
    this.content = content;
  }


  public PageWebhookProjection empty(Boolean empty) {
    
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEmpty() {
    return empty;
  }


  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }


  public PageWebhookProjection first(Boolean first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFirst() {
    return first;
  }


  public void setFirst(Boolean first) {
    this.first = first;
  }


  public PageWebhookProjection last(Boolean last) {
    
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLast() {
    return last;
  }


  public void setLast(Boolean last) {
    this.last = last;
  }


  public PageWebhookProjection number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  public PageWebhookProjection numberOfElements(Integer numberOfElements) {
    
    this.numberOfElements = numberOfElements;
    return this;
  }

   /**
   * Get numberOfElements
   * @return numberOfElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberOfElements() {
    return numberOfElements;
  }


  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }


  public PageWebhookProjection pageable(Pageable pageable) {
    
    this.pageable = pageable;
    return this;
  }

   /**
   * Get pageable
   * @return pageable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pageable getPageable() {
    return pageable;
  }


  public void setPageable(Pageable pageable) {
    this.pageable = pageable;
  }


  public PageWebhookProjection size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public PageWebhookProjection sort(Sort sort) {
    
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Sort getSort() {
    return sort;
  }


  public void setSort(Sort sort) {
    this.sort = sort;
  }


  public PageWebhookProjection totalElements(Long totalElements) {
    
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Get totalElements
   * @return totalElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalElements() {
    return totalElements;
  }


  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }


  public PageWebhookProjection totalPages(Integer totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageWebhookProjection page«WebhookProjection» = (PageWebhookProjection) o;
    return Objects.equals(this.content, page«WebhookProjection».content) &&
        Objects.equals(this.empty, page«WebhookProjection».empty) &&
        Objects.equals(this.first, page«WebhookProjection».first) &&
        Objects.equals(this.last, page«WebhookProjection».last) &&
        Objects.equals(this.number, page«WebhookProjection».number) &&
        Objects.equals(this.numberOfElements, page«WebhookProjection».numberOfElements) &&
        Objects.equals(this.pageable, page«WebhookProjection».pageable) &&
        Objects.equals(this.size, page«WebhookProjection».size) &&
        Objects.equals(this.sort, page«WebhookProjection».sort) &&
        Objects.equals(this.totalElements, page«WebhookProjection».totalElements) &&
        Objects.equals(this.totalPages, page«WebhookProjection».totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, empty, first, last, number, numberOfElements, pageable, size, sort, totalElements, totalPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageWebhookProjection {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    pageable: ").append(toIndentedString(pageable)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

