package com.rm.dell.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send (View view)
    {
        Button button = (Button)findViewById(R.id.button);
        EditText msg = (EditText)findViewById(R.id.editText);
        String message = msg.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,message);
        Intent choose = Intent.createChooser(intent,"Send Message...");
        startActivity(choose);
    }
}
