package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_lesson5_part8 extends AppCompatActivity {

    private Button tolesson5_part9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson5_part8);
        tolesson5_part9 = findViewById(R.id.tolesson5_part9);
        tolesson5_part9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_lesson5_part8.this,activity_lesson5_part9.class);
                startActivity(intent);
            }
        });
    }
}
