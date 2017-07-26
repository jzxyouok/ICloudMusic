package com.ding.god.icloudmusic.module.main.discover.discovercontent.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ding.god.dinglibrary.base.BaseRVAdapter;
import com.ding.god.icloudmusic.R;
import com.ding.god.icloudmusic.bean.DiscoverRecommendBean;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/7/26.
 */

public class RVDIYAdapter extends BaseRVAdapter<DiscoverRecommendBean.ResultBeanXXXXXXXXXXXXXXXXXX.DiyBean,RVDIYAdapter.ViewHolder> {

    public RVDIYAdapter(Context context) {
        super(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateBodyViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_image_plus_text_one, parent, false);
        return null;
    }

    @Override
    public void onBindBodyViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv)
        ImageView iv;
        @BindView(R.id.tv_right_top)
        TextView tvRightTop;
        @BindView(R.id.tv_left_bottom)
        TextView tvLeftBottom;
        @BindView(R.id.tv_desc)
        TextView tvDesc;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
