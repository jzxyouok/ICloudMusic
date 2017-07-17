package com.ding.god.icloudmusic.main;


import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;

import android.view.View;
import android.widget.ImageView;

import com.ding.god.dinglibrary.base.BaseActivity;
import com.ding.god.dinglibrary.base.BaseFragment;
import com.ding.god.dinglibrary.base.BaseFragmentPagerAdapter;
import com.ding.god.icloudmusic.R;
import com.ding.god.icloudmusic.customview.TopBar;
import com.ding.god.icloudmusic.main.discover.DiscoverFragment;
import com.ding.god.icloudmusic.main.friends.FriendsFragment;
import com.ding.god.icloudmusic.main.music.MusicFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class MainActivity extends BaseActivity<MainPresenter> implements MainIView {

    @BindView(R.id.drawer)
    DrawerLayout drawer;
    @BindView(R.id.tl_main)
    TabLayout tlMain;
    @BindView(R.id.topBar_main)
    TopBar topBarMain;
    @BindView(R.id.vp_main)
    ViewPager vpMain;
//    @BindView(R.id.nv_main)
//    NavigationView nvMain;

    //TabLayout的tab
    private int[] tabItems = new int[]{R.drawable.main_music_selector,
                                       R.drawable.main_discover_selector,
                                       R.drawable.main_friends_selector};

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        List<BaseFragment> fragments = new ArrayList<>();
        fragments.add(MusicFragment.newInstance());
        fragments.add(DiscoverFragment.newInstance());
        fragments.add(FriendsFragment.newInstance());
        BaseFragmentPagerAdapter pagerAdapter = new BaseFragmentPagerAdapter(getSupportFragmentManager(),fragments);
        vpMain.setAdapter(pagerAdapter);

        tlMain.setupWithViewPager(vpMain);

        //设置tabItem
        for (int i=0;i<fragments.size();i++){
            TabLayout.Tab tab = tlMain.getTabAt(i);
            tab.setCustomView(R.layout.layout_main_tabitem);
            ImageView tabIcon = (ImageView) tab.getCustomView().findViewById(R.id.iv_tab_icon);
            tabIcon.setImageResource(tabItems[i]);
        }

        vpMain.setCurrentItem(1);
    }

    @Override
    public void bindListener() {
        topBarMain.setIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  drawer.openDrawer(nvMain);
            }
        });
    }

}
