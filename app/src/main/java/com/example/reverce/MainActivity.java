package com.example.reverce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reverse(View view) {
        TextView textViewInput = findViewById(R.id.editTextTextPersonName);
        StringBuilder input = new StringBuilder(textViewInput.getText());
        StringBuilder reverse = input.reverse();
        TextView textViewOut = findViewById(R.id.textView);
        textViewOut.setText(reverse.toString());
    }
}