package com.example.atv1403;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ExchangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Exchange);

        dolarEditText = findViewById(R.id.result);
        realTextView = findViewById(R.id.editTextNumber);
        calculateButton = findViewById(R.id.calculateButton);

        calculate.Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            real =real * 5.20;
            dolar = dolar / 5.20;

            system.out.println(real);

            system.out.println(dolar);
        }


        public static void main(String[] args) {
            int x1 = 0;
            int x2 = 0;

            float real = x1;
            float dolar = x2;
        }
    }