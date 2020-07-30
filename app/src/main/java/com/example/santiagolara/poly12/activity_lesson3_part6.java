package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_lesson3_part6 extends AppCompatActivity {

    private Button tolesson3_part7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3_part6);

        tolesson3_part7 = findViewById(R.id.tolesson3_part7);
        tolesson3_part7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_lesson3_part6.this,activity_lesson3_part7.class);
                startActivity(intent);
            }
        });

    }
}
