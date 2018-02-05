package com.monkey.androidutil;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

import com.monkey.myutil.LogUtil;
import com.monkey.myutil.TimeConstants;
import com.monkey.myutil.TimeUtil;
import com.monkey.myutil.ToastUtil;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //string millis date 三种日期互转
        TimeUtil.string2Date("2017-01-01 12:00:00");
        TimeUtil.date2String(new Date());
        TimeUtil.millis2String(System.currentTimeMillis());
        TimeUtil.string2Millis("2017-01-01 12:00:00");
        TimeUtil.date2Millis(new Date());
        TimeUtil.millis2Date(System.currentTimeMillis());

        // 获取两个时间的时间差 54分钟
        TimeUtil.getTimeSpan("2017-01-01 12:00:00", "2017-01-01 13:30:00", TimeConstants.MIN);
        // 获取指定时间与当前时间的时间差 3天
        TimeUtil.getTimeSpanByNow("2018-01-01 12:00:00", TimeConstants.DAY);
        // 获取两个时间的时间差 1天1小时30分钟
        TimeUtil.getFitTimeSpan("2017-01-01 12:00:00", "2017-01-02 13:30:00", TimeUtil.PRECISION_SEC);
        // 获取指定时间与当前时间的时间差 1天1小时30分钟
        TimeUtil.getFitTimeSpanByNow("2018-01-01 12:00:00", TimeUtil.PRECISION_SEC);

        // 获取指定时间两小时后的时间毫秒值
        TimeUtil.getMillis("2018-01-04 00:50:00", 2, TimeConstants.HOUR);
        // 获取指定时间两小时后的时间字符串
        TimeUtil.getString("2018-01-04 00:50:00", 2, TimeConstants.HOUR);
        // 获取指定时间两小时后的时间Date
        TimeUtil.getDate("2018-01-04 00:50:00", 2, TimeConstants.HOUR);

        // 获取当前时间两小时后的时间毫秒值
        TimeUtil.getMillisByNow(2, TimeConstants.HOUR);
        // 获取当前时间两小时后的时间时间字符串
        TimeUtil.getStringByNow(2, TimeConstants.HOUR);
        // 获取当前时间两小时后的时间Date
        TimeUtil.getDateByNow(0, TimeConstants.HOUR);

        //获取指定时间与当前时间的友好时间差 今天15:32 昨天15:32
        TimeUtil.getFriendlyTimeSpanByNow("2018-01-04 00:50:00");


        // 获取当前毫秒时间戳
        TimeUtil.getNowMills();
        // 获取当前时间字符串
        TimeUtil.getNowString();
        // 获取当前 Date
        TimeUtil.getNowDate();

        //是否是今天
        TimeUtil.isToday("2018-01-01 12:00:00");
        //是否闰年
        TimeUtil.isLeapYear("2018-01-01 12:00:00");
        // 获取中文 周一
        TimeUtil.getChineseWeek("2018-01-01 12:00:00");
        // 获取美式 Monday
        TimeUtil.getUSWeek("2018-01-01 12:00:00");
        //获取星期索引(1周日 7周六)
        TimeUtil.getWeekIndex("2018-01-01 12:00:00");
        // 获取月份中的第几周(周日才是一周的开始)
        TimeUtil.getWeekOfMonth("2018-02-04 12:00:00");
        // 获取该年中的第几周(周日才是一周的开始)
        TimeUtil.getWeekOfYear("2018-02-04 12:00:00");
        // 获取生肖
        TimeUtil.getChineseZodiac("2018-02-04 12:00:00");
        // 获取星座
        TimeUtil.getZodiac(2, 4);

        Log.e(TAG, "onCreate:" + TimeUtil.getZodiac(2, 4));
        Log.e(TAG, "onCreate:" + TimeUtil.getUSWeek("2018-01-01 12:00:00"));

    }

    public void toast(View view) {

    }
}
