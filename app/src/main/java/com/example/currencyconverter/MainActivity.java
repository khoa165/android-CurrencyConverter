package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText userInput = (EditText) findViewById(R.id.moneyInput);
        String amount = userInput.getText().toString();
        try {
            double dollars = Double.parseDouble(amount);
            double pounds = dollars * 0.77;
            displayResult(pounds);
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "Wrong format! Please enter a number!", Toast.LENGTH_LONG).show();
        }
    }

    public void displayResult(double amount) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("pounds", Double.toString(amount));
        startActivity(intent);
    }
}
