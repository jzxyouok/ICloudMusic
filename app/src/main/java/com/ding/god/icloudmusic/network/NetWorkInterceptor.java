package com.ding.god.icloudmusic.network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by god on 2017/7/22.
 */

public class NetWorkInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request newRequest = request.newBuilder().addHeader("User-Agent", "android").build();
        return chain.proceed(newRequest);
    }
}
