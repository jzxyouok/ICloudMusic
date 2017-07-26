package com.ding.god.icloudmusic.module.ad;

import android.content.Context;
import android.content.Intent;
import android.view.ViewStub;
import android.widget.ImageView;

import com.ding.god.dinglibrary.base.BaseActivity;
import com.ding.god.icloudmusic.R;
import com.ding.god.icloudmusic.module.main.MainActivity;

import butterknife.BindView;

public class ADActivity extends BaseActivity<ADPresenter> implements ADIView {


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
    public Context getContext() {
        return mContext;
    }

    @Override
    public void initView() {
    }

    @Override
    public void bindListener() {

    }

    @Override
    public void displayADAfterASecond() {
        vs.inflate();
        ivAD = ((ImageView) findViewById(R.id.iv_ad));
        mPresenter.setADImage(mImageManager,ivAD);
        mPresenter.intentToMain();
    }

    @Override
    public void toMain() {
        Intent intent = new Intent(ADActivity.this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_enter, R.anim.anim_out);
        finish();
    }


}
