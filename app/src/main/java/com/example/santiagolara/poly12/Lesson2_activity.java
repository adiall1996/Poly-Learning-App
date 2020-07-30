package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lesson2_activity extends AppCompatActivity {
    private Button movetolesson2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2_activity);

        movetolesson2 = (Button) findViewById(R.id.movetopart2lesson2);

        movetolesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lesson2_activity.this,Lesson2_part1.class );
                startActivity(intent);
            }
        });
    }
}
