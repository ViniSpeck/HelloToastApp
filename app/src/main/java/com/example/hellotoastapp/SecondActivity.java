package com.example.hellotoastapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        int count = intent.getIntExtra(MainActivity.EXTRA_COUNT, 0);

        TextView textView = findViewById(R.id.text_counter);
        textView.setText(Integer.toString(count));
    }
}