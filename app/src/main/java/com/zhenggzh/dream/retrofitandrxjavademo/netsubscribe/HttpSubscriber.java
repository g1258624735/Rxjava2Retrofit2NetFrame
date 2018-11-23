package com.zhenggzh.dream.retrofitandrxjavademo.netsubscribe;

import com.zhenggzh.dream.retrofitandrxjavademo.bean.WeatherBean;
import com.zhenggzh.dream.retrofitandrxjavademo.netapi.URLConstant;
import com.zhenggzh.dream.retrofitandrxjavademo.netutils.HttpMethods;
import com.zhenggzh.dream.retrofitandrxjavademo.netutils.OkHttpUtils;

import io.reactivex.observers.DisposableObserver;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.ResponseBody;

/**
 * Created by gxj on 2018/11/14.
 */

public class HttpSubscriber {
    /**
     * 获取数据
     * okHttp+rxJava+Retrofit
     */
    public static void getWeather(String key, String location, DisposableObserver<WeatherBean> subscriber) {
        HttpMethods.getInstance().toSubscribe(HttpMethods.getInstance().getHttpApi().getWeather(key, location), subscriber);
    }

    /**
     * 获取数据
     * okHttp 直接获取数据
     */
    public static void getWeatherOkHttp(String key, String location, Callback callback) {
        final Request request = new Request.Builder()
                .url(URLConstant.BASE_URL + "now?key=" + key + "&location=" + location)
                .get()//默认就是GET请求，可以不写
                .build();
        Call call = OkHttpUtils.getInstance().getOkHttpClient().newCall(request);
        call.enqueue(callback);
    }
}
