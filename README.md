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

