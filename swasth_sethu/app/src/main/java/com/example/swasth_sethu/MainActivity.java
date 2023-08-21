package com.example.swasth_sethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button,  button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent svc = new Intent(this, sound.class);
        svc.setAction("com.example.sound");
        startService(svc);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);




        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),focusM.class);
                intent.putExtra("message", "male");
                Bundle extras = new Bundle();

                extras.putString("message","male");
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),focusF.class);
                Bundle extras = new Bundle();
                extras.putString("message","female");
                intent.putExtras(extras);
//                intent.putExtra("message", "female");
                startActivity(intent);
            }
        });

    }
}