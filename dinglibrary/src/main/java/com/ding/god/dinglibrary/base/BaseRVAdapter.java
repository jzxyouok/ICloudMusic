package com.ding.god.dinglibrary.base;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ding.god.dinglibrary.utils.ImageManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */

public abstract class BaseRVAdapter<T,VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter{

    private static final int TYPE_HEAD = 0;
    private static final int TYPE_BODY = 1;

    private View headView = null;

    private List<T> datas;
    protected ImageManager mImageManager;
    protected Context mContext;
    protected LayoutInflater mInflater;

    public BaseRVAdapter(Context context) {
        datas = new ArrayList<>();
        mImageManager = new ImageManager();
        mContext = context;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemCount() {
        int count = datas.size();
        if (headView!=null){
            count+=1;
        }
        return count;
    }

    public int getRealPosition(RecyclerView.ViewHolder holder){
        int position = holder.getLayoutPosition();
        return headView==null?position:position-1;
    }


    @Override
    public final int getItemViewType(int position) {
        if (headView!=null){
            if (position==0){
                return TYPE_HEAD;
            }else {
                return getItemType(position-1);
            }
        }else {
            return getItemType(position);
        }
//        if (headView!=null&&position==0){
//            return TYPE_HEAD;
//        }else {
//            return getItemType(position);
//        }
    }

    public int getItemType(int position){
        return TYPE_BODY;
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType==TYPE_HEAD){
            return new HeadViewHolder(headView);
        }else {
            return onCreateBodyViewHolder(parent,viewType);
        }
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (headView==null){
            onBindBodyViewHolder(holder,position);
        }else {
            if (getItemViewType(position)!=TYPE_HEAD){
                onBindBodyViewHolder(holder,position-1);
            }
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager){
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    return getItemViewType(position)==TYPE_HEAD?gridLayoutManager.getSpanCount():1;
                }
            });
        }
    }

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        ViewGroup.LayoutParams lp = holder.itemView.getLayoutParams();
        if (lp!=null&&lp instanceof StaggeredGridLayoutManager.LayoutParams){
            ((StaggeredGridLayoutManager.LayoutParams) lp).setFullSpan(holder.getLayoutPosition()==0);

        }
    }

    public abstract RecyclerView.ViewHolder onCreateBodyViewHolder(ViewGroup parent, int viewType);
    public abstract void onBindBodyViewHolder(RecyclerView.ViewHolder holder, int position);

    public void addHeadView(View headView) {
        this.headView = headView;
        notifyDataSetChanged();
    }

    public List<T> getDatas(){
        return datas;
    }

    public T getData(int position){
        if (position<datas.size()){
            return datas.get(position);
        }else {
            return null;
        }
    }

    public void addData(T t){
        datas.add(t);
    }

    public void addDatas(List<T> datas){
        this.datas.addAll(datas);
    }

    public void clearDatas(){
        datas.clear();
    }

    static class HeadViewHolder extends RecyclerView.ViewHolder{

        public HeadViewHolder(View itemView) {
            super(itemView);
        }
    }
}
