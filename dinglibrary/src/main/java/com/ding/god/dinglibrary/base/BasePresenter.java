package com.ding.god.dinglibrary.base;

/**
 * Created by god on 2017/7/4.
 */

public abstract class BasePresenter<M,V> {

    public M mModel;
    public V mView;


    public void attachVM(V v,M m){
        mModel = m;
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
