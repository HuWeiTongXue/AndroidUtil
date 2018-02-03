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
        ToastUtil.setMsgColor(Color.parseColor("#ff0000"));
        ToastUtil.setsBgResource(R.drawable.aa);
        ToastUtil.setGravity(Gravity.CENTER,0,0);
        ToastUtil.showShort(R.string.app_name,new Object[]{"a","b"});
    }
}
