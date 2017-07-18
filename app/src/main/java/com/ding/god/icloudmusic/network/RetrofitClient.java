package com.ding.god.icloudmusic.network;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/7/12.
 */

public class RetrofitClient  {
    public static final String URL = "http://tingapi.ting.baidu.com/v1/restserver/";



    private HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(
            new HttpLoggingInterceptor.Logger() {
                @Override
                public void log(String message) {
                    Log.d("http",message);
                }
            }
    ).setLevel(HttpLoggingInterceptor.Level.BODY);

    private OkHttpClient okHttpClient = new  OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build();

    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build();

    private ApiService apiService = retrofit.create(ApiService.class);

    private RetrofitClient(){}


    public ApiService getApiService(){
        return apiService;
    }

    private static class Instance{
        private static RetrofitClient instance = new RetrofitClient();
    }

    public static RetrofitClient getRetrofitClient(){
        return Instance.instance;
    }

}
