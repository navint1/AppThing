package com.example.navin.appidea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.media.MediaPlayer;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.telephony.SmsManager;


public class MainActivity extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.alarm);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer mpRingtone = MediaPlayer.create(MainActivity.this, R.raw.sound);
                mpRingtone.start();

            }
        });
        Button button2 = (Button) findViewById(R.id.text);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String messageToSend = "this is a text";
                String number = "4087185431";

                SmsManager.getDefault().sendTextMessage(number, null, messageToSend, null,null);

            }
        });

    }
}