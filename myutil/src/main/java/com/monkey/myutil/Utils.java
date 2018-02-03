package com.monkey.myutil;

import android.annotation.SuppressLint;
import android.app.Application;
import android.support.annotation.NonNull;

/**
 * Description: 初始化类
 * Author: Archur
 * Date: 2018-02-03
 * Time: 15:18
 */

public class Utils {

    @SuppressLint("StaticFieldLeak")
    private static Application mApplication;

    /**
     * 初始化工具类(在项目Application中使用)
     *
     * @param app 应用
     */
    public static void init(@NonNull Application app) {
        Utils.mApplication = app;
    }

    /**
     * 获取 Application
     *
     * @return Application
     */
    public static Application getApp() {
        if (mApplication != null) return mApplication;
        throw new NullPointerException("u should init first");
    }
}
