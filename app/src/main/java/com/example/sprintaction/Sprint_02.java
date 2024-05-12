package com.example.sprintaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sprint_02 extends AppCompatActivity {

    DBHandler mydb;

    private EditText id_edt2, todo_edt2, on_prog_edt2, done_edt2;

    private Button insert2_btn, delete2_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprint02);

        mydb = new DBHandler(this);

        id_edt2 = findViewById(R.id.activity_id_2);
        todo_edt2 = findViewById(R.id.To_Do2);
        on_prog_edt2 = findViewById(R.id.on_prog2);
        done_edt2 = findViewById(R.id.done2);

        insert2_btn = findViewById(R.id.s2_insert);
        delete2_btn = findViewById(R.id.s2_delete);

        insertData2();
        delete2();
    }
    public void insertData2() {
        insert2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean inserted = mydb.insertData2(id_edt2.getText().toString(), todo_edt2.getText().toString(), on_prog_edt2.getText().toString(), done_edt2.getText().toString());
                if (inserted) {
                    Toast.makeText(Sprint_02.this, "Activity is Inserted", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Sprint_02.this, "Activity is not Inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void delete2()
    {
        delete2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer delete = mydb.delete2(id_edt2.getText().toString());
                if (delete>0)
                {
                    Toast.makeText(Sprint_02.this, "Activity Deleted!!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Sprint_02.this, "Activity not Deleted!!", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}