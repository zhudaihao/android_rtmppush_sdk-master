package com.alex.com.alex.livertmppushsdk.demo;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class StartActivity extends Activity {
    public static final String RTMPURL_MESSAGE = "com";

    private Button _startRtmpPushButton = null;


    private EditText _rtmpUrlEditText = null;

    private View.OnClickListener _startRtmpPushOnClickedEvent = new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            Intent i = new Intent(StartActivity.this, MainActivity.class);
            String rtmpUrl = _rtmpUrlEditText.getText().toString();

            i.putExtra(StartActivity.RTMPURL_MESSAGE, rtmpUrl);
            StartActivity.this.startActivity(i);
        }
    };

    private void InitUI() {
        _rtmpUrlEditText = (EditText) findViewById(R.id.rtmpUrleditText);
        _startRtmpPushButton = (Button) findViewById(R.id.startRtmpButton);


        //服务器地址 rtmp://ossrs.net/live/12345678
        //rtmp://113.105.76.161/live/4771806b898db21f9c54
        _rtmpUrlEditText.setText("rtmp://ossrs.net/live/12345678");

        _startRtmpPushButton.setOnClickListener(_startRtmpPushOnClickedEvent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        InitUI();
    }

}
