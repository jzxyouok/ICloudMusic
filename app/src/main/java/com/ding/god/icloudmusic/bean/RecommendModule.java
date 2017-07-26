package com.ding.god.icloudmusic.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2017/7/26.
 */

public class RecommendModule {

    private String key;
    private String value;

    public RecommendModule(Long id, String key, String value) {

        this.key = key;
        this.value = value;
    }
    public RecommendModule() {
    }

    public RecommendModule(String key,String value){
        this.key = key;
        this.value = value;
    }


    public String getKey() {
        return this.key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getValue() {
        return this.value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
