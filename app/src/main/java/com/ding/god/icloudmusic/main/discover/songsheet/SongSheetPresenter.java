package com.ding.god.icloudmusic.main.discover.songsheet;

import com.ding.god.dinglibrary.base.BasePresenter;

/**
 * Created by Administrator on 2017/7/17.
 */

public class SongSheetPresenter extends BasePresenter<SongSheetModel,SongSheetIView> {
    @Override
    public void onStart() {
        mView.initView();
        mView.bindListener();
    }

    @Override
    public void onDestroy() {

    }
}
