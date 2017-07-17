package com.ding.god.icloudmusic.main.friends;

import com.ding.god.dinglibrary.base.BasePresenter;

/**
 * Created by Administrator on 2017/7/17.
 */

public class FriendsPresenter extends BasePresenter<FriendsModel,FriendsIView> {
    @Override
    public void onStart() {
        mView.initView();
        mView.bindListener();
    }

    @Override
    public void onDestroy() {

    }
}
