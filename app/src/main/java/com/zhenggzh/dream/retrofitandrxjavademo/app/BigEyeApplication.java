package com.zhenggzh.dream.retrofitandrxjavademo.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.LogcatLogStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import java.util.ArrayList;

import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by gxj on 2018/11/14.
 */

public class BigEyeApplication extends Application {

    public static Context appContext;
    public static ArrayList<Activity> allActivities = new ArrayList<Activity>();
    public static BigEyeApplication app;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
        app = this;
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  // 是否显示线程信息，默认为ture
                .methodCount(0)         // 显示的方法行数，默认为2
                .methodOffset(7)        // 隐藏内部方法调用到偏移量，默认为5
//                .logStrategy(new LogcatLogStrategy()) // 更改要打印的日志策略。
                .tag("HttpLog")   // 每个日志的全局标记。默认PRETTY_LOGGER
                .build();

        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));

    }

    public static Context getConText(){
        return appContext;
    }

    public static BigEyeApplication getApp(){
        return app;
    }

    public static void addActivity(Activity activity) {
        allActivities.add(activity);
    }

    public static void delActivity(Activity activity) {
        allActivities.remove(activity);
    }

}
