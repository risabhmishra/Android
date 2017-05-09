package com.rm.dell.jushog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
EditText name,age,email,phone;
    RadioButton male,female;
    int atmos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.editname);
        age = (EditText)findViewById(R.id.editage);
        email=(EditText)findViewById(R.id.editemail);
        phone = (EditText)findViewById(R.id.editphone);
        male = (RadioButton)findViewById(R.id.radiomale);
        female = (RadioButton)findViewById(R.id.radiofemale);
        Button button = (Button)findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = ((RadioGroup)findViewById( R.id.rgb)).getCheckedRadioButtonId();
                atmos = getAtmos( id );
                String name1 = name.getText().toString();
                String Age =age.getText().toString();
                String email1 = email.getText().toString();
                String phone1 = phone.getText().toString();
                Intent intent = new Intent(MainActivity.this,Submit_Activity.class);
                intent.putExtra("NAME",name1);
                intent.putExtra("AGE",Age);
                intent.putExtra("EMAIL",email1);
                intent.putExtra("PHONE",phone1);
                intent.putExtra("SEX",atmos);
                startActivity(intent);
            }
        }
        );

    }

    private int getAtmos( int id ) {
        switch( id ) {
            case R.id.radiomale:
                atmos = 1;
                break;
            case R.id.radiofemale:
                atmos = 2;
                break;
        }

        return atmos;
    }

}
