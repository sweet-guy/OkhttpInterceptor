package com.wdcloud.okhttpinterceptor;

import android.util.Log;

/**
 * Info:
 * Created by Umbrella.
 * CreateTime: 2020/11/12 15:48
 */

public class BridgeInterceptor implements Interceptor{
    @Override
    public OkBean interceptor(Chain chain) {
        OkBean request = chain.request();
        request.setFirstStr("BridgeInterceptor已设置");
        chain.proceed(request);
        return request;
    }
}
