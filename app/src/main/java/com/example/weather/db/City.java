package com.example.weather.db;


import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {
    private int id;
    private String cityName;//om市务标 private int cityCode;//总源中代号
    private int cityCode;
    private int provinceId;//d市w4781d位


    public int getId() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceid) {
        this.provinceId = provinceId;
    }
}
