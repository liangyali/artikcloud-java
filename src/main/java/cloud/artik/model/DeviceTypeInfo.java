/*
 * ARTIK Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cloud.artik.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class DeviceTypeInfo {
  @SerializedName("devicePropertiesEnabled")
  private Boolean devicePropertiesEnabled = null;

  @SerializedName("pmax")
  private Integer pmax = null;

  @SerializedName("modifiedOn")
  private Long modifiedOn = null;

  @SerializedName("dtid")
  private String dtid = null;

  @SerializedName("pmin")
  private Integer pmin = null;

  @SerializedName("taskExpiresAfter")
  private Integer taskExpiresAfter = null;

  @SerializedName("createdOn")
  private Long createdOn = null;

  public DeviceTypeInfo devicePropertiesEnabled(Boolean devicePropertiesEnabled) {
    this.devicePropertiesEnabled = devicePropertiesEnabled;
    return this;
  }

   /**
   * Device Properties Enabled
   * @return devicePropertiesEnabled
  **/
  @ApiModelProperty(example = "null", value = "Device Properties Enabled")
  public Boolean getDevicePropertiesEnabled() {
    return devicePropertiesEnabled;
  }

  public void setDevicePropertiesEnabled(Boolean devicePropertiesEnabled) {
    this.devicePropertiesEnabled = devicePropertiesEnabled;
  }

  public DeviceTypeInfo pmax(Integer pmax) {
    this.pmax = pmax;
    return this;
  }

   /**
   * Pmax value
   * @return pmax
  **/
  @ApiModelProperty(example = "null", value = "Pmax value")
  public Integer getPmax() {
    return pmax;
  }

  public void setPmax(Integer pmax) {
    this.pmax = pmax;
  }

  public DeviceTypeInfo modifiedOn(Long modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Modified on
   * @return modifiedOn
  **/
  @ApiModelProperty(example = "null", value = "Modified on")
  public Long getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(Long modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public DeviceTypeInfo dtid(String dtid) {
    this.dtid = dtid;
    return this;
  }

   /**
   * Device Type ID
   * @return dtid
  **/
  @ApiModelProperty(example = "null", value = "Device Type ID")
  public String getDtid() {
    return dtid;
  }

  public void setDtid(String dtid) {
    this.dtid = dtid;
  }

  public DeviceTypeInfo pmin(Integer pmin) {
    this.pmin = pmin;
    return this;
  }

   /**
   * Pmin value
   * @return pmin
  **/
  @ApiModelProperty(example = "null", value = "Pmin value")
  public Integer getPmin() {
    return pmin;
  }

  public void setPmin(Integer pmin) {
    this.pmin = pmin;
  }

  public DeviceTypeInfo taskExpiresAfter(Integer taskExpiresAfter) {
    this.taskExpiresAfter = taskExpiresAfter;
    return this;
  }

   /**
   * Default task expiration time in seconds
   * @return taskExpiresAfter
  **/
  @ApiModelProperty(example = "null", value = "Default task expiration time in seconds")
  public Integer getTaskExpiresAfter() {
    return taskExpiresAfter;
  }

  public void setTaskExpiresAfter(Integer taskExpiresAfter) {
    this.taskExpiresAfter = taskExpiresAfter;
  }

  public DeviceTypeInfo createdOn(Long createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Created on
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "Created on")
  public Long getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceTypeInfo deviceTypeInfo = (DeviceTypeInfo) o;
    return Objects.equals(this.devicePropertiesEnabled, deviceTypeInfo.devicePropertiesEnabled) &&
        Objects.equals(this.pmax, deviceTypeInfo.pmax) &&
        Objects.equals(this.modifiedOn, deviceTypeInfo.modifiedOn) &&
        Objects.equals(this.dtid, deviceTypeInfo.dtid) &&
        Objects.equals(this.pmin, deviceTypeInfo.pmin) &&
        Objects.equals(this.taskExpiresAfter, deviceTypeInfo.taskExpiresAfter) &&
        Objects.equals(this.createdOn, deviceTypeInfo.createdOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devicePropertiesEnabled, pmax, modifiedOn, dtid, pmin, taskExpiresAfter, createdOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypeInfo {\n");
    
    sb.append("    devicePropertiesEnabled: ").append(toIndentedString(devicePropertiesEnabled)).append("\n");
    sb.append("    pmax: ").append(toIndentedString(pmax)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    dtid: ").append(toIndentedString(dtid)).append("\n");
    sb.append("    pmin: ").append(toIndentedString(pmin)).append("\n");
    sb.append("    taskExpiresAfter: ").append(toIndentedString(taskExpiresAfter)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

