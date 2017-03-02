package com.csdt.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lylee on 2017/3/2.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
