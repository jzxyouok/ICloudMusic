package com.ding.god.icloudmusic.manager;

import com.ding.god.dinglibrary.BaseApplication;
import com.ding.god.icloudmusic.gen.DaoMaster;
import com.ding.god.icloudmusic.gen.DaoSession;

/**
 * Created by Administrator on 2017/7/26.
 */

public class GreenDaoManager {

    private static final String DB_NAME = "i_cloud_music.db";

    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;

    private GreenDaoManager(){
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(BaseApplication.getInstance(), DB_NAME);
        mDaoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
        mDaoSession = mDaoMaster.newSession();
    }

    private static class InnerDao{
        private static GreenDaoManager INSTANCE = new GreenDaoManager();
    }

    public static GreenDaoManager getInstance(){
        return InnerDao.INSTANCE;
    }

    public static DaoMaster getDaoMaster(){
        return InnerDao.INSTANCE.mDaoMaster;
    }

    public static DaoSession getDaoSession(){
        return InnerDao.INSTANCE.mDaoSession;
    }

}
