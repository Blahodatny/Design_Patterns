package patterns.structural.proxy.java.example.media.interfaces;

import patterns.structural.proxy.java.example.media.Video;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}