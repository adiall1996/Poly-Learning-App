package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Lesson1_part2 extends AppCompatActivity {

    private Button tolesson2part3;
    private Button play_part1;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_part2);

        tolesson2part3 = (Button) findViewById(R.id.lesson1_part3);
        play_part1 = findViewById(R.id.play_part1);

        tolesson2part3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson1_part2.this,spanishActivity.class);
                startActivity(intent);
            }
        });

        play_part1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.jetflyby);
                mediaPlayer.start();
            }
        });


    }
}
