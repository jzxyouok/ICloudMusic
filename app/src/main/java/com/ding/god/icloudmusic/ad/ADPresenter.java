package com.ding.god.icloudmusic.ad;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;

import com.ding.god.dinglibrary.base.BasePresenter;
import com.ding.god.dinglibrary.utils.ImageManager;

/**
 * Created by god on 2017/7/4.
 */

public class ADPresenter extends BasePresenter<ADModel,ADIView> {


    @Override
    public void onStart() {
        mView.initView();
        mView.bindListener();
        new Thread(new ASecondThread()).start();
    }

    public void intentToMain(){
        new Thread(new ToMainThread()).start();
    }

    public void setADImage(ImageManager im, ImageView iv){
        im.showUrlImage(mModel.AD_URL,iv);
    }

    @Override
    public void onDestroy() {
    }


    //延迟一秒展示图片
    private class ASecondThread implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Context context = mView.getContext();
            if (context!=null){
                ((Activity) context).runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mView.displayADAfterASecond();
                    }
                });

            }

        }
    }

    //延迟两秒进入主页
    private class ToMainThread implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Context context = mView.getContext();
            if (context!=null){
                ((Activity) context).runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mView.toMain();
                    }
                });
            }

        }
    }


}
