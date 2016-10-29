package com.zlw.a1028_eventtouch;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
//    private MyButton bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        ScrollView sc = new ScrollView(this);
//        sc.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//
//        LinearLayout ll = new LinearLayout(this);
//        ll.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//        ll.setOrientation(LinearLayout.VERTICAL);
//
//
//        for (int i = 0; i < 15; i++) {
//
//            EditText et = new EditText(this);
//            et.setLayoutParams(new LinearLayout.LayoutParams(260, 160));
//            ll.addView(et);
//
//            et.setOnTouchListener(new View.OnTouchListener() {
//                @Override
//                public boolean onTouch(View v, MotionEvent event) {
//                    ViewGroup viewGroup = (ViewGroup) v.getParent();
//                    Log.e("zlw","et_onTouch");
//                    viewGroup.requestDisallowInterceptTouchEvent(true);
//                    return false;
//                }
//            });
//        }
//        sc.addView(ll);
        setContentView(R.layout.activity_main);

        ScrollView sc2 = (ScrollView) findViewById(R.id.sc2);
        sc2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });

    }
//
//        bt1 = (MyButton) findViewById(R.id.bt1);
//
//        bt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG, "MyButton_onClick");
//
//            }
//        });
//
//        bt1.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        Log.i(TAG, "MyButton_onTouch_ACTION_DOWN");
//                        break;
//                    case MotionEvent.ACTION_UP:
//                        Log.i(TAG, "MyButton_onTouch_ACTION_UP ");
//                        break;
//                }
//                return false;
//            }
//        });


}
