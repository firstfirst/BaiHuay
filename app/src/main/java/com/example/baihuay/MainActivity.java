package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.baihuay.model.huay;

public class MainActivity extends AppCompatActivity {
    huay h = new huay();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,activity.class);
                intent.putExtra("text","เลขท้าย 2ตัว");
                intent.putExtra("เลขท้าย",h.getRandomTwoDigits());
                startActivity(intent);
            }
        });
        Button btn2 = (Button) findViewById(R.id.button_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,activity.class);
                intent.putExtra("text","เลขท้าย 3ตัว");
                intent.putExtra("เลขท้าย",h.getRandomThreeDigits());
                startActivity(intent);
            }
        });
    }
}
