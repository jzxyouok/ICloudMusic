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

    private static final int TYPE_FOCUS = 0;
    private static final int TYPE_NAVI = 1;
    private static final int TYPE_NORMAL = 2;
    private static final int TYPE_LASTED = 3;

    public RVRecommendAdapter(Context context) {
        super(context);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //根据type的不同获得不同的视图，取得不同的viewholder
        View view = null;
        switch (viewType) {
            case TYPE_FOCUS:
                view = mInflater.inflate(R.layout.item_discover_recommend_focus, parent, false);
                return new FocusViewHolder(view);
            case TYPE_NAVI:
                view = mInflater.inflate(R.layout.item_discover_recommend_navi, parent, false);
                return new NaviViewHolder(view);
            case TYPE_NORMAL:
                view = mInflater.inflate(R.layout.item_discover_recommend_normal, parent, false);
                return new NormalViewHolder(view);
            case TYPE_LASTED:
                break;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        DiscoverRecommendBean data = getData(0);
        switch (getItemViewType(position)){
            case TYPE_FOCUS:
                DiscoverRecommendBean.FocusBean focus = data.getFocus();
                FocusViewHolder focusViewHolder = (FocusViewHolder) holder;
                List<ImageView> imageViews = new ArrayList<>();
                for (int i=0;i<data.getFocus().getResult().size();i++){
                    ImageView imageView = new ImageView(mContext);
                    imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                    mImageManager.showUrlImage(focus.getResult().get(i).getRandpic(), imageView);
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageViews.add(imageView);
                }
                focusViewHolder.vpRecommendFocus.setAdapter(new VPFocusAdapter(imageViews));
                break;
            case TYPE_NAVI:
                break;
            case TYPE_NORMAL:
                break;
            case TYPE_LASTED:
                break;
        }
    }


    static class FocusViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.vp_recommend_focus)
        ViewPager vpRecommendFocus;

        FocusViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
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
        @BindView(R.id.rv_recommend_item)
        RecyclerView rvRecommendItem;

        NormalViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
