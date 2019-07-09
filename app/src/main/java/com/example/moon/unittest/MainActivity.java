package com.example.moon.unittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MyTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConverterUtil converterUtil = new ConverterUtil();
        Log.i(TAG, "onCreate: "+ converterUtil.cToF(180.0f));

        Log.i(TAG, "onCreate: "+converterUtil.fToC(356.0f));

    }
}
