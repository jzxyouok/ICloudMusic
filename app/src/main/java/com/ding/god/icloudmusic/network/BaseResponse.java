package com.ding.god.icloudmusic.network;

/**
 * Created by Administrator on 2017/7/12.
 */

public class BaseResponse<T> {


    private T result;
    private int error_code;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "result=" + result +
                ", error_code=" + error_code +
                '}';
    }
}
