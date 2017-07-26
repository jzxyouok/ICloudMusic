package com.ding.god.icloudmusic.module.main.discover;

import com.ding.god.dinglibrary.base.BasePresenter;

/**
 * Created by Administrator on 2017/7/17.
 */

public class DiscoverPresenter extends BasePresenter<DiscoverModel,DiscoverIView> {
    @Override
    public void onStart() {
        mView.initView();
        mView.bindListener();
    }

    @Override
    public void onDestroy() {

    }
}
