package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_lesson3_part14 extends AppCompatActivity {

    private Button tolesson3_part15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3_part14);

        tolesson3_part15 = findViewById(R.id.tolesson3_part15);

        tolesson3_part15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_lesson3_part14.this,activity_lesson3_part15.class);
                startActivity(intent);
            }
        });
    }
}
