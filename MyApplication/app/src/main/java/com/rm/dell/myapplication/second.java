package com.rm.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void snext (View view){
        EditText message = (EditText)findViewById(R.id.textView4);
        Button but = (Button)findViewById(R.id.second_next);
        String msg = message.getText().toString();
        Intent int2 = new Intent(this,third.class);
        String Msg_key = "com.rm.dell.myapplication";
        int2.putExtra(third.Msg_key,msg);
        startActivity(int2);
    }
}