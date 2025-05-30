package com.dawn.singleton.singleton;

public class Singleton4 {
    private static class singletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4() {}

    public static Singleton4 getInstance() {
        return singletonHolder.INSTANCE;
    }
}
