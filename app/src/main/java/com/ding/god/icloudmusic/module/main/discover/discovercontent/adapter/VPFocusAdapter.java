package com.ding.god.icloudmusic.module.main.discover.discovercontent.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */

public class VPFocusAdapter extends PagerAdapter {
    private List<ImageView> imageViews;
    private boolean canLoob = true;


    public VPFocusAdapter(List<ImageView> imageViews) {
        this.imageViews = imageViews;
    }

    @Override
    public int getCount() {
        if(imageViews==null||imageViews.size()==0) {
            return 0;
        }
        return canLoob?Integer.MAX_VALUE:imageViews.size();
    }



    public int getTruePositon(int position){
        return position%imageViews.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = imageViews.get(getTruePositon(position));
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ImageView imageView = imageViews.get(getTruePositon(position));
        container.removeView(imageView);
    }
}
