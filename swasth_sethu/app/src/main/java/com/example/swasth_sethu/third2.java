package com.example.swasth_sethu;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class third2 extends AppCompatActivity {
    String buttonvalue;
    Button startbtn;
    TextView mtextview;
    private CountDownTimer countdown;
    private boolean mtimerunning;
    private long mtimeleftinmillis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Intent intent = getIntent();
        buttonvalue = intent.getStringExtra("value");
        int intvalue = Integer.valueOf(buttonvalue);
        switch(intvalue){
            case 1 :
                setContentView(R.layout.activity_first2);
                break;
            case 2 :
                setContentView(R.layout.activity_second2);
                break;
            case 3 :
                setContentView(R.layout.activity_third2);
                break;
            case 4 :
                setContentView(R.layout.activity_fourth2);
                break;
            case 5 :
                setContentView(R.layout.activity_fifth2);
                break;
            case 6 :
                setContentView(R.layout.activity_six);
                break;
            case 7 :
                setContentView(R.layout.activity_seven);
                break;
            case 8 :
                setContentView(R.layout.activity_eight);
                break;
            case 9 :
                setContentView(R.layout.activity_nine);
                break;
            case 10 :
                setContentView(R.layout.activity_ten);
                break;
            case 11 :
                setContentView(R.layout.activity_eleven);
                break;
            case 12 :
                setContentView(R.layout.activity_twelve);
                break;
        }
        startbtn = findViewById(R.id.startbtn);
        mtextview = findViewById(R.id.a);


        startbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(mtimerunning){
                    stopTimer();
                }
                else{
                    startTimer();
                }
            }
        });
    }
    private void stopTimer(){
        countdown.cancel();
        mtimerunning = false;
        startbtn.setText("START");
    }
    private void startTimer(){
        final CharSequence value1 = mtextview.getText();
        String num1 = value1.toString();
        String num2 = num1.substring(0,2);
        String num3 = num1.substring(3,5);



        final int number = Integer.valueOf(num2)*60 + Integer.valueOf(num3);
        mtimeleftinmillis = number*1000;
        countdown = new CountDownTimer(mtimeleftinmillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mtimeleftinmillis = millisUntilFinished;
                updateTimer();
            }


            @Override
            public void onFinish() {
                int newvalue = Integer.valueOf(buttonvalue) + 1;
                if(newvalue <= 7){
                    Intent intent = new Intent(third2.this, third2.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newvalue));
                    startActivity(intent);
                }
                else {
                    newvalue=1;
                    Intent intent = new Intent(third2.this, third2.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newvalue));
                }
            }

        }.start();
        startbtn.setText("Pause");
        mtimerunning = true;
    }

    private void updateTimer(){
        int minutes = (int) mtimeleftinmillis / 60000;
        int seconds = (int) mtimeleftinmillis%60000 / 1000;
        String timeleftText = "";
        if(minutes < 1){
            timeleftText = "0";
            timeleftText = timeleftText + minutes + ":" ;
            if(seconds < 60){
                timeleftText += seconds;
                mtextview.setText(timeleftText);
            }

        }

        }
    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
}