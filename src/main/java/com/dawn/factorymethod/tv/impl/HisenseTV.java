package com.dawn.factorymethod.tv.impl;

import com.dawn.factorymethod.tv.TV;

public class HisenseTV implements TV {
    public void play() {
        System.out.println("海信电视机播放中......");
    }
}
