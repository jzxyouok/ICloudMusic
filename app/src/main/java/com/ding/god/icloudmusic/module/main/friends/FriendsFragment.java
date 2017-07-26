package com.ding.god.icloudmusic.module.main.friends;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ding.god.dinglibrary.base.BaseFragment;
import com.ding.god.icloudmusic.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FriendsFragment extends BaseFragment<FriendsPresenter> implements FriendsIView {


    public FriendsFragment() {
    }

    public static FriendsFragment newInstance() {

        Bundle args = new Bundle();

        FriendsFragment fragment = new FriendsFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_friends, container, false);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_friends;
    }

    @Override
    public void initView() {

    }

    @Override
    public void bindListener() {

    }
}
