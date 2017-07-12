package com.ding.god.dinglibrary.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by god on 2017/7/6.
 */

public class ImageManager {

    private Context mContext;

    private RequestOptions requestOptions = new RequestOptions()
            .skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.ALL);


    public ImageManager(Context mContext) {
        this.mContext = mContext;
    }

    public void loadUrlImage(String url, ImageView iv){
        Glide.with(mContext)
                .load(url)
                .apply(requestOptions)
                .thumbnail(0.5f)
                .into(iv);
    }

}
