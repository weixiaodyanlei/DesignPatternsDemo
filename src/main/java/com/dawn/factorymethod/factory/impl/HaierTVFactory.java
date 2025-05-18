package com.dawn.factorymethod.factory.impl;

import com.dawn.factorymethod.factory.TVFactory;
import com.dawn.factorymethod.tv.impl.HaierTV;
import com.dawn.factorymethod.tv.TV;

public class HaierTVFactory extends TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("海尔电视机工厂生产海尔电视机。");
        return new HaierTV();
    }
}
