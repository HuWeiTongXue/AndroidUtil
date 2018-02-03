package com.monkey.androidutil;

import android.app.Application;

import com.monkey.myutil.Utils;


/**
 * Description:
 * Author: Archur
 * Date: 2018-02-03
 * Time: 15:19
 */


public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Utils.init(this);
    }
}
