package com.example.swasth_sethu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class candycrush extends AppCompatActivity {
    Button a;
    Button b;
    Button ca;
    Button da;
    Button ea;
    DBHelper l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candycrush);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        ca = findViewById(R.id.ca);
        da = findViewById(R.id.da);
        l= new DBHelper(this);

//        if (savedInstanceState == null) {
//            Bundle extras = getIntent().getExtras();
//            if(extras == null) {
//                newString= null;
//            } else {
//                newString= extras.getString("msg");
//            }
//        } else {
//            newString= (String) savedInstanceState.getSerializable("msg");
//        }
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String one = a.getText().toString();


               // Toast.makeText(candycrush.this, newString, Toast.LENGTH_LONG).show();



               SQLiteDatabase db = l.getReadableDatabase();







                //String[] columns = { "username" };
//                Cursor cursor = db.query("users", columns, null, null, null, null, null);
//
//                while (cursor.moveToNext()) {
//                    @SuppressLint("Range") String name = cursor.getString(cursor.getColumnIndex("username"));
//                    Toast.makeText(candycrush.this, name, Toast.LENGTH_SHORT).show();
//                }


                //


                Intent intent = new Intent(getApplicationContext(),arm.class);
                //intent.putExtra("message", "level1");

                int color = getIntent().getIntExtra("color", Color.BLUE);
                Button a = findViewById(R.id.a);

                a.setTextColor(color);

                startActivity(intent);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String second = b.getText().toString();
                Intent intent = new Intent(getApplicationContext(),arm.class);

                intent.putExtra("message", "level2");
                int color = getIntent().getIntExtra("color", Color.BLUE);
                Button b = findViewById(R.id.b);

                b.setTextColor(color);

                startActivity(intent);

            }
        });
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String third = ca.getText().toString();
                Intent intent = new Intent(getApplicationContext(),arm.class);
                intent.putExtra("message", "level2");
                int color = getIntent().getIntExtra("color", Color.BLUE);
                Button ca = findViewById(R.id.ca);

                ca.setTextColor(color);

                startActivity(intent);

            }
        });
        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fourth = da.getText().toString();
                Intent intent = new Intent(getApplicationContext(),arm.class);
                intent.putExtra("message", "level2");
                int color = getIntent().getIntExtra("color", Color.BLUE);
                Button da = findViewById(R.id.da);

                da.setTextColor(color);

                startActivity(intent);
            }
        });

    }
}