package com.ding.god.icloudmusic.main.discover;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ding.god.dinglibrary.base.BaseFragment;
import com.ding.god.icloudmusic.R;



public class DiscoverFragment extends BaseFragment<DiscoverPresenter> implements DiscoverIView  {


    public DiscoverFragment() {
    }

    public static DiscoverFragment newInstance() {
        Bundle args = new Bundle();
        DiscoverFragment fragment = new DiscoverFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected int getLayoutID() {
        return R.layout.fragment_discover;
    }

    @Override
    public void initView() {

    }

    @Override
    public void bindListener() {

    }
}
