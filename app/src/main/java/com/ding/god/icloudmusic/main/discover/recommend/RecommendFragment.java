package com.ding.god.icloudmusic.main.discover.recommend;


import android.os.Bundle;

import com.ding.god.dinglibrary.base.BaseFragment;
import com.ding.god.icloudmusic.R;

public class RecommendFragment extends BaseFragment<RecommendPresenter> {


    public RecommendFragment() {

    }

    public static RecommendFragment newInstance() {

        Bundle args = new Bundle();

        RecommendFragment fragment = new RecommendFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_recommand;
    }

}
