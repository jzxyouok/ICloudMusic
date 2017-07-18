package com.ding.god.dinglibrary.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ding.god.dinglibrary.utils.ImageManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */

public abstract class BaseRVAdapter<T,VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter{

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
        return datas.size();
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
}
