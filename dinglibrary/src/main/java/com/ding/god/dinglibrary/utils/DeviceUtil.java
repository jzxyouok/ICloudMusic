package com.ding.god.dinglibrary.utils;

import android.content.Context;
import android.telephony.TelephonyManager;

/**
 * Created by Administrator on 2017/7/18.
 */

public class DeviceUtil {
    /**
     * 获取设备的唯一标识，deviceId
     *
     * @param context
     * @return
     */
    public static String getDeviceId(Context context) {
        TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        String deviceId = tm.getDeviceId();
        if (deviceId == null) {
            return null;
        } else {
            return deviceId;
        }
    }
}
