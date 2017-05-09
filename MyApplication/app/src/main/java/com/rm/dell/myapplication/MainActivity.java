
package com.rm.dell.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void country (View view) {
       // TextView app = (TextView) findViewById(R.id.textView);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String cha = String.valueOf(spinner.getSelectedItem());
        //app.setText(cha);
    }
    public void npage (View view)
    {    Button but = (Button)findViewById(R.id.next);
        Intent intent = new Intent(this,second.class);
        startActivity(intent);
    }
    public void addition (View view)
    {
        EditText t1 = (EditText)findViewById(R.id.t1);
        EditText t2 = (EditText)findViewById(R.id.t2);
        TextView text = (TextView)findViewById(R.id.textView);
        Button button = (Button)findViewById(R.id.add);
        String c =  t1.getText().toString();
        String d = t2.getText().toString();
        int a = Integer.parseInt(c);
        int b = Integer.parseInt(d);
        int s = a + b ;
        text.setText(Integer.toString(s));
    }

    
}
