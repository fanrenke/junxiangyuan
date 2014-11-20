package com.junxiangyuan.activity;

import org.apache.http.Header;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.junxiangyuan.R;
import com.junxiangyuan.network.HttpRequestInterface.IResponse;
import com.junxiangyuan.network.HttpResponse;
import com.junxiangyuan.network.RequestData;
import com.loopj.android.http.RequestParams;

public class MainActivity extends BaseActivity implements IResponse{

	private Button btn;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn = (Button) findViewById(R.id.btn_main_request);
		tv = (TextView) findViewById(R.id.tv_main_content);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setHttpRequestData();
			}
		});
	}

	
	public void setHttpRequestData(){
		String url = "http://192.168.1.202:8089/dance/tv";
		RequestParams params = new RequestParams();
		params.put("operate_type", "remark");
		RequestData.getData(this,url, params, new HttpResponse(this,"ss"));
	}

	@Override
	public void response(int statusCode, Header[] headers, String responseBody,
			String error, String flag) {
		// TODO Auto-generated method stub
		if(flag.equals("ss")){
			tv.setText(responseBody);
		}
	}
}
