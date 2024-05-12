package com.example.sprintaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText title_edt;
    private Button go_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title_edt = findViewById(R.id.project_title);
        go_btn = findViewById(R.id.go_button);

        go_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text from the EditText
                String title = title_edt.getText().toString().trim();

                // Check if the EditText is not empty
                if (!title.isEmpty()) {
                    // If not empty, proceed with the intent
                    Intent intent = new Intent(MainActivity.this, Map_Activity.class);
                    startActivity(intent);
                } else {
                    // If empty, show a message or perform an action to inform the user
                    // For example, you can display a toast message
                    Toast.makeText(MainActivity.this, "Please enter a project title", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}