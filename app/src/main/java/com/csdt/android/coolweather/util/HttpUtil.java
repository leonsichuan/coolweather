package com.csdt.android.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lylee on 2017/3/2.
 */

public class HttpUtil {

    /**
     * HTTP服务交互工具类
     * @param address HTTP请求地址
     * @param callback 处理服务器响应的回调
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
