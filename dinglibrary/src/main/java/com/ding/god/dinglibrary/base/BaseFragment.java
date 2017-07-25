package com.ding.god.dinglibrary.base;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ding.god.dinglibrary.R;
import com.ding.god.dinglibrary.utils.ImageManager;
import com.ding.god.dinglibrary.utils.TUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment<P extends BasePresenter> extends Fragment {


    public P mPresenter;
    protected Context mContext;
    protected ImageManager mImageManager;
    private Unbinder unBinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutID(),container,false);
        unBinder = ButterKnife.bind(this,view);
        mContext = getContext();
        mImageManager = new ImageManager();
        mPresenter = TUtil.getT(this,0);
        if (this instanceof BaseIView){
            mPresenter.attachVM(this);
        }
        return view;
    }

    //获得布局
    protected abstract int getLayoutID();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null){
            mPresenter.detachVM();
        }
        if (unBinder!=null){
            unBinder.unbind();
        }
    }
}
