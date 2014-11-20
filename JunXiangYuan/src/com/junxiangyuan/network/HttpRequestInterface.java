package com.junxiangyuan.network;

import org.apache.http.Header;

import com.loopj.android.http.RequestParams;

import android.content.Context;

public class HttpRequestInterface {
	public interface IRequest {
		public void execute(Context mContext, String url, RequestParams params,
				String flag);
	}

	public interface IResponse {
		public void response(int statusCode, Header[] headers,
				String responseBody, String error, String flag);
	}
}
