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
import com.mailslurp.models.JsonNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * CreateContactOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-15T11:59:35.364694+01:00[Europe/Berlin]")
public class CreateContactOptions {
  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "emailAddresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private List<String> emailAddresses = null;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private UUID groupId;

  public static final String SERIALIZED_NAME_META_DATA = "metaData";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private JsonNode metaData;

  public static final String SERIALIZED_NAME_OPT_OUT = "optOut";
  @SerializedName(SERIALIZED_NAME_OPT_OUT)
  private Boolean optOut;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;


  public CreateContactOptions emailAddresses(List<String> emailAddresses) {
    
    this.emailAddresses = emailAddresses;
    return this;
  }

  public CreateContactOptions addEmailAddressesItem(String emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<String>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Set of email addresses belonging to the contact
   * @return emailAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set of email addresses belonging to the contact")

  public List<String> getEmailAddresses() {
    return emailAddresses;
  }


  public void setEmailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }


  public CreateContactOptions firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CreateContactOptions groupId(UUID groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Group IDs that contact belongs to
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group IDs that contact belongs to")

  public UUID getGroupId() {
    return groupId;
  }


  public void setGroupId(UUID groupId) {
    this.groupId = groupId;
  }


  public CreateContactOptions metaData(JsonNode metaData) {
    
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonNode getMetaData() {
    return metaData;
  }


  public void setMetaData(JsonNode metaData) {
    this.metaData = metaData;
  }


  public CreateContactOptions optOut(Boolean optOut) {
    
    this.optOut = optOut;
    return this;
  }

   /**
   * Has the user explicitly or implicitly opted out of being contacted? If so MailSlurp will ignore them in all actions.
   * @return optOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Has the user explicitly or implicitly opted out of being contacted? If so MailSlurp will ignore them in all actions.")

  public Boolean getOptOut() {
    return optOut;
  }


  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }


  public CreateContactOptions tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateContactOptions addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags that can be used to search and group contacts
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags that can be used to search and group contacts")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public CreateContactOptions lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CreateContactOptions company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContactOptions createContactOptions = (CreateContactOptions) o;
    return Objects.equals(this.emailAddresses, createContactOptions.emailAddresses) &&
        Objects.equals(this.firstName, createContactOptions.firstName) &&
        Objects.equals(this.groupId, createContactOptions.groupId) &&
        Objects.equals(this.metaData, createContactOptions.metaData) &&
        Objects.equals(this.optOut, createContactOptions.optOut) &&
        Objects.equals(this.tags, createContactOptions.tags) &&
        Objects.equals(this.lastName, createContactOptions.lastName) &&
        Objects.equals(this.company, createContactOptions.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddresses, firstName, groupId, metaData, optOut, tags, lastName, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContactOptions {\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    optOut: ").append(toIndentedString(optOut)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

