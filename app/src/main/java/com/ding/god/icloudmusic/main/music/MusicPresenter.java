package com.ding.god.icloudmusic.main.music;

import com.ding.god.dinglibrary.base.BasePresenter;

/**
 * Created by Administrator on 2017/7/17.
 */

public class MusicPresenter extends BasePresenter<MusicModel,MusicIView> {
    @Override
    public void onStart() {
        mView.initView();
        mView.bindListener();
    }

    @Override
    public void onDestroy() {

    }
}
