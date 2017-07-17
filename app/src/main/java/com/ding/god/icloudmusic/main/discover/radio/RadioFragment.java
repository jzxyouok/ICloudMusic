package com.ding.god.icloudmusic.main.discover.radio;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ding.god.dinglibrary.base.BaseFragment;
import com.ding.god.icloudmusic.R;

public class RadioFragment extends BaseFragment<RadioPresenter> {


    public RadioFragment() {

    }

    public static RadioFragment newInstance() {

        Bundle args = new Bundle();
        RadioFragment fragment = new RadioFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_radio;
    }

}
