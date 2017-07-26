package com.ding.god.icloudmusic.network;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * Created by Administrator on 2017/7/12.
 */

public abstract class FilterConsumer<T extends BaseResponse> implements Consumer<T> {

    public abstract void response(T response);

    @Override
    public void accept(@NonNull T t) throws Exception {
        if (t.getError_code()==22000){
            response(t);
        }else {
            if (t.getError_message()!=null){
                throw new Exception(t.getError_message());
            }
        }
    }
}
