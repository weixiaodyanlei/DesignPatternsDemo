package com.dawn.abstractfactory.product.impl;

import com.dawn.abstractfactory.product.AirConditioner;


public class HairAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("海尔空调温度改变中......");
    }
}
