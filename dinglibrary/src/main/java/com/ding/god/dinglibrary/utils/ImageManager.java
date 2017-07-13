package com.ding.god.dinglibrary.utils;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by god on 2017/7/6.
 */

public class ImageManager {

    //hjahahah
    private Context mContext;

    private RequestOptions requestOptions = new RequestOptions()
            .skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .error(android.R.mipmap.sym_def_app_icon);


    public ImageManager(Context mContext) {
        this.mContext = mContext;
    }

    public void loadUrlImage(String url, ImageView iv){
        Log.d("TAG","zhixing");
        Glide.with(mContext)
                .load(url)
                .apply(requestOptions)
                .into(iv);
    }

}
