package com.example.sprintaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sprint_01 extends AppCompatActivity {

    DBHandler mydb;

    private EditText id_edt1, todo_edt1, on_prog_edt1, done_edt1;

    private Button insert1_btn, delete1_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprint01);

        mydb = new DBHandler(this);

        id_edt1 = findViewById(R.id.activity_id_1);
        todo_edt1 = findViewById(R.id.To_Do);
        on_prog_edt1 = findViewById(R.id.on_prog);
        done_edt1 = findViewById(R.id.done);

        insert1_btn = findViewById(R.id.s1_insert);
        delete1_btn = findViewById(R.id.s1_delete);

        insertData1();
        delete1();

    }

    public void insertData1() {
        insert1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean inserted = mydb.insertData1(id_edt1.getText().toString(), todo_edt1.getText().toString(), on_prog_edt1.getText().toString(), done_edt1.getText().toString());
                if (inserted) {
                    Toast.makeText(Sprint_01.this, "Activity is Inserted", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Sprint_01.this, "Activity is not Inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void delete1()
    {
        delete1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer delete = mydb.delete1(id_edt1.getText().toString());
                if (delete>0)
                {
                    Toast.makeText(Sprint_01.this, "Activity Deleted!!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Sprint_01.this, "Activity not Deleted!!", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}