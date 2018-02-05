package com.monkey.androidutil;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArraySet;
import android.util.Log;
import android.view.Gravity;
import android.view.View;


import com.monkey.myutil.SPUtil;
import com.monkey.myutil.TimeConstants;
import com.monkey.myutil.TimeUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 基本的put get方法
        SPUtil.getInstance().put("strKey","value");
        SPUtil.getInstance().put("boolKey",true);
        SPUtil.getInstance().put("intKey",12);
        SPUtil.getInstance().put("longKey",12l);
        SPUtil.getInstance().put("floatKey",12f);

        SPUtil.getInstance().getInt("intKey");

        Set<String> list = new TreeSet<>();
        list.add("a");
        list.add("b");
        SPUtil.getInstance().put("stringSet",list);
        Log.e(TAG, "onCreate:" + SPUtil.getInstance().getStringSet("stringSet").contains("a"));

        // 移除该 key
        SPUtil.getInstance().remove("key");
        // 清除所有数据
        SPUtil.getInstance().clear();
        // 是否存在该 key
        SPUtil.getInstance().contains("key");
        // 获取所有键值对
        SPUtil.getInstance().getAll();



    }

    public void toast(View view) {

    }
}
