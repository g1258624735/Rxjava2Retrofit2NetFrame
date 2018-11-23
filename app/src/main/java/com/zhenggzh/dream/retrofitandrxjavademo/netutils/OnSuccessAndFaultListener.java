package com.zhenggzh.dream.retrofitandrxjavademo.netutils;

import com.zhenggzh.dream.retrofitandrxjavademo.bean.WeatherBean;

/**
 * Created by gxj on 2018/11/14.
 */
public interface OnSuccessAndFaultListener {
    void onSuccess(WeatherBean result);

    void onFault(String errorMsg);
}
