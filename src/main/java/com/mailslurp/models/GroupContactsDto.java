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
import com.mailslurp.models.ContactDto;
import com.mailslurp.models.GroupDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GroupContactsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-23T11:40:26.387+02:00[Europe/Berlin]")
public class GroupContactsDto {
  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<ContactDto> contacts = new ArrayList<ContactDto>();

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private GroupDto group;


  public GroupContactsDto contacts(List<ContactDto> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public GroupContactsDto addContactsItem(ContactDto contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ContactDto> getContacts() {
    return contacts;
  }


  public void setContacts(List<ContactDto> contacts) {
    this.contacts = contacts;
  }


  public GroupContactsDto group(GroupDto group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(required = true, value = "")

  public GroupDto getGroup() {
    return group;
  }


  public void setGroup(GroupDto group) {
    this.group = group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupContactsDto groupContactsDto = (GroupContactsDto) o;
    return Objects.equals(this.contacts, groupContactsDto.contacts) &&
        Objects.equals(this.group, groupContactsDto.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contacts, group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupContactsDto {\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

