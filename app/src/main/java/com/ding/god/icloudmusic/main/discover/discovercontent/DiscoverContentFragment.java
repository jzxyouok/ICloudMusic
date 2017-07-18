package com.ding.god.icloudmusic.main.discover.discovercontent;


import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ding.god.dinglibrary.base.BaseFragment;
import com.ding.god.icloudmusic.R;
import com.ding.god.icloudmusic.adapter.RVRecommendAdapter;
import com.ding.god.icloudmusic.bean.DiscoverRecommendBean;
import com.ding.god.icloudmusic.main.discover.DiscoverIView;
import com.ding.god.icloudmusic.main.discover.DiscoverPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class DiscoverContentFragment extends BaseFragment<DiscoverContentPresenter> implements DiscoverContentIView {

    public static final int TYPE_RECOMMEND = 1;
    public static final int TYPE_SONG_SHEET = 2;
    public static final int TYPE_RADIO = 3;
    public static final int TYPE_RANK = 4;
    @BindView(R.id.rv_discover_recommend)
    RecyclerView rvDiscoverRecommend;

    //个性推荐页面的适配器
    private RVRecommendAdapter adapter;

    public DiscoverContentFragment() {
    }

    public static DiscoverContentFragment newInstance(int type) {
        Bundle args = new Bundle();
        args.putInt("type", type);
        DiscoverContentFragment fragment = new DiscoverContentFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected int getLayoutID() {
        return R.layout.fragment_discover_content;
    }


    @Override
    public void initView() {

        switch (getArguments().getInt("type")) {
            case TYPE_RECOMMEND:
                rvDiscoverRecommend.setLayoutManager(new LinearLayoutManager(mContext, OrientationHelper.VERTICAL,false));
                adapter = new RVRecommendAdapter(mContext);
                rvDiscoverRecommend.setAdapter(adapter);
                mPresenter.getRecommendData();
                break;
            case TYPE_SONG_SHEET:
                break;
            case TYPE_RADIO:
                break;
            case TYPE_RANK:
                break;
        }
    }

    @Override
    public void bindListener() {

    }


    @Override
    public void addRecommendData(DiscoverRecommendBean data) {
        adapter.addData(data);
        adapter.notifyDataSetChanged();
    }
}
