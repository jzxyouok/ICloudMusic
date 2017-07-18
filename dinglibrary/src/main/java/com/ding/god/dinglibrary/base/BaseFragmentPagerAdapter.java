package com.ding.god.dinglibrary.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/7/17.
 */

public class BaseFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> fragments;

    private String[] tabTitle;

    public BaseFragmentPagerAdapter(FragmentManager fm,List<BaseFragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    public BaseFragmentPagerAdapter(FragmentManager fm,List<BaseFragment> fragments,String[] tabTitle) {
        super(fm);
        this.fragments = fragments;
        this.tabTitle = tabTitle;
    }

    @Override
    public Fragment getItem(int position) {
        if (fragments!=null){
            return fragments.get(position);
        }else {
            return null;
        }
    }

    @Override
    public int getCount() {
        if (fragments!=null){
            return fragments.size();
        }else {
            return 0;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (tabTitle==null){
            return super.getPageTitle(position);
        }else {
            return tabTitle[position];
        }
    }
}
