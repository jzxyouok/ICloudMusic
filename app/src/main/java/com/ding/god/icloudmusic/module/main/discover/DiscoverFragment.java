package com.ding.god.icloudmusic.module.main.discover;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.ding.god.dinglibrary.base.BaseFragment;
import com.ding.god.dinglibrary.base.BaseFragmentPagerAdapter;
import com.ding.god.icloudmusic.R;
import com.ding.god.icloudmusic.module.main.discover.discovercontent.DiscoverContentFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class DiscoverFragment extends BaseFragment<DiscoverPresenter> implements DiscoverIView {

    public static final String[] tabTitles = new String[]{"个性推荐", "歌单", "主播电台", "排行榜"};
    @BindView(R.id.tl_recommend)
    TabLayout tlRecommend;
    @BindView(R.id.vp_recommend)
    ViewPager vpRecommend;

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
        List<BaseFragment> fragments = new ArrayList<>();
        fragments.add(DiscoverContentFragment.newInstance(1));
        fragments.add(DiscoverContentFragment.newInstance(2));
        fragments.add(DiscoverContentFragment.newInstance(3));
        fragments.add(DiscoverContentFragment.newInstance(4));

        BaseFragmentPagerAdapter pagerAdapter = new BaseFragmentPagerAdapter(getChildFragmentManager(), fragments, tabTitles);
        vpRecommend.setAdapter(pagerAdapter);
        tlRecommend.setupWithViewPager(vpRecommend);
    }

    @Override
    public void bindListener() {

    }



}
