package com.example.swasth_sethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class generating extends AppCompatActivity {
    TextView appname;
    LottieAnimationView lott;


    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generating);
        appname=findViewById(R.id.appname);
        lott = findViewById(R.id.lott);

        lott.animate().translationY(0).setDuration(2000).setStartDelay(2900);
        // lott.animate().translationY(2000).setDuration(2000).setStartDelay(2900);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                appname.setText("Selecting targeted workouts for you");
            }
        }, 2400);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                appname.setText(" Adjusting the intensity for you");
            }
        }, 5500);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                appname.setText(" Your personal plan is ready!");
            }
        }, 9000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent ia = new Intent(getApplicationContext(),candycrush.class);

                startActivity(ia);
            }
        },11000);

    }
}