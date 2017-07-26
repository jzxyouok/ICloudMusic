package com.ding.god.icloudmusic.module.main;

import com.ding.god.dinglibrary.base.BasePresenter;

/**
 * Created by Administrator on 2017/7/17.
 */

public class MainPresenter extends BasePresenter<MainModel,MainIView> {
    @Override
    public void onStart() {
        mView.initView();
        mView.bindListener();
    }

    @Override
    public void onDestroy() {

    }
}
