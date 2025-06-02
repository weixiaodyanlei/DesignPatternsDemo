package com.dawn.bridge.os;

import com.dawn.bridge.video.VideoFile;

public abstract class OperationSystemVersion {
    protected VideoFile vf;

    public void setVideoFile(VideoFile vf){
        this.vf = vf;
    }

    public abstract void play(String filename);
}
