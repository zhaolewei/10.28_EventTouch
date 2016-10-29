package com.zlw.a1028_eventtouch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class MainActivity2 extends Activity {

    private static final String TAG = "MainActivity";
    private MyButton bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        bt1 = (MyButton) findViewById(R.id.bt1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "MyButton_onClick");
            }
        });

        bt1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i(TAG, "MyButton_onTouch_ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i(TAG, "MyButton_onTouch_ACTION_UP ");
                        break;
                }
                return false;
            }
        });

    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "MainActivity_onTouch_ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "MainActivity_onTouch_ACTION_UP ");
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "MainActivity_dispatchTouchEvent_ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "MainActivity_dispatchTouchEvent_ACTION_UP ");
                break;
        }
        return super.dispatchTouchEvent(event);
    }
}