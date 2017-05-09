package com.rm.dell.stop_watch;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private int seconds;
    private boolean running;
    private boolean wasrunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState!=null)
        {
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasrunning = savedInstanceState.getBoolean("wasrunning");
        }
        runtimer();
    }
    public void start_func (View view)
    {
running = true;
    }
    public void stop_func (View view)
    {
running = false;
    }
    public void reset_func(View view)
    {
        running = false;
        seconds=0;
    }
    private void runtimer()
    {
        final TextView timev = (TextView)findViewById(R.id.textView);
        final Handler handler = new Handler();
handler.post(new Runnable() {
    @Override
    public void run() {
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int secs = seconds%60;
        String time = String.format("%d:%02d:%02d",hours,minutes,secs);
        timev.setText(time);
        if (running)
        {
            seconds++;
        }
        handler.postDelayed(this,1000);
    }
});
    }
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        savedInstanceState.putInt("seconds",seconds);
        savedInstanceState.putBoolean("running",running);
        savedInstanceState.putBoolean("wasrunning",wasrunning);
    }
    protected void onPause()
    {
        super.onPause();
        wasrunning=running;
        running=false;
    }
    protected void onResume()
    {super.onResume();
        if(wasrunning)
        {
            running=true;
        }
    }
}
