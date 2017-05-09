package com.rm.dell.android_mysql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
EditText ET_name,ET_uname,ET_pass;
    String name,uname,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ET_name = (EditText)findViewById(R.id.name);
        ET_uname = (EditText)findViewById(R.id.uname);
        ET_pass = (EditText)findViewById(R.id.pass);
    }

    public void register(View view){

      name = ET_name.getText().toString();
      uname = ET_uname.getText().toString();
        pass = ET_pass.getText().toString();
        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,name,uname,pass);
        finish();
    }
}
