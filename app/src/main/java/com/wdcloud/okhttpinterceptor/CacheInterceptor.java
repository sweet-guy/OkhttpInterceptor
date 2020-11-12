package com.wdcloud.okhttpinterceptor;

/**
 * Info:
 * Created by Umbrella.
 * CreateTime: 2020/11/12 15:55
 */

public class CacheInterceptor implements Interceptor{
    @Override
    public OkBean interceptor(Chain chain) {
        OkBean request = chain.request();
        request.setThirdStr("CacheInterceptor已设置");
        chain.proceed(request);
        return request;
    }
}
