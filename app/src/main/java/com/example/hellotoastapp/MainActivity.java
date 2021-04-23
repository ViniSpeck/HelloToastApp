package com.example.hellotoastapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView showCount; //**

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = findViewById(R.id.show_count); //atribui elemento à variável showCount **
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show(); //mostrar o toast
    }

    public void countUp(View view) {
        //quando clicar no botão
        //incrementar contador
        count++;

        //mostrar na tela o valor incrementado

        if (showCount!=null){
            showCount.setText(Integer.toString(count)); //**
        }
    }

    public void countDown(View view) {
        count--;

        if(showCount!=null){
            showCount.setText(Integer.toString(count));
        }
    }
}