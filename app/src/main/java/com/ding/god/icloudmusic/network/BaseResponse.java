package com.ding.god.icloudmusic.network;

/**
 * Created by Administrator on 2017/7/12.
 */

public class BaseResponse {

    private int error_code;
    private String error_message;

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
}
