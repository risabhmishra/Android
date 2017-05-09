package com.rm.dell.card_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Contact_Activity extends AppCompatActivity {
ImageView imageView;
    TextView tx_name,tx_email,tx_mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_);
        imageView = (ImageView)findViewById(R.id.d_img);
        tx_name=(TextView)findViewById(R.id.d_Name);
        tx_email=(TextView)findViewById(R.id.d_Email);
        tx_mobile=(TextView)findViewById(R.id.d_phone);
    imageView.setImageResource(getIntent().getIntExtra("img_id",00));
        tx_name.setText("Name: " + getIntent().getStringExtra("name"));
        tx_email.setText("Email: " + getIntent().getStringExtra("email"));
        tx_mobile.setText("Phone: " + getIntent().getStringExtra("mobile"));
    }
}
