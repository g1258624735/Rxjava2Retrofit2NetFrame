package com.zhenggzh.dream.retrofitandrxjavademo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zhenggzh.dream.retrofitandrxjavademo.bean.WeatherBean;
import com.zhenggzh.dream.retrofitandrxjavademo.netsubscribe.HttpSubscriber;
import com.zhenggzh.dream.retrofitandrxjavademo.netutils.OnSuccessAndFaultListener;
import com.zhenggzh.dream.retrofitandrxjavademo.netutils.OnSuccessAndFaultSub;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * 首页
 */

public class MainActivity extends AppCompatActivity {
    Button btn1;
    private String key = "8080192f614a48d9a1967cc376973f2f";
    private String location = "东莞";
    public static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
//                getOkHttpData();
            }
        });
    }


    /**
     * okHttp+rxJava+retrofit
     * 以和风天气的接口请求为准
     * 请求数据
     */
    private void getData() {
        HttpSubscriber.getWeather(key, location, new OnSuccessAndFaultSub(new OnSuccessAndFaultListener() {
            @Override
            public void onSuccess(WeatherBean result) {
                //成功
                Toast.makeText(MainActivity.this, "请求成功：" + result.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFault(String errorMsg) {
                //失败
                Toast.makeText(MainActivity.this, "请求失败：" + errorMsg, Toast.LENGTH_SHORT).show();
            }
        }));
    }

    /**
     * okHttp 请求数据
     */
    private void getOkHttpData() {
        HttpSubscriber.getWeatherOkHttp(key, location, new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                //失败
                Toast.makeText(MainActivity.this, "请求失败：" + e.getMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull final Response response)  {
                Log.e(TAG,Thread.currentThread().getName());
                //成功
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Toast.makeText(MainActivity.this, "请求成功：" + response.body().string(), Toast.LENGTH_SHORT).show();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
    }

}
