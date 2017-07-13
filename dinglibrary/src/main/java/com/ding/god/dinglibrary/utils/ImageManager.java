package com.ding.god.dinglibrary.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by god on 2017/7/6.
 */

public class ImageManager {


    //默认配置选项
    private RequestOptions defaultOptions = new RequestOptions()
            .skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .error(android.R.mipmap.sym_def_app_icon);

    //配置选项
    private RequestBuilder<Drawable> requestBuilder(String url, ImageView iv){
        return Glide.with(iv.getContext()).load(url);
    }

    //配置选项
    private RequestBuilder<Drawable> requestBuilder(int resId, ImageView iv){
        return Glide.with(iv.getContext()).load(resId);
    }

    //显示网络图片
    public void showUrlImage(String url, ImageView iv){
        requestBuilder(url,iv)
                .apply(defaultOptions)
                .into(iv);
    }

    //可配置的显示网络图片
    public void showUrlImage(String url, ImageView iv,RequestOptions options){
        requestBuilder(url,iv)
                .apply(options)
                .into(iv);
    }

    public void showLocalImage(int resId, ImageView iv){
        requestBuilder(resId,iv)
                .apply(defaultOptions)
                .into(iv);
    }


    public void showLocalImage(int resId, ImageView iv,RequestOptions options){
        requestBuilder(resId,iv)
                .apply(options)
                .into(iv);
    }



}