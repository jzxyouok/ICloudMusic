package com.ding.god.icloudmusic.ad;

import android.content.Context;

import com.ding.god.dinglibrary.base.BaseIView;

/**
 * Created by god on 2017/7/4.
 */

public interface ADIView extends BaseIView {

    //获得context
    Context getContext();

    //显示广告页
    void displayADAfterASecond();

    //跳转到主页
    void toMain();

}
