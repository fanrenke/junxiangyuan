package com.junxiangyuan.network;

import java.io.UnsupportedEncodingException;

import org.apache.http.Header;
import org.json.JSONException;

import com.junxiangyuan.network.HttpRequestInterface.IResponse;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;

public class HttpResponse extends AsyncHttpResponseHandler {

	private IResponse response;
	private String flag = null;
	private String responseData = null;

	public HttpResponse(IResponse response,String flag) {
		this.response = response;
		this.flag = flag;
	}

	@Override
	public void onFailure(int statusCode, Header[] headers,
			byte[] responseBody, Throwable error) {
		// TODO Auto-generated method stub
		response.response(statusCode, headers, null, error.toString(), flag);
	}

	@Override
	public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
		// TODO Auto-generated method stub
		try {
			responseData = new String(responseBody, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.response(statusCode, headers, responseData, null, flag);
	}
	class s extends JsonHttpResponseHandler{

		@Override
		protected Object parseResponse(byte[] responseBody)
				throws JSONException {
			// TODO Auto-generated method stub
			return super.parseResponse(responseBody);
		}
		
	}
}
