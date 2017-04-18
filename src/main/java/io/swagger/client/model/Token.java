
package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created token object for oauth
 * 
 * @author rpombeiro
 *
 */
public class Token {

	@SerializedName("access_token")
	private String accessToken = null;
	
	@SerializedName("token_type")
	private String tokenType = null;

	/**
	 * @return the accessToken
	 */
	@ApiModelProperty(value = "")
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @return the tokenType
	 */
	@ApiModelProperty(value = "")
	public String getTokenType() {
		return tokenType;
	}

	/**
	 * @param tokenType the tokenType to set
	 */
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	
	
}
