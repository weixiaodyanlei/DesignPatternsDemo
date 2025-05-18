package com.dawn.factorymethod;

import com.dawn.factorymethod.factory.impl.HaierTVFactory;
import com.dawn.factorymethod.factory.TVFactory;
import com.dawn.factorymethod.tv.TV;

public class Client {
    public static void main(String args[]){
        try{
            TVFactory tvFactory = new HaierTVFactory();
            TV tv = tvFactory.produceTV();
            tv.play();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
