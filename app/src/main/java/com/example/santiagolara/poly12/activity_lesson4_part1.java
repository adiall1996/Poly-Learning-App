package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_lesson4_part1 extends AppCompatActivity {

    private Button tolesson5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson4_part1);

        tolesson5.findViewById(R.id.tolesson5);

        tolesson5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_lesson4_part1.this,activity_lesson5_activity.class);
                startActivity(intent);
            }
        });
    }
}
