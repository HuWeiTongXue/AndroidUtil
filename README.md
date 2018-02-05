# AndroidUtil
[![](https://www.jitpack.io/v/ArchurWang/AndroidUtil.svg)](https://www.jitpack.io/#ArchurWang/AndroidUtil)
## How to use
#### Step 1. Add the JitPack repository to your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
```
#### Step 2. Add the dependency
```
	dependencies {
	        compile 'com.github.ArchurWang:AndroidUtil:V1.2'
	}

```
#### Step 3. Add the Application
```
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Utils.init(this);
    }
}

<application
        android:name=".MyApp"
        ...>
        ...
</application>
```
## 工具类集合
* #### LogUtil
    * 日志工具类（可控制log输出）
```
        // 控制是否输出
        LogUtil.isDebug = true;
        // 使用默认的TAG标签
        LogUtil.e("hello world");
        // 自定义TAG标签
        LogUtil.e("test","hello world");
```
* #### ToastUtil
    * 吐司工具类（背景色 位置 时长 自定义布局）
```
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
```
* #### TimeUtil
    * 时间工具类
```
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
```
* #### SPUtil
    * 数据存储工具类
```
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
```

