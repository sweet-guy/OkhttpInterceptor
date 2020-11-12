package com.wdcloud.okhttpinterceptor;

import java.util.List;

/**
 * Info:
 * Created by Umbrella.
 * CreateTime: 2020/11/12 15:57
 */

public class RealInterceptorChain implements Interceptor.Chain {
    private OkBean okBean;
    private List<Interceptor> interceptors;
    private int index;

    public RealInterceptorChain(OkBean okBean, List<Interceptor> interceptors, int index) {
        this.okBean = okBean;
        this.interceptors = interceptors;
        this.index = index;
    }

    @Override
    public OkBean request() {
        return okBean;
    }

    @Override
    public OkBean proceed(OkBean okBean) {
        if(index>=interceptors.size()) return null;
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(okBean, interceptors, index+1);
        Interceptor interceptor = interceptors.get(index);
        OkBean interceptorOkBean = interceptor.interceptor(realInterceptorChain);
        return interceptorOkBean;
    }
}
