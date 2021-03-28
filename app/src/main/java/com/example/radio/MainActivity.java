package com.example.radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll;
    Switch sw;
    RadioGroup radioGroup;
    RadioButton radio1;
    RadioButton radio2;
    RadioButton radio3;
    RadioButton radio4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = (Switch) findViewById(R.id.sw);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        radio3 = (RadioButton) findViewById(R.id.radio3);
        radio4 = (RadioButton) findViewById(R.id.radio4);
        ll = (LinearLayout) findViewById(R.id.ll);
    }

    public void check_sw(View view) {
        if ( sw.isChecked() && radio1.isChecked()  ){
            ll.setBackgroundResource(R.drawable.w1);
        }
        else if(sw.isChecked() && radio2.isChecked() ){
            ll.setBackgroundResource(R.drawable.w2);
        }
        else if(sw.isChecked() && radio3.isChecked() ){
            ll.setBackgroundResource(R.drawable.w3);
        }
        else if(sw.isChecked() && radio4.isChecked() ){
            ll.setBackgroundResource(R.drawable.w4);
        }
    }

    public void setimg(View view) {
        if ( ! sw.isChecked()){
            ll.setBackgroundResource(R.drawable.blue);
        }
    }

    public void setimg2(View view) {
        if (! sw.isChecked()){
            ll.setBackgroundResource(R.drawable.red);
        }
    }


    public void setimg3(View view) {
        if (! sw.isChecked() ){
            ll.setBackgroundResource(R.drawable.yellow);
        }
    }


    public void setimg4(View view) {
        if (!sw.isChecked() ){
            ll.setBackgroundResource(R.drawable.green);
        }
    }
}