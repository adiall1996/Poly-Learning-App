package com.example.santiagolara.poly12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Introduction_part2 extends AppCompatActivity {

    private Button topart3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_part2);
        topart3 = (Button) findViewById(R.id.Topart3);

        topart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduction_part2.this,Introduction_part3.class);
                startActivity(intent);
            }
        });
    }
}
