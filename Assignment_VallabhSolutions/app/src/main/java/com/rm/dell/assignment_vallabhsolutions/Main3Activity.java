package com.rm.dell.assignment_vallabhsolutions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    DB_Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView textView = (TextView)findViewById(R.id.textView4);
        controller = new DB_Controller(this,"",null,1);
        controller.list_all_students(textView);
    }
}
