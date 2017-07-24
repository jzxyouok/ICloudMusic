package com.ding.god.icloudmusic.main.discover.discovercontent;

import android.util.Log;

import com.ding.god.dinglibrary.base.BasePresenter;
import com.ding.god.icloudmusic.bean.DiscoverRecommendBean;
import com.ding.god.icloudmusic.network.BaseResponse;
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
                .subscribe(new FilterConsumer<BaseResponse<DiscoverRecommendBean>>() {
                    @Override
                    public void response(BaseResponse<DiscoverRecommendBean> response) {
                        Log.d("TAG","RESPONSE:"+response.toString());
                        mView.addRecommendData(response.getResult());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {

                    }
                });

    }
}
