package com.rm.dell.assignment_vallabhsolutions;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.SQLException;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener{
DB_Controller controller;
    EditText firstname;
    EditText lastname;
    private GestureDetectorCompat gestureDetectorCompat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname = (EditText)findViewById(R.id.fname);
        lastname = (EditText)findViewById(R.id.lname);
        this.gestureDetectorCompat = new GestureDetectorCompat(this,this);
        controller = new DB_Controller(this,"",null,1);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

            Intent intent = new Intent(this,Main3Activity.class);
            //finish();
            startActivity(intent);
       return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetectorCompat.onTouchEvent(event);
        return super.onTouchEvent(event);

    }


    public void btn_click(View view) {
        switch (view.getId()){
            case R.id.button:
               try {
                   controller.insert_student(firstname.getText().toString(),lastname.getText().toString());
               } catch (SQLException e)
               {
                   Toast.makeText(MainActivity.this,"ALREADY EXISTS",Toast.LENGTH_SHORT).show();
               }
                break;
            case R.id.button2:
                controller.delete_student(firstname.getText().toString());
                break;
            case R.id.button3:
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Enter New FirstName: ");
                final EditText new_firstname = new EditText(this);
                dialog.setView(new_firstname);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                         controller.update_student(firstname.getText().toString(),new_firstname.getText().toString());
                    }
                });
                dialog.show();
                break;

        }
    }


}
