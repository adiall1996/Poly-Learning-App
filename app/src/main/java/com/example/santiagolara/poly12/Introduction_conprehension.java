package com.example.santiagolara.poly12;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.santiagolara.poly12.R.layout.activity_introduction_comprehention;

public class Introduction_conprehension extends AppCompatActivity {

    private Button  goBack;
    private Button topart1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_introduction_comprehention);


        goBack = (Button) findViewById(R.id.backScreen1);

        topart1 = (Button) findViewById(R.id.topart1);

        topart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Introduction_conprehension.this,Introduction_part1.class);
                startActivity(intent);
            }
        });

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Introduction_conprehension.this,Introduction_activity.class);
                startActivity(intent);
            }
        });

    }
}