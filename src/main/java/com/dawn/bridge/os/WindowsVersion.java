package com.dawn.bridge.os;

public class WindowsVersion extends OperationSystemVersion{
    @Override
    public void play(String filename) {
        vf.decode("Windows", filename);
    }
}
