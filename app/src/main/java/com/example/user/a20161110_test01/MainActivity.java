package com.example.user.a20161110_test01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        LinearLayout ll = (LinearLayout) findViewById(R.id.layout2_linear);
        Button bt = new Button(MainActivity.this);
        bt.setText("Button");
        ll.addView(bt);

//        Button btn = new Button(MainActivity.this);
//        btn.setText("Click me!");
//        setContentView(btn);


    }
}
