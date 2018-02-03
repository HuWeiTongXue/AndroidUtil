package com.monkey.androidutil;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.monkey.myutil.LogUtil;
import com.monkey.myutil.ToastUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * LogUtil 使用
         */
        // 控制是否输出
        LogUtil.isDebug = true;
        // 使用默认的TAG标签
        LogUtil.e("hello world");
        // 自定义TAG标签
        LogUtil.e("test","hello world");

    }

    public void toast(View view) {
        // 设置吐司文字颜色
        ToastUtil.setMsgColor(Color.parseColor("#ff0000"));
        // 设置吐司背景资源
        ToastUtil.setsBgResource(R.drawable.aa);
        // 设置吐司背景颜色
        ToastUtil.setBgColor(getResources().getColor(R.color.colorAccent));
        // 设置吐司位置
        ToastUtil.setGravity(Gravity.CENTER,0,0);

        // 几种调用方式
        ToastUtil.showShort("Hello World");
        ToastUtil.showShort(getResources().getString(R.string.toast));
        ToastUtil.showShort(getResources().getString(R.string.toast),"jack");
        ToastUtil.showShort("hello,%s","jack");

        ToastUtil.showLong("Hello World");
        ToastUtil.showLong(getResources().getString(R.string.toast));
        ToastUtil.showLong(getResources().getString(R.string.toast),"jack");
        ToastUtil.showLong("hello,%s","jack");

        ToastUtil.showCustomLong(R.layout.loading);//自定义布局
    }
}
