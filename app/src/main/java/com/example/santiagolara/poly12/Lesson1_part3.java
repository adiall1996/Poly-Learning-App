package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lesson1_part3 extends AppCompatActivity {

    Button topart4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_part3);
        topart4 = findViewById(R.id.topart4);

        topart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson1_part3.this,Lesson1_part4.class);
                startActivity(intent);
            }
        });
    }
}
