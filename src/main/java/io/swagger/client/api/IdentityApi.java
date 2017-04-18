
package io.swagger.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;
import io.swagger.client.model.Me;
import io.swagger.client.model.MeResponse;
import io.swagger.client.model.Token;

/**
 * This class follows a similar structure to the other api classes.  
 * This class is used to obtain identity information for a user
 * 
 * @author rpombeiro
 *
 */
public class IdentityApi {
	private ApiClient apiClient;
	
	public IdentityApi(ApiClient apiClient) {
		this.apiClient=apiClient;
	}
	
	public Token getToken(String code, String redirectUrl) throws ApiException {
		com.squareup.okhttp.Call call = getTokenCall(code, redirectUrl, null, null);
		Type localVarReturnType = new TypeToken<Token>(){}.getType();
		
		ApiResponse<Token> response = apiClient.execute(call, localVarReturnType);
		
		return response.getData();
	}
	
	private Call getTokenCall(String code, String redirectUrl, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		JsonObject authorizationCode = new JsonObject();
		authorizationCode.addProperty("code", code);
		authorizationCode.addProperty("grant_type", "authorization_code");
		authorizationCode.addProperty("redirect_uri", redirectUrl);
		Object localVarPostBody = authorizationCode;
		
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		 Map<String, String> localVarHeaderParams = new HashMap<String, String>();

		 Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		 
		 final String[] localVarContentTypes = {};
		 final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		 localVarHeaderParams.put("Content-Type", localVarContentType);
		 
		 if(progressListener != null) {
	        apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
	            @Override
	            public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
	                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
	                return originalResponse.newBuilder()
	                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
	                .build();
	            }
	        });
	    }

		String[] localVarAuthNames = new String[] { "basic" };
		Call call = apiClient.buildCall("/oauth/tokens", "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
		
		return call;
	}
	
	/**
	 * Returns a {@link Me} response
	 * 
	 * @return {@link MeResponse}
	 * @throws ApiException
	 */
	public MeResponse getMe() throws ApiException {
	    com.squareup.okhttp.Call call = getMeCall( null, null);
	    Type localVarReturnType = new TypeToken<MeResponse>(){}.getType();
	    ApiResponse<MeResponse> resp = apiClient.execute(call, localVarReturnType);
	    
	    return resp.getData();
	}
	
	/**
	 * Build a class for the Me property
	 * 
	 * @param apiClient
	 * @param progressListener
	 * @param progressRequestListener
	 * @return {@link Call}
	 * @throws ApiException
	 */
	private Call getMeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
	    
	    // create path and map variables
	    String localVarPath = "/me";
	
	    List<Pair> localVarQueryParams = new ArrayList<Pair>();
	
	    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
	
	    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
	
	    final String[] localVarAccepts = {
	        "application/json"
	    };
	    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
	    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
	
	    final String[] localVarContentTypes = {
	        
	    };
	    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
	    localVarHeaderParams.put("Content-Type", localVarContentType);
	
	    if(progressListener != null) {
	        apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
	            @Override
	            public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
	                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
	                return originalResponse.newBuilder()
	                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
	                .build();
	            }
	        });
	    }
	
	    String[] localVarAuthNames = new String[] { "oauth" };
	    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}
}
