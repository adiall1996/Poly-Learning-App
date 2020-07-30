package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lesson4_activity extends AppCompatActivity {

    private Button tolesson4_part1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson4_activity);

        tolesson4_part1 = findViewById(R.id.tolesson4_part1);
        tolesson4_part1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson4_activity.this,spanishActivity.class);
                startActivity(intent);
            }
        });
    }
}
