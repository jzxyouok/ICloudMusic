package com.ding.god.dinglibrary.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by god on 2017/7/4.
 */

public class TUtil {

    public static <T> T getT(Object o,int i){
        Class clazz = o.getClass();
        Type type = clazz.getGenericSuperclass();
        ParameterizedType p = (ParameterizedType) type;
        Class<T> c = (Class<T>) p.getActualTypeArguments()[i];
        try {
            return  c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }




}
