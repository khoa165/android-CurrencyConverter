package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textView = (TextView) findViewById(R.id.convertedResult);
        Intent intent = getIntent();
        String amount = intent.getStringExtra("pounds");
        textView.setText("£ " + amount);
    }
}
