package com.dawn.bridge.os;

public class LinuxVersion extends OperationSystemVersion{
    @Override
    public void play(String filename) {
        vf.decode("Linux", filename);
    }
}
