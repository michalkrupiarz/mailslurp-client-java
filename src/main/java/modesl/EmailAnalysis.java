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


package modesl;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Analysis of email
 */
@ApiModel(description = "Analysis of email")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-27T13:16:19.017658+02:00[Europe/Berlin]")
public class EmailAnalysis {
  public static final String SERIALIZED_NAME_DKIM_VERDICT = "dkimVerdict";
  @SerializedName(SERIALIZED_NAME_DKIM_VERDICT)
  private String dkimVerdict;

  public static final String SERIALIZED_NAME_DMARC_VERDICT = "dmarcVerdict";
  @SerializedName(SERIALIZED_NAME_DMARC_VERDICT)
  private String dmarcVerdict;

  public static final String SERIALIZED_NAME_SPAM_VERDICT = "spamVerdict";
  @SerializedName(SERIALIZED_NAME_SPAM_VERDICT)
  private String spamVerdict;

  public static final String SERIALIZED_NAME_SPF_VERDICT = "spfVerdict";
  @SerializedName(SERIALIZED_NAME_SPF_VERDICT)
  private String spfVerdict;

  public static final String SERIALIZED_NAME_VIRUS_VERDICT = "virusVerdict";
  @SerializedName(SERIALIZED_NAME_VIRUS_VERDICT)
  private String virusVerdict;

  public EmailAnalysis dkimVerdict(String dkimVerdict) {
    this.dkimVerdict = dkimVerdict;
    return this;
  }

   /**
   * Get dkimVerdict
   * @return dkimVerdict
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDkimVerdict() {
    return dkimVerdict;
  }

  public void setDkimVerdict(String dkimVerdict) {
    this.dkimVerdict = dkimVerdict;
  }

  public EmailAnalysis dmarcVerdict(String dmarcVerdict) {
    this.dmarcVerdict = dmarcVerdict;
    return this;
  }

   /**
   * Get dmarcVerdict
   * @return dmarcVerdict
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDmarcVerdict() {
    return dmarcVerdict;
  }

  public void setDmarcVerdict(String dmarcVerdict) {
    this.dmarcVerdict = dmarcVerdict;
  }

  public EmailAnalysis spamVerdict(String spamVerdict) {
    this.spamVerdict = spamVerdict;
    return this;
  }

   /**
   * Get spamVerdict
   * @return spamVerdict
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSpamVerdict() {
    return spamVerdict;
  }

  public void setSpamVerdict(String spamVerdict) {
    this.spamVerdict = spamVerdict;
  }

  public EmailAnalysis spfVerdict(String spfVerdict) {
    this.spfVerdict = spfVerdict;
    return this;
  }

   /**
   * Get spfVerdict
   * @return spfVerdict
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSpfVerdict() {
    return spfVerdict;
  }

  public void setSpfVerdict(String spfVerdict) {
    this.spfVerdict = spfVerdict;
  }

  public EmailAnalysis virusVerdict(String virusVerdict) {
    this.virusVerdict = virusVerdict;
    return this;
  }

   /**
   * Get virusVerdict
   * @return virusVerdict
  **/
  @ApiModelProperty(required = true, value = "")
  public String getVirusVerdict() {
    return virusVerdict;
  }

  public void setVirusVerdict(String virusVerdict) {
    this.virusVerdict = virusVerdict;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailAnalysis emailAnalysis = (EmailAnalysis) o;
    return ObjectUtils.equals(this.dkimVerdict, emailAnalysis.dkimVerdict) &&
    ObjectUtils.equals(this.dmarcVerdict, emailAnalysis.dmarcVerdict) &&
    ObjectUtils.equals(this.spamVerdict, emailAnalysis.spamVerdict) &&
    ObjectUtils.equals(this.spfVerdict, emailAnalysis.spfVerdict) &&
    ObjectUtils.equals(this.virusVerdict, emailAnalysis.virusVerdict);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(dkimVerdict, dmarcVerdict, spamVerdict, spfVerdict, virusVerdict);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAnalysis {\n");
    
    sb.append("    dkimVerdict: ").append(toIndentedString(dkimVerdict)).append("\n");
    sb.append("    dmarcVerdict: ").append(toIndentedString(dmarcVerdict)).append("\n");
    sb.append("    spamVerdict: ").append(toIndentedString(spamVerdict)).append("\n");
    sb.append("    spfVerdict: ").append(toIndentedString(spfVerdict)).append("\n");
    sb.append("    virusVerdict: ").append(toIndentedString(virusVerdict)).append("\n");
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

