package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_lesson3_part7 extends AppCompatActivity {

    private Button tolesson3_part8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3_part7);

        tolesson3_part8 = findViewById(R.id.tolesson3_part8);

        tolesson3_part8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_lesson3_part7.this,activity_lesson3_part8.class);
                startActivity(intent);
            }
        });
    }
}
