package com.example.swasth_sethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class welcome extends AppCompatActivity {
    TextView welcome;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

         welcome = findViewById(R.id.welcome);
         next = findViewById(R.id.next);
        TextView welcome = findViewById(R.id.welcome);

        Intent i = getIntent();
        String newString = i.getExtras().getString("msg");

        String message = "Welcome " + newString + " ";

        welcome.setText(message);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(welcome.this, MainActivity.class);
                startActivity(intent);
            }
        });





    }
}