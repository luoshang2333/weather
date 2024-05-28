package com.example.weather.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    private int id;
    private String provinceNane;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setld(int id) {
        this.id = id;
    }


    public String getProvinceNane() {
        return provinceNane;
    }

    public void setProvinceNane(String provinceNane) {
        this.provinceNane = provinceNane;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}