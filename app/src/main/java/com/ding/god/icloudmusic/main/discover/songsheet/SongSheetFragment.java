package com.ding.god.icloudmusic.main.discover.songsheet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ding.god.dinglibrary.base.BaseFragment;
import com.ding.god.icloudmusic.R;


public class SongSheetFragment extends BaseFragment<SongSheetPresenter> {


    public SongSheetFragment() {
    }

    public static SongSheetFragment newInstance() {

        Bundle args = new Bundle();

        SongSheetFragment fragment = new SongSheetFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_song_sheet;
    }

}
