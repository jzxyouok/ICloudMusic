package com.ding.god.icloudmusic.main.discover.rank;

import com.ding.god.dinglibrary.base.BasePresenter;

/**
 * Created by Administrator on 2017/7/17.
 */

public class RankPresenter extends BasePresenter<RankModel,RankIView>{
    @Override
    public void onStart() {
        mView.initView();
        mView.bindListener();
    }

    @Override
    public void onDestroy() {

    }
}
