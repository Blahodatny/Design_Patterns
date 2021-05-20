package patterns.structural.proxy.java.example.proxy;

import patterns.structural.proxy.java.example.media.ThirdPartyYouTubeClass;
import patterns.structural.proxy.java.example.media.Video;
import patterns.structural.proxy.java.example.media.interfaces.ThirdPartyYouTubeLib;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private final ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private final HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty())
            cachePopular = youtubeService.popularVideos();
        else
            System.out.println("Retrieved list from cache.");
        return cachePopular;
    }

    public Video getVideo(String videoId) {
        var video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        return video;
    }
}