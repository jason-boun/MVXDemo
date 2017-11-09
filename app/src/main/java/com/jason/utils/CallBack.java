package com.jason.utils;

/**
 * Created by JiaBo on 2017/11/8.
 * 通用回调
 */

public interface CallBack {

    void success();

    void fail(int code, String msg);

}
