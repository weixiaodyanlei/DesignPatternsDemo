package com.dawn.bridge.os;

public class UnixVersion extends OperationSystemVersion{
    @Override
    public void play(String filename) {
        vf.decode("Unix", filename);
    }
}
