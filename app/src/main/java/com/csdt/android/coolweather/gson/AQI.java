package com.csdt.android.coolweather.gson;

/**
 * Created by lylee on 2017/3/2.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
