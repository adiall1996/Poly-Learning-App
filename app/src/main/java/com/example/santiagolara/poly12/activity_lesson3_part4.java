package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_lesson3_part4 extends AppCompatActivity {

    private Button tolesson3_part5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3_part4);


        tolesson3_part5 = findViewById(R.id.tolesson3_part5);

        tolesson3_part5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (activity_lesson3_part4.this,activity_lesson3_part5.class);
                startActivity(intent);
            }
        });

    }
}
