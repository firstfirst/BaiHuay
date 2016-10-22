package com.example.baihuay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;


public class activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);


        Intent intent = getIntent();
       /// String str = intent.getStringExtra("เลขท้าย 2ตัว",4);
        String num = intent.getStringExtra("เลขท้าย");
       String num2 = intent.getStringExtra("text");
        TextView tv1 = (TextView) findViewById(R.id.textView);
        ///tv1.setText("เลขท้าย 2ตัว");
        tv1.setText(num2);

        TextView tv2 = (TextView) findViewById(R.id.textView2);
        ///tv2.setText("เลขท้าย 3ตัว");
        tv2.setText(num);

        //TextView tv = (TextView) findViewById(R.id.textView);
        //tv2.setText();
    }
}
