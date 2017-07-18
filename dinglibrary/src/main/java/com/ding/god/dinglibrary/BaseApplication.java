package com.ding.god.dinglibrary;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.util.Log;

import com.ding.god.dinglibrary.utils.DeviceUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */

public class BaseApplication extends Application {

    private static BaseApplication app;

    private List<Activity> activities;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        activities = new ArrayList<>();
        getDeviceInfo();
    }

    private void getDeviceInfo() {

        Log.d("TAG","厂商："+ Build.BRAND);
        Log.d("TAG","设备："+ Build.MODEL);
        Log.d("TAG","DeviceId："+ DeviceUtil.getDeviceId(this));
    }

    public static BaseApplication getInstance(){
        return app;
    }

    public void addActivity(Activity activity){
        if (activities!=null){
            activities.add(activity);
        }
    }

    public void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public void removeAllActivity(){
        activities.clear();
    }
}
