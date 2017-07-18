package com.ding.god.icloudmusic.main.discover.discovercontent;

import com.ding.god.dinglibrary.base.BaseModel;
import com.ding.god.icloudmusic.Constant;
import com.ding.god.icloudmusic.bean.DiscoverRecommendBean;
import com.ding.god.icloudmusic.network.BaseResponse;
import com.ding.god.icloudmusic.network.RetrofitClient;
import com.ding.god.icloudmusic.network.RxTransfromer;

import io.reactivex.Observable;

/**
 * Created by Administrator on 2017/7/17.
 */

public class DiscoverContentModel implements BaseModel{

    public Observable<BaseResponse<DiscoverRecommendBean>> getRecommendData(){
        return RetrofitClient.getRetrofitClient().getApiService()
                .getRecommendBean(Constant.CHANNEL, "0", Constant.METHOD, Constant.CUID, Constant.FOCUS_NUM)
                .compose(RxTransfromer.<BaseResponse<DiscoverRecommendBean>>observeOnToMain());
    }
}
