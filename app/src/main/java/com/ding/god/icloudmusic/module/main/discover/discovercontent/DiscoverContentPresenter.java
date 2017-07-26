package com.ding.god.icloudmusic.module.main.discover.discovercontent;

import android.util.Log;

import com.ding.god.dinglibrary.base.BasePresenter;
import com.ding.god.icloudmusic.bean.DiscoverRecommendBean;
import com.ding.god.icloudmusic.network.FilterConsumer;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * Created by Administrator on 2017/7/17.
 */

public class DiscoverContentPresenter extends BasePresenter<DiscoverContentModel,DiscoverContentIView>{
    @Override
    public void onStart() {
        mView.initView();
        mView.bindListener();
    }

    @Override
    public void onDestroy() {

    }

    public void getRecommendData(){

        mModel.getRecommendData()
                .subscribe(new FilterConsumer<DiscoverRecommendBean>() {
                    @Override
                    public void response(DiscoverRecommendBean response) {
                        Log.d("TAG","RESPONSE:"+response.toString());
                        mView.addRecommendData(response);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {

                    }
                });

    }
}
