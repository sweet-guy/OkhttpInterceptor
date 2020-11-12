package com.wdcloud.okhttpinterceptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new BridgeInterceptor());
        interceptors.add(new RetryAndFollowInterceptor());
        interceptors.add(new CacheInterceptor());
        OkBean okBean = new OkBean("模拟OkHttp");
        RealInterceptorChain request = new RealInterceptorChain(okBean,interceptors, 0);
        OkBean proceed = request.proceed(okBean);
        Log.e("最后组合结果",proceed.toString());
    }
}