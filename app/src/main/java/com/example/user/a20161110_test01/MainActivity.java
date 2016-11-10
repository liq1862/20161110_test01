package com.example.user.a20161110_test01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout4);


//        LinearLayout ll = new LinearLayout(MainActivity.this);
//        ll.setOrientation(LinearLayout.HORIZONTAL);
//
//        LinearLayout.LayoutParams  params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT,1);
//
//        //LinearLayout ll = (LinearLayout) findViewById(R.id.layout2_linear);
//        Button bt = new Button(MainActivity.this);
//        bt.setText("Button");
//        ll.addView(bt);
//        Button bt2 = new Button(MainActivity.this);
//        bt2.setText("Button!!");
//        ll.addView(bt2);
//
//        setContentView(ll);

//        Button btn = new Button(MainActivity.this);
//        btn.setText("Click me!");
//        setContentView(btn);
    }
    public void click1(View v)
    {
        v.setVisibility(View.INVISIBLE);
    }
}
