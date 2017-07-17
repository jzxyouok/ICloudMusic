package com.ding.god.icloudmusic.main.discover.recommend;

import com.ding.god.dinglibrary.base.BasePresenter;

/**
 * Created by Administrator on 2017/7/17.
 */

public class RecommendPresenter extends BasePresenter<RecommendModel,RecommendIView> {
    @Override
    public void onStart() {
        mView.initView();
        mView.bindListener();
    }

    @Override
    public void onDestroy() {

    }
}
