package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_lesson3_part2 extends AppCompatActivity {

    private Button tolesson3_part3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3_part2);

        tolesson3_part3 = findViewById(R.id.tolesson3_part3);

        tolesson3_part3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_lesson3_part2.this,activity_lesson3_part3.class);
                startActivity(intent);
            }
        });
    }
}
