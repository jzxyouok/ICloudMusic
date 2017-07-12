package com.ding.god.dinglibrary.base;

import com.ding.god.dinglibrary.utils.TUtil;

/**
 * Created by god on 2017/7/4.
 */

public abstract class BasePresenter<M extends BaseModel ,V> {

    public M mModel;
    public V mView;

    public void attachVM(V v){
        mModel = TUtil.getT(this,0);
        mView = v;

        onStart();
    }

    public void detachVM(){
        mView = null;
        mModel = null;
        onDestroy();
    }

    public abstract void onStart();
    public abstract void onDestroy();
}
