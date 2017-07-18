package com.ding.god.dinglibrary.base;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */

public class BasePagerAdapter<T> extends PagerAdapter {

    private List<T> datas;

    public BasePagerAdapter(List<T> datas) {
        this.datas = datas;
    }

    @Override
    public int getCount() {
        if (datas==null||datas.size()==0){
            return 0;
        }else {
            return datas.size();
        }
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
