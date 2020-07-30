package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lesson1_part4 extends AppCompatActivity {

    Button topart5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_part4);
        topart5 = (Button) findViewById(R.id.topart5);

        topart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson1_part4.this,Lesson1_part5.class);
                startActivity(intent);
            }
        });
    }
}
