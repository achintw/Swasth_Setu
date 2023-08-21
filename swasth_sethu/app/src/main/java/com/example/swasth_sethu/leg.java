package com.example.swasth_sethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class leg extends AppCompatActivity {
    int [] newArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);
        newArray = new int[]{
                R.id.one, R.id.second, R.id.third, R.id.fourth, R.id.fifth, R.id.sixth, R.id.seventh, R.id.eight,
                R.id.ninth, R.id.tenth, R.id.eleventh, R.id.twelveth
        };
    }

    public void Imagebuttonclicked(View view) {
        for (int i = 0; i < newArray.length; i++) {
            if (view.getId() == newArray[i]) {
                int value = i + 1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(leg.this, third4.class);
                intent.putExtra("color", Color.BLUE);
                intent.putExtra("value", String.valueOf(value));

                startActivity(intent);
            }
        }
    }


}