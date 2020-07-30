package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lesson1_activity extends AppCompatActivity {

    private Button tolesson1part1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_activity);

        tolesson1part1= (Button) findViewById(R.id.tolesson1_part1);

        tolesson1part1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson1_activity.this,Lesson1_part1.class);
                startActivity(intent);

            }
        });
    }
}
