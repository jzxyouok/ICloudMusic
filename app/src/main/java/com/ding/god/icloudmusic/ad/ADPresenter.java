package com.ding.god.icloudmusic.ad;

import com.ding.god.dinglibrary.base.BasePresenter;

/**
 * Created by god on 2017/7/4.
 */

public class ADPresenter extends BasePresenter<ADModel,ADIView> {

    private Thread thread;

    @Override
    public void onStart() {
        mView.initView();
        thread = new Thread(new ASecondThread());
        thread.start();
    }

    @Override
    public void onDestroy() {

    }


    private class ASecondThread implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mView.displayADAfterASecond();
        }
    }


}
