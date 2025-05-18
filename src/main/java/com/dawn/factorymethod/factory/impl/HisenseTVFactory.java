package com.dawn.factorymethod.factory.impl;

import com.dawn.factorymethod.factory.TVFactory;
import com.dawn.factorymethod.tv.TV;
import com.dawn.factorymethod.tv.impl.HisenseTV;

public class HisenseTVFactory extends TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("海信电视机工厂生产海信电视机。");
        return new HisenseTV();
    }
}

