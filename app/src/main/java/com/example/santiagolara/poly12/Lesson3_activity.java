package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lesson3_activity extends AppCompatActivity {

    private Button tolesson3part1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3_activity);

        tolesson3part1 = (Button) findViewById(R.id.tolesson3part1);

        tolesson3part1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson3_activity.this,activity_lesson3_part1.class);
                startActivity(intent);
            }
        });
    }
}
