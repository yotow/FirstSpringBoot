package com.example.springbootdemo.model;

public class ProductionProfile implements SystemProfile{

    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
