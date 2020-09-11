package com.example.lib_citydata.bean;

import java.util.List;

public class City {
	private String id;
    private String name;
    private List<Area> cityList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Area> getAreaList() {
        return cityList;
    }

    public void setAreaList(List<Area> areaList) {
        this.cityList = areaList;
    }
}