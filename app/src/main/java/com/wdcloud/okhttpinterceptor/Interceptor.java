package com.wdcloud.okhttpinterceptor;

/**
 * Info:
 * Created by Umbrella.
 * CreateTime: 2020/11/12 15:46
 */

public interface Interceptor {
    OkBean interceptor(Chain chain);
    interface Chain {
        OkBean request();

        OkBean proceed(OkBean okBean);
    }
}
