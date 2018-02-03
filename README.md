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
	        compile 'com.github.ArchurWang:AndroidUtil:V1.0'
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
* LogUtil工具类（可控制log输出）
```
        // 控制是否输出
        LogUtil.isDebug = true;
        // 使用默认的TAG标签
        LogUtil.e("hello world");
        // 自定义TAG标签
        LogUtil.e("test","hello world");
```
* ToastUtil工具类
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

