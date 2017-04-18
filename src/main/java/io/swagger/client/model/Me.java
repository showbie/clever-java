
package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author rpombeiro
 *
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T11:52:21.984-07:00")
public class Me {

	private static final String TYPE_TEACHER = "teacher";
	private static final String TYPE_STUDENT = "student";
	
	@SerializedName("id")
	private String id = null;

	@SerializedName("type")
	private String type = null;

	@SerializedName("district")
	private String district = null;
	  
	/**
	 * @return the id
	 */
	@ApiModelProperty(value = "")
	public String getId() {
		return id;
	}

	/**
	 * @return the district
	 */
	@ApiModelProperty(value = "")
	public String getDistrict() {
		return district;
	}
	
	/**
	 * @return true if type is teacher
	 */
	public boolean isTeacher() {
		return type.equals(TYPE_TEACHER);
	}
	
	/**
	 * @return true if type is student
	 */
	public boolean isStudent() {
		return type.equals(TYPE_STUDENT);
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    Me me = (Me) o;
	    return Objects.equals(this.id, me.id) &&
	        Objects.equals(this.type, me.type) &&
	        Objects.equals(this.district, me.district);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, type, district);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Me {\n");
		
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    district: ").append(toIndentedString(district)).append("\n");;
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
