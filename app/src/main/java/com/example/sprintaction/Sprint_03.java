package com.example.sprintaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sprint_03 extends AppCompatActivity {

    DBHandler mydb;

    private EditText id_edt3, todo_edt3, on_prog_edt3, done_edt3;

    private Button insert3_btn, delete3_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprint03);

        mydb = new DBHandler(this);

        id_edt3 = findViewById(R.id.activity_id_3);
        todo_edt3 = findViewById(R.id.To_Do3);
        on_prog_edt3 = findViewById(R.id.on_prog3);
        done_edt3 = findViewById(R.id.done3);

        insert3_btn = findViewById(R.id.s3_insert);
        delete3_btn = findViewById(R.id.s3_delete);

        insertData3();
        delete3();
    }

    public void insertData3() {
        insert3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean inserted = mydb.insertData3(id_edt3.getText().toString(), todo_edt3.getText().toString(), on_prog_edt3.getText().toString(), done_edt3.getText().toString());
                if (inserted) {
                    Toast.makeText(Sprint_03.this, "Activity is Inserted", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Sprint_03.this, "Activity is not Inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void delete3()
    {
        delete3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer delete = mydb.delete3(id_edt3.getText().toString());
                if (delete>0)
                {
                    Toast.makeText(Sprint_03.this, "Activity Deleted!!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Sprint_03.this, "Activity not Deleted!!", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}