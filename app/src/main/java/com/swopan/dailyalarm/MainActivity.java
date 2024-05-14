package com.swopan.dailyalarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button morTime_btn, evTime_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        morTime_btn = findViewById(R.id.morTime_btn);
        evTime_btn = findViewById(R.id.evTime_btn);

        morTime_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MorningTime.class);
                startActivity(intent);
            }
        });
    }
}