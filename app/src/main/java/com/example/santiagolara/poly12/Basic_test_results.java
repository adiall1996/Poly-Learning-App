package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Basic_test_results extends AppCompatActivity {

    TextView t1_total,t2_correct,t3_wrong;
    String total,correct,incorrect;
    Button confident,notconfident;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_test_results);

        confident = findViewById(R.id.confident);
        notconfident = findViewById(R.id.notconfident);
        t2_correct = (TextView)findViewById(R.id.correct);
        t3_wrong = (TextView)findViewById(R.id.incorrect);
        t1_total = (TextView)findViewById(R.id.attempted);
        final Intent i = getIntent();
        total = i.getStringExtra("total");
        correct = i.getStringExtra("correct");
        incorrect = i.getStringExtra("incorrect");

        confident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic_test_results.this,Spanish_dashboardActivity.class);
                startActivity(intent);
            }
        });

        notconfident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic_test_results.this,Introduction_activity.class);
                startActivity(i);
            }
        });


        setValues();
    }

    private void setValues()
    {
        t1_total.setText(total);
        t2_correct.setText(correct);
        t3_wrong.setText(incorrect);
    }




}
