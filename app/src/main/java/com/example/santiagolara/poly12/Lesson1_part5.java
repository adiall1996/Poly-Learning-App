package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lesson1_part5 extends AppCompatActivity {

    private Button yestoquiz, notoquiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_part5);
        yestoquiz = (Button) findViewById(R.id.Yestoquiz);
        notoquiz = (Button) findViewById(R.id.Notoquiz);

        yestoquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson1_part5.this,Lesson1_quiz.class);
                startActivity(intent);
            }
        });

        notoquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson1_part5.this, Lesson1_part1.class);
                startActivity(intent);
            }
        });
    }
}
