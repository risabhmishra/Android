package com.rm.dell.srmfoodies;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class Act2 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        Spinner spin_camp = (Spinner)findViewById(R.id.spin_campus);
        Spinner spin_pot = (Spinner)findViewById(R.id.spin_potheri);
        Spinner spin_high = (Spinner)findViewById(R.id.spin_highway);
        spin_camp.setOnClickListener(
                new Spinner.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent intent1 = new Intent(Act2.this,Act3.class);
                    }
                }
        );

        spin_pot.setOnClickListener(
                new Spinner.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent intent1 = new Intent(Act2.this,Act3.class);
                    }
                }
        );

        spin_high.setOnClickListener(
                new Spinner.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent intent1 = new Intent(Act2.this,Act3.class);
                    }
                }
        );

    }
}
