package com.dawn.abstractfactory;

import com.dawn.abstractfactory.factory.EFactory;
import com.dawn.abstractfactory.factory.impl.TCLFactory;
import com.dawn.abstractfactory.product.AirConditioner;
import com.dawn.abstractfactory.product.Television;

public class Client {
    public static void main(String[] args){
        EFactory factory = new TCLFactory();
        Television tv = factory.produceTelevision();
        AirConditioner ac = factory.produceAirConditioner();

        tv.play();
        ac.changeTemperature();
    }
}
