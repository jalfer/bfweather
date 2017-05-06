package com.example.bfweather.gson;

/**
 * Created by Administrator on 2017/5/6 0006.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
