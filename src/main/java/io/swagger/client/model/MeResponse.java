/**
 * 
 */
package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author rpombeiro
 *
 */
public class MeResponse {
	@SerializedName("data")
	private Me data = null;
	
	@SerializedName("type")
	private String type = null;
	
	public MeResponse data(Me data) {
		this.data = data;
		return this;
	}
	
	/**
	 * Get data
	 * @return data
	 **/
	@ApiModelProperty(value = "")
	public Me getData() {
		return data;
	}
	  
	/**
	 * @return the type
	 */
	@ApiModelProperty(value = "")
	public String getType() {
		return type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    MeResponse studentResponse = (MeResponse) o;
	    return Objects.equals(this.data, studentResponse.data) &&
	    		Objects.equals(this.type, studentResponse.type);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data, type);
	}
	
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class CleverMeResponse {\n");
	
		sb.append("    data: ").append(toIndentedString(data)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
