package com.zepplez.colorblox;

import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView timerTextView = (TextView)findViewById(R.id.timerTextView);
        Button startButton = (Button)findViewById(R.id.startButton);
        Button colorBox1 = (Button)findViewById(R.id.colorBox1);
        Button colorBox2 = (Button)findViewById(R.id.colorBox2);
        Button colorBox3 = (Button)findViewById(R.id.colorBox3);
        Button colorBox4 = (Button)findViewById(R.id.colorBox4);
        Button colorBox5 = (Button)findViewById(R.id.colorBox5);
        Button colorBox6 = (Button)findViewById(R.id.colorBox6);
        Button colorBox7 = (Button)findViewById(R.id.colorBox7);
        Button colorBox8 = (Button)findViewById(R.id.colorBox8);

        int colourSel;
        int numberSel;

        final CountDownTimer countDownTimer = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long secondsUntilFinished = millisUntilFinished / 1000;
                timerTextView.setText(secondsUntilFinished + "");
            }

            @Override
            public void onFinish() {
                timerTextView.setText("Finished");

            }
        };

        numberSel = randomNumber.gen();
        colourSel = colour.colour(numberSel);

        if (numberSel == 1){
            colorBox1.setBackgroundColor(colourSel-20);
            colorBox2.setBackgroundColor(colourSel);
            colorBox3.setBackgroundColor(colourSel);
            colorBox4.setBackgroundColor(colourSel);
            colorBox5.setBackgroundColor(colourSel);
            colorBox6.setBackgroundColor(colourSel);
            colorBox7.setBackgroundColor(colourSel);
            colorBox8.setBackgroundColor(colourSel);

            colorBox1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    timerTextView.setText("WINNER!");
                }
            });
        } else if (numberSel == 2){
            colorBox1.setBackgroundColor(colourSel);
            colorBox2.setBackgroundColor(colourSel-20);
            colorBox3.setBackgroundColor(colourSel);
            colorBox4.setBackgroundColor(colourSel);
            colorBox5.setBackgroundColor(colourSel);
            colorBox6.setBackgroundColor(colourSel);
            colorBox7.setBackgroundColor(colourSel);
            colorBox8.setBackgroundColor(colourSel);

            colorBox2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    timerTextView.setText("WINNER!");
                }
            });
        } else if (numberSel == 3){
            colorBox1.setBackgroundColor(colourSel);
            colorBox2.setBackgroundColor(colourSel);
            colorBox3.setBackgroundColor(colourSel-20);
            colorBox4.setBackgroundColor(colourSel);
            colorBox5.setBackgroundColor(colourSel);
            colorBox6.setBackgroundColor(colourSel);
            colorBox7.setBackgroundColor(colourSel);
            colorBox8.setBackgroundColor(colourSel);

            colorBox3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    timerTextView.setText("WINNER!");
                }
            });
        } else if (numberSel == 4){
            colorBox1.setBackgroundColor(colourSel);
            colorBox2.setBackgroundColor(colourSel);
            colorBox3.setBackgroundColor(colourSel);
            colorBox4.setBackgroundColor(colourSel-20);
            colorBox5.setBackgroundColor(colourSel);
            colorBox6.setBackgroundColor(colourSel);
            colorBox7.setBackgroundColor(colourSel);
            colorBox8.setBackgroundColor(colourSel);

            colorBox4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    timerTextView.setText("WINNER!");
                }
            });
        } else if (numberSel == 5){
            colorBox1.setBackgroundColor(colourSel);
            colorBox2.setBackgroundColor(colourSel);
            colorBox3.setBackgroundColor(colourSel);
            colorBox4.setBackgroundColor(colourSel);
            colorBox5.setBackgroundColor(colourSel-20);
            colorBox6.setBackgroundColor(colourSel);
            colorBox7.setBackgroundColor(colourSel);
            colorBox8.setBackgroundColor(colourSel);

            colorBox5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    timerTextView.setText("WINNER!");
                }
            });
        } else if (numberSel == 6){
            colorBox1.setBackgroundColor(colourSel);
            colorBox2.setBackgroundColor(colourSel);
            colorBox3.setBackgroundColor(colourSel);
            colorBox4.setBackgroundColor(colourSel);
            colorBox5.setBackgroundColor(colourSel);
            colorBox6.setBackgroundColor(colourSel-20);
            colorBox7.setBackgroundColor(colourSel);
            colorBox8.setBackgroundColor(colourSel);

            colorBox6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    timerTextView.setText("WINNER!");
                }
            });
        } else if (numberSel == 7){
            colorBox1.setBackgroundColor(colourSel);
            colorBox2.setBackgroundColor(colourSel);
            colorBox3.setBackgroundColor(colourSel);
            colorBox4.setBackgroundColor(colourSel);
            colorBox5.setBackgroundColor(colourSel);
            colorBox6.setBackgroundColor(colourSel);
            colorBox7.setBackgroundColor(colourSel-20);
            colorBox8.setBackgroundColor(colourSel);

            colorBox7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    timerTextView.setText("WINNER!");
                }
            });
        } else if (numberSel == 8){
            colorBox1.setBackgroundColor(colourSel);
            colorBox2.setBackgroundColor(colourSel);
            colorBox3.setBackgroundColor(colourSel);
            colorBox4.setBackgroundColor(colourSel);
            colorBox5.setBackgroundColor(colourSel);
            colorBox6.setBackgroundColor(colourSel);
            colorBox7.setBackgroundColor(colourSel);
            colorBox8.setBackgroundColor(colourSel-20);

            colorBox8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    timerTextView.setText("WINNER!");
                }
            });
        }

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.start();
            }
        });

    }
}
