package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Updata update;

    public class Updata {

        @SerializedName("loc")
        public String updateTime;
    }

}
