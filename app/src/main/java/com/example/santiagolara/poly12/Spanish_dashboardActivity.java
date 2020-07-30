package com.example.santiagolara.poly12;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.view.View;

public class Spanish_dashboardActivity extends AppCompatActivity {

    private CardView introduction, Lesson1, Lesson2, Lesson3, Lesson4, AdditionalResources;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish_dashboard);
        introduction = findViewById(R.id.introduction);
        Lesson1 = findViewById(R.id.Lesson1);
        Lesson2 = findViewById(R.id.Lesson2);
        Lesson3 = findViewById(R.id.Lesson3);
        Lesson4 = findViewById(R.id.Lesson4);
        fab = findViewById(R.id.fab);



        // onclickListeners and Intents

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Spanish_dashboardActivity.this,content_recommendation.class);
                startActivity(intent);
            }
        });

        introduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Spanish_dashboardActivity.this,Introduction_activity.class);
                startActivity(intent);
            }
        });


        Lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Spanish_dashboardActivity.this,Lesson1_activity.class);
                startActivity(intent);
            }
        });

        Lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Spanish_dashboardActivity.this,Lesson2_activity.class);
                startActivity(intent);
            }
        });

        Lesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Spanish_dashboardActivity.this,Lesson3_activity.class);
                startActivity(intent);
            }
        });

        Lesson4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Spanish_dashboardActivity.this,Lesson4_activity.class);
                startActivity(intent);
            }
        });




    }

}
