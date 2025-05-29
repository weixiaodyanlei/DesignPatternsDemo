package com.dawn.abstractfactory.product.impl;

import com.dawn.abstractfactory.product.Television;

public class TCLTelevision implements Television {
    @Override
    public void play() {
        System.out.println("TCL电视机播放中......");
    }
}
