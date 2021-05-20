package patterns.structural.proxy.java.example.downloader;

import patterns.structural.proxy.java.example.media.interfaces.ThirdPartyYouTubeLib;

public class YouTubeDownloader {
    private ThirdPartyYouTubeLib api;

    public YouTubeDownloader(ThirdPartyYouTubeLib api) { this.api = api; }

    public void renderVideoPage(String videoId) {
        var video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.getId());
        System.out.println("Title: " + video.getTitle());
        System.out.println("Video: " + video.getData());
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        var list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on Youtube (imagine fancy " +
                "HTML)");
        list.values()
                .stream()
                .map(video -> "ID: " + video.getId() + " / Title: " +
                        video.getTitle())
                .forEach(System.out::println);
        System.out.println("-------------------------------\n");
    }
}