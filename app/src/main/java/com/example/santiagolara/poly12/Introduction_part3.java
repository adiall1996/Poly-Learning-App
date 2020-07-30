package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Introduction_part3 extends AppCompatActivity {

    private Button topart4;
    MediaPlayer mediaPlayer;
    private TextView textView24,textView26,textView30,textView31,textView32,textView34;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_part3);

        topart4 = (Button) findViewById(R.id.topart4);
        textView24 = findViewById(R.id.textView24);
        textView26 = findViewById(R.id.textView26);
        textView30 = findViewById(R.id.textView30);
        textView31 = findViewById(R.id.textView31);
        textView32 = findViewById(R.id.textView32);
        textView34 = findViewById(R.id.textView34);



        topart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduction_part3.this,Introduction_part4.class);
                startActivity(intent);
            }
        });

        textView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.espanol);
                mediaPlayer.start();
            }
        });

        textView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.mexicana);
                mediaPlayer.start();
            }
        });

        textView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.guatemalteca);
                mediaPlayer.start();
            }
        });

        textView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.cubano);
                mediaPlayer.start();
            }
        });

        textView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.nicaraguense);
                mediaPlayer.start();
            }
        });

        textView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.costarricense);
                mediaPlayer.start();
            }
        });





    }
}
