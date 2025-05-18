package com.dawn.simplefactory;

import com.dawn.simplefactory.framework.TVFactory;
import com.dawn.simplefactory.tv.TV;

public class Client{
    public static void main(String args[]){
        try{
            TV tv;
            tv = TVFactory.produceTV("haier");
            tv.play();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}


