package com.rm.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        String Msg_key = "com.rm.dell.myapplication";
        Intent intent = getIntent();
        String message = intent.getStringExtra(Msg_key);
        TextView txt = (TextView)findViewById(R.id.txtv3);
        txt.setText(message);
    }


}
