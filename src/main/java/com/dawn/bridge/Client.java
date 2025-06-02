package com.dawn.bridge;

import com.dawn.bridge.os.OperationSystemVersion;
import com.dawn.bridge.os.WindowsVersion;
import com.dawn.bridge.video.RMVBFile;
import com.dawn.bridge.video.VideoFile;

public class Client {
    public static void main(String[] args) {
        VideoFile file = new RMVBFile();
        OperationSystemVersion version = new WindowsVersion();
        version.setVideoFile(file);
        version.play("《想见你想见你想见你》");
    }
}
