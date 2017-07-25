package com.ding.god.icloudmusic.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.ding.god.dinglibrary.base.BaseRVAdapter;
import com.ding.god.icloudmusic.Constant;
import com.ding.god.icloudmusic.R;
import com.ding.god.icloudmusic.bean.DiscoverRecommendBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/7/18.
 */

public class RVRecommendAdapter extends BaseRVAdapter<DiscoverRecommendBean, RecyclerView.ViewHolder> {

    private static final int TYPE_NAVI = 1;
    private static final int TYPE_NORMAL = 2;
    private static final int TYPE_LASTED = 3;

    public RVRecommendAdapter(Context context) {
        super(context);
    }


    @Override
    public int getItemType(int position) {
        if (position==0){
            return TYPE_NAVI;
        }else {
            return TYPE_NORMAL;
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateBodyViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case TYPE_NAVI:
                view = mInflater.inflate(R.layout.item_discover_recommend_navi, parent, false);
                return new NaviViewHolder(view);
            case TYPE_NORMAL:
                view = mInflater.inflate(R.layout.item_discover_recommend_normal, parent, false);
                return new NormalViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindBodyViewHolder(RecyclerView.ViewHolder holder, int position) {

    }



    static class NaviViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.rl_fm)
        RelativeLayout rlFm;
        @BindView(R.id.rl_daily)
        RelativeLayout rlDaily;
        @BindView(R.id.rl_rank)
        RelativeLayout rlRank;

        NaviViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    static class NormalViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.rl_recommend_item_top)
        RelativeLayout rlRecommendItemTop;
        @BindView(R.id.rv_recommend_item)
        RecyclerView rvRecommendItem;

        NormalViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
