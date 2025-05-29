package com.dawn.abstractfactory.factory;

import com.dawn.abstractfactory.product.Television;
import com.dawn.abstractfactory.product.AirConditioner;

public interface EFactory {

    Television produceTelevision();

    AirConditioner produceAirConditioner();
}
