package com.example.swasth_sethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class focusF extends AppCompatActivity {
    Button button7, button8, button9, button10;
    focushelper hi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus_f);

        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        hi = new focushelper(this);



        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullbody = button7.getText().toString();
                Intent intent = new Intent(focusF.this, bmi.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String arm = button8.getText().toString();
                Intent in = new Intent(focusF.this, bmi.class);
                startActivity(in);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String abs = button9.getText().toString();
                Intent intent = new Intent(focusF.this, bmi.class);
                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String legs = button10.getText().toString();
                Intent intent = new Intent(focusF.this, bmi.class);
                startActivity(intent);
            }
        });


    }
}