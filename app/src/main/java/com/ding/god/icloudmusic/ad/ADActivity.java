package com.ding.god.icloudmusic.ad;

import android.view.ViewStub;
import android.widget.ImageView;

import com.ding.god.dinglibrary.base.BaseActivity;
import com.ding.god.icloudmusic.R;

import butterknife.BindView;

public class ADActivity extends BaseActivity<ADPresenter,ADModel> implements ADIView {


    @BindView(R.id.iv_ad_bg)
    ImageView ivAdBg;
    @BindView(R.id.vs)
    ViewStub vs;

    private ImageView ivAD;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_ad;
    }


    @Override
    public void initView() {

       // mImageManager.loadUrlImage(mModel.AD_URL,ivAD);
    }

    @Override
    public void displayADAfterASecond() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                vs.inflate();
                ivAD = ((ImageView) findViewById(R.id.iv_ad));
                mImageManager.loadUrlImage(mModel.AD_URL,ivAD);
            }
        });

    }


}
