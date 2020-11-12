package com.wdcloud.okhttpinterceptor;

/**
 * Info:
 * Created by Umbrella.
 * CreateTime: 2020/11/12 15:54
 */

public class RetryAndFollowInterceptor implements Interceptor{
    @Override
    public OkBean interceptor(Chain chain) {
        OkBean request = chain.request();
        request.setSencondStr("RetryAndFollowInterceptor已设置");
        chain.proceed(request);
        return request;
    }
}
