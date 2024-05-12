package com.example.sprintaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sprint_selection extends AppCompatActivity {

    Button sprint1_btn, sprint2_btn, sprint3_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprint_selection);

        sprint1_btn = findViewById(R.id.sprint1);
        sprint2_btn = findViewById(R.id.sprint2);
        sprint3_btn = findViewById(R.id.sprint3);

        sprint1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sprint_selection.this, Sprint_01.class);
                startActivity(intent);
            }
        });

        sprint2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sprint_selection.this, Sprint_02.class);
                startActivity(intent);
            }
        });

        sprint3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sprint_selection.this, Sprint_03.class);
                startActivity(intent);
            }
        });


    }
}