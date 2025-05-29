package com.dawn.abstractfactory.factory.impl;

import com.dawn.abstractfactory.factory.EFactory;
import com.dawn.abstractfactory.product.Television;
import com.dawn.abstractfactory.product.AirConditioner;
import com.dawn.abstractfactory.product.impl.HaierTelevision;
import com.dawn.abstractfactory.product.impl.HairAirConditioner;

public class HaierFactory implements EFactory {
    public Television produceTelevision(){
        return new HaierTelevision();
    }

    public AirConditioner produceAirConditioner(){
        return new HairAirConditioner();
    }
}

