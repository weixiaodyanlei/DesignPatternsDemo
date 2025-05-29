package com.dawn.abstractfactory.product.impl;

import com.dawn.abstractfactory.product.AirConditioner;

public class TCLAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("TCL空调温度改变中......");
    }
}
