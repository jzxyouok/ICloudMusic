package com.ding.god.icloudmusic.module.main.discover.discovercontent;

import android.content.Context;

import com.ding.god.dinglibrary.base.BaseModel;
import com.ding.god.dinglibrary.utils.cache.SPUtil;
import com.ding.god.icloudmusic.Constant;
import com.ding.god.icloudmusic.bean.DiscoverRecommendBean;
import com.ding.god.icloudmusic.bean.RecommendModule;
import com.ding.god.icloudmusic.network.RetrofitClient;
import com.ding.god.icloudmusic.network.RxTransfromer;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Administrator on 2017/7/17.
 */

public class DiscoverContentModel implements BaseModel{

    private String[] keys = new String[]{"推荐歌单","推荐MV","最新音乐","精选专栏","主播电台"};
    private String[] values = new String[]{"diy","mod_50","mix_1","mix_72","mix_83"};

    public Observable<DiscoverRecommendBean> getRecommendData(){
        return RetrofitClient.getRetrofitClient().getApiService()
                .getRecommendBean(Constant.FROM,Constant.VERSION,"android",Constant.CHANNEL,Constant.METHOD,Constant.CUID,Constant.FOCUS_NUM)
                .compose(RxTransfromer.<DiscoverRecommendBean>observeOnToMain());
    }

    public List<RecommendModule> getRecommendModules(Context context){
        List<RecommendModule> list = SPUtil.getList(context, Constant.SPTag.RECOMMEND_MODULE);
        if (list==null){
            List<RecommendModule> modules = new ArrayList<>();
            for (int i=0;i<keys.length;i++){
                RecommendModule module = new RecommendModule(keys[i],values[i]);
                modules.add(module);
            }
            SPUtil.saveList(context,Constant.SPTag.RECOMMEND_MODULE,modules);
            return modules;
        }
        return list;
    }
}
