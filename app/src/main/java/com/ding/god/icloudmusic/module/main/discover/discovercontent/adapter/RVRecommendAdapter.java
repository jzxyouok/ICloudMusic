package com.ding.god.icloudmusic.module.main.discover.discovercontent.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ding.god.dinglibrary.base.BaseRVAdapter;
import com.ding.god.icloudmusic.Constant;
import com.ding.god.icloudmusic.R;
import com.ding.god.icloudmusic.bean.DiscoverRecommendBean;
import com.ding.god.icloudmusic.bean.RecommendModule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/7/18.
 */

public class RVRecommendAdapter extends BaseRVAdapter<DiscoverRecommendBean, RecyclerView.ViewHolder> {

    private static final int TYPE_NAVI = 1;
    private static final int TYPE_NORMAL = 2;
    private static final int TYPE_LASTED = 3;

    private static final String DIY = "diy";
    private static final String MOD50 = "mod_50";
    private static final String MIX1 = "mix_1";
    private static final String MIX72 = "mix_72";
    private static final String MIX83 = "mix_83";

    private List<RecommendModule> modules;
    public RVRecommendAdapter(Context context) {
        super(context);
        modules = new ArrayList<>();
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
    public int getCount() {
        return getDatas().size()==0?0:modules.size();
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
        DiscoverRecommendBean data = getData(0);
        switch (getItemType(position)){
            case TYPE_NAVI://音乐导航
                break;
            case TYPE_NORMAL:
                RecommendModule module = modules.get(position - 1);
                switch (module.getValue()){
                    case DIY://推荐歌单
                        NormalViewHolder diyHolder = (NormalViewHolder) holder;
                        diyHolder.tvRecommendItemName.setText(module.getKey());
                        diyHolder.rvRecommendItem.setLayoutManager(new GridLayoutManager(mContext,3, GridLayoutManager.HORIZONTAL,false));

                        break;
                    case MOD50:
                        break;
                    case MIX1:
                        break;
                    case MIX72:
                        break;
                    case MIX83:
                        break;
                }
                break;
        }
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
        @BindView(R.id.tv_recommend_item_name)
        TextView tvRecommendItemName;
        @BindView(R.id.rv_recommend_item)
        RecyclerView rvRecommendItem;

        NormalViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
