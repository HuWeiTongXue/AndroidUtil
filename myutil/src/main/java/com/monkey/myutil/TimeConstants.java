package com.monkey.myutil;


import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Description: 时间单元换算
 * Author: Archur
 * Date: 2018-02-05
 * Time: 11:48
 */

public class TimeConstants {

    /**
     * 秒与毫秒的倍数
     */
    public static final int MSEC = 1;
    /**
     * 秒与毫秒的倍数
     */
    public static final int SEC  = 1000;
    /**
     * 分与毫秒的倍数
     */
    public static final int MIN  = 60000;
    /**
     * 时与毫秒的倍数
     */
    public static final int HOUR = 3600000;
    /**
     * 天与毫秒的倍数
     */
    public static final int DAY = 86400000;

    /**
     *
     * @IntDef      "包住" 常量
     * @Retention   定义策略
     * @Unit        声明构造器
     */
    @IntDef({MSEC,SEC,MIN,HOUR,DAY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Unit{

    }
}
