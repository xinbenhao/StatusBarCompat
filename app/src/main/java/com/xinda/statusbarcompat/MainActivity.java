package com.xinda.statusbarcompat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import qiu.niorgai.StatusBarCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置状态栏颜色
        StatusBarCompat.setStatusBarColor(MainActivity.this,getResources().getColor(R.color.heise));
        //设置透明状态栏
       // StatusBarCompat.translucentStatusBar(MainActivity.this);

    }
}
