package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Introduction_ending extends AppCompatActivity {

    private Button Introquiz, backtolesson1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_ending);

        Introquiz = (Button) findViewById(R.id.Introquiz);
        backtolesson1 = (Button) findViewById(R.id.backtopart1);


        Introquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduction_ending.this,Intro_ending_quiz.class);
                startActivity(intent);
            }
        });

        backtolesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduction_ending.this,Introduction_part1.class);
                startActivity(intent);
            }
        });
    }
}
