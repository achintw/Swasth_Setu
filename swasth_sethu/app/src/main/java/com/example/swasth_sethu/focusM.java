package com.example.swasth_sethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class focusM extends AppCompatActivity {

    Button button3, button4, button5, button6;
    focushelper hi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus_m);

        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String x = extras.getString("msg");
//        String password_string = extras.getString("EXTRA_PASSWORD");

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullbody = button3.getText().toString();
                Intent intent = new Intent(focusM.this, bmi.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String arm = button4.getText().toString();
                Intent intent = new Intent(focusM.this, bmi.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String arm = button5.getText().toString();
                Intent intent = new Intent(focusM.this, bmi.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String arm = button6.getText().toString();
                Intent intent = new Intent(focusM.this, bmi.class);
                startActivity(intent);
            }
        });


    }
}