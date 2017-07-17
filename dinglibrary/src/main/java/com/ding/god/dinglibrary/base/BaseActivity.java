package com.ding.god.dinglibrary.base;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.ding.god.dinglibrary.R;
import com.ding.god.dinglibrary.utils.ImageManager;
import com.ding.god.dinglibrary.utils.TUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    public P mPresenter;
    private Unbinder binder;
    protected Context mContext;
    protected ImageManager mImageManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        mContext = this;
        mImageManager = new ImageManager();
        binder = ButterKnife.bind(this);
        mPresenter = TUtil.getT(this,0);
        if (this instanceof BaseIView){
            mPresenter.attachVM(this);
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
