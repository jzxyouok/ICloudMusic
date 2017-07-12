package com.ding.god.dinglibrary.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ding.god.dinglibrary.utils.ImageManager;
import com.ding.god.dinglibrary.utils.TUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<P extends BasePresenter,M extends BaseModel> extends AppCompatActivity {

    public P mPresenter;
    public M mModel;
    private Unbinder binder;
    protected Context mContext;
    protected ImageManager mImageManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        mContext = this;
        mImageManager = new ImageManager(mContext);
        binder = ButterKnife.bind(this);
        mPresenter = TUtil.getT(this,0);
        mModel = TUtil.getT(this,1);
        if (this instanceof BaseIView){
            mPresenter.attachVM(this,mModel);
        }
    }

    //获得布局
    protected abstract int getLayoutID();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (binder!=null){
            binder.unbind();
        }
        if (mPresenter!=null){
            mPresenter.detachVM();
        }
    }
}
