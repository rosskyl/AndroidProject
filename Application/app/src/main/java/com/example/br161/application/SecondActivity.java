package com.example.br161.application;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResult = (TextView) findViewById(R.id.tv_result);
        tvResult.setText(getIntent().getStringExtra("key"));

    }//end onCreate method
}//end SecondActivity class
