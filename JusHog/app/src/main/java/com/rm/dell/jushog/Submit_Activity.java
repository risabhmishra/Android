package com.rm.dell.jushog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Submit_Activity extends AppCompatActivity {
TextView txt1,txt2,txt3,txt4,txt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
           String name = extras.getString("NAME");
           String age1  = extras.getString("AGE");
            String email = extras.getString("EMAIL");
            String phone = extras.getString("PHONE");
            int sex = extras.getInt("SEX");
            txt1 = (TextView)findViewById(R.id.sname);
            txt1.setText(name);
            txt2 = (TextView)findViewById(R.id.sage);
            txt2.setText(age1);
            txt3 = (TextView)findViewById(R.id.semail);
            txt3.setText(email);
            txt4 = (TextView)findViewById(R.id.sphone);
            txt4.setText(phone);
            txt5 = (TextView)findViewById(R.id.ssex);
            if(sex==1){
                txt5.setText("Mr.");
            }
            else if(sex==2)
            {
                txt5.setText("Ms.");
            }
        }
    }
}
