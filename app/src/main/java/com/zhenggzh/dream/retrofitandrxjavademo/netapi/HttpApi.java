package com.zhenggzh.dream.retrofitandrxjavademo.netapi;

import com.zhenggzh.dream.retrofitandrxjavademo.bean.WeatherBean;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * Created by gxj on 2018/11/14.
 * <p>
 * 存放所有的Api
 */

public interface HttpApi {
    //天气预报
    @POST("now")
    Observable<WeatherBean> getWeather(@Query("key") String key, @Query("location") String location);

    //请填写自己的接口名
    @GET("top250")
    Observable<ResponseBody> getDataForMap(@QueryMap Map<String, Integer> map);

    /**
     * 通过地址下载一个文件
     */
    @GET()
    @Streaming
    Call<ResponseBody> downloadFile(@Url String fileUrl);

}
