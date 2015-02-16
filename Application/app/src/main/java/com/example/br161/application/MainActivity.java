package com.example.br161.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    EditText etInput;
    TextView tvReact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = (EditText) findViewById(R.id.et_input);
        tvReact = (TextView) findViewById(R.id.tv_react);


        tvReact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "what is a toast", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);//parameters(where we are, where we want to go)
                intent.putExtra("key", etInput.getText().toString());
                startActivity(intent);
            }//end onClick
        });//end tvReact.setOnClickListener
    }//end onCreate method
}//end MainActivity class
