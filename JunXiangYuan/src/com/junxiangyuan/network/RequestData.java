package com.junxiangyuan.network;

import android.content.Context;

import com.loopj.android.http.RequestParams;

public class RequestData {
	public static void getData(Context mContet,String url,RequestParams params,HttpResponse s){
		
		HttpUtil.get(url, params, s);
	}
}
