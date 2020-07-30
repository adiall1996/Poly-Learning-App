package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lesson2_part1 extends AppCompatActivity {

    private Button movetopart3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2_part1);

        movetopart3 = findViewById(R.id.movetopart3);

        movetopart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson2_part1.this,Lesson3_activity.class);
                startActivity(intent);
            }
        });
    }
}
