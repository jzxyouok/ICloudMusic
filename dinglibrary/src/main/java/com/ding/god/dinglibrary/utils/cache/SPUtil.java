package com.ding.god.dinglibrary.utils.cache;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Array;
import java.lang.reflect.TypeVariable;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/7/18.
 */

public class SPUtil {


    public static final String SP_NAME = "icloudmusic";

    public static <T> void saveList(Context context,String tag,List<T> datas){
        Gson gson = new Gson();
        String listJson = gson.toJson(datas);
        SharedPreferences sp = context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(tag,listJson);
        edit.apply();
    }

    public static <T> List<T> getList(Context context,String tag){
        SharedPreferences sp = context.getSharedPreferences(SP_NAME,Context.MODE_APPEND);
        String listJson = sp.getString(tag, null);
        Gson gson = new Gson();
        List<T> list = gson.fromJson(listJson, new TypeToken<List<T>>() {
        }.getType());
        return list;
    }

}
