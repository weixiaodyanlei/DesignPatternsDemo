package com.dawn.abstractfactory.factory.impl;

import com.dawn.abstractfactory.factory.EFactory;
import com.dawn.abstractfactory.product.Television;
import com.dawn.abstractfactory.product.AirConditioner;
import com.dawn.abstractfactory.product.impl.TCLAirConditioner;
import com.dawn.abstractfactory.product.impl.TCLTelevision;

public class TCLFactory implements EFactory {
    public Television produceTelevision(){
        return new TCLTelevision();
    }

    public AirConditioner produceAirConditioner(){
        return new TCLAirConditioner();
    }
}

