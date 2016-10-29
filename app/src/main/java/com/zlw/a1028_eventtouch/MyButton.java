package com.zlw.a1028_eventtouch;

import android.content.Context;
import android.nfc.Tag;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by zlw on 2016/10/28 0028.
 */
public class MyButton extends Button {
    private static final String TAG = "MyButton";

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "MyButton_onTouchEvent_ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "MyButton_onTouchEvent_ACTION_UP ");
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
                return true;
        }
        return super.dispatchTouchEvent(event);
    }

}
