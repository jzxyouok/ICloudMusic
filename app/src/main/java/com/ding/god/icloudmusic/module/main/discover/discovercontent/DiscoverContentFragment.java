package com.ding.god.icloudmusic.module.main.discover.discovercontent;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ding.god.dinglibrary.base.BaseFragment;
import com.ding.god.dinglibrary.view.FocusView;
import com.ding.god.icloudmusic.R;
import com.ding.god.icloudmusic.module.main.discover.discovercontent.adapter.RVRecommendAdapter;
import com.ding.god.icloudmusic.bean.DiscoverRecommendBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class DiscoverContentFragment extends BaseFragment<DiscoverContentPresenter> implements DiscoverContentIView {

    public static final int TYPE_RECOMMEND = 1;
    public static final int TYPE_SONG_SHEET = 2;
    public static final int TYPE_RADIO = 3;
    public static final int TYPE_RANK = 4;
    @BindView(R.id.rv_discover_recommend)
    RecyclerView rvDiscoverRecommend;

    //个性推荐页面的适配器
    private RVRecommendAdapter recommendAdapter;
    private FocusView focusView;

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
                //初始化个性推荐页面视图
                initRecommendView();
                break;
            case TYPE_SONG_SHEET:
                break;
            case TYPE_RADIO:
                break;
            case TYPE_RANK:
                break;
        }
    }
    //初始化个性推荐页面视图
    public void initRecommendView(){
        //初始化Recyclerview
        rvDiscoverRecommend.setLayoutManager(new LinearLayoutManager(mContext, OrientationHelper.VERTICAL,false));
        recommendAdapter = new RVRecommendAdapter(mContext);
        rvDiscoverRecommend.setAdapter(recommendAdapter);
        //创建焦点图
        focusView = new FocusView(mContext);
        focusView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,300));
        //先将焦点图添加进RecyclerView中，等待数据下载完毕设置内容
        recommendAdapter.addHeadView(focusView);
        //调用presenter中下载个性推荐数据的方法
        mPresenter.getRecommendData();
    }


    /**
     * 初始化焦点图
     */
    private void initFocus(DiscoverRecommendBean.ResultBeanXXXXXXXXXXXXXXXXXX.FocusBean focus) {
        List<ImageView> imageViews = new ArrayList<>();
        for (int i=0;i<focus.getResult().size();i++){
            ImageView imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            mImageManager.showUrlImage(focus.getResult().get(i).getRandpic(), imageView);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageViews.add(imageView);
        }
        focusView.setFocusImages(imageViews);
    }

    @Override
    public void bindListener() {

    }


    @Override
    public void addRecommendData(DiscoverRecommendBean data) {
        initFocus(data.getResult().getFocus());
        recommendAdapter.addData(data);
        recommendAdapter.notifyDataSetChanged();
    }
}
