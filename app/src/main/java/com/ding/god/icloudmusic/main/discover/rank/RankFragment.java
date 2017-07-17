package com.ding.god.icloudmusic.main.discover.rank;


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
public class RankFragment extends BaseFragment<RankPresenter> {


    public RankFragment() {
    }

    public static RankFragment newInstance() {

        Bundle args = new Bundle();
        RankFragment fragment = new RankFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected int getLayoutID() {
        return R.layout.fragment_rank;
    }


}
