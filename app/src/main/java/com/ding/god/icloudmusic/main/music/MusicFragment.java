package com.ding.god.icloudmusic.main.music;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ding.god.dinglibrary.base.BaseFragment;
import com.ding.god.icloudmusic.R;


public class MusicFragment extends BaseFragment<MusicPresenter> implements MusicIView {


    public MusicFragment() {

    }


    public static MusicFragment newInstance() {
        MusicFragment fragment = new MusicFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    protected int getLayoutID() {
        return R.layout.fragment_music;
    }

    @Override
    public void initView() {

    }

    @Override
    public void bindListener() {

    }
}
