package com.ding.god.icloudmusic.module.main.discover.discovercontent;

import com.ding.god.dinglibrary.base.BaseIView;
import com.ding.god.icloudmusic.bean.DiscoverRecommendBean;

/**
 * Created by Administrator on 2017/7/17.
 */

public interface DiscoverContentIView extends BaseIView {
    void addRecommendData(DiscoverRecommendBean data);
}
