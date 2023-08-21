package com.example.swasth_sethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bmi extends AppCompatActivity {
    Button over;
    EditText takeAge;
    EditText takeHeight;
    EditText takeWeight;


    dbSaver ki;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        over = findViewById(R.id.over);

        takeAge=findViewById(R.id.takeAge);

        takeHeight=findViewById(R.id.takeHeight);
        takeWeight=findViewById(R.id.takeWeight);

        ki=new dbSaver(this);

        over.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String height = takeHeight.getText().toString();
                String age = takeAge.getText().toString();

                String  weight = takeWeight.getText().toString();

                Boolean insert = ki.insertData2(age, height,weight);
                Intent intent = new Intent(bmi.this,generating.class);
                startActivity(intent);
            }
        });

        }
}