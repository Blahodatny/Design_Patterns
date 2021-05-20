package patterns.structural.proxy;

import patterns.structural.proxy.java.example.downloader.YouTubeDownloader;
import patterns.structural.proxy.java.example.media.ThirdPartyYouTubeClass;
import patterns.structural.proxy.java.example.proxy.YouTubeCacheProxy;

public class ProxyEverydayExample {
    public static void showExample() {
        var naiveDownloader =
                new YouTubeDownloader(new ThirdPartyYouTubeClass());
        var smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        var naive = test(naiveDownloader);
        var smart = test(smartDownloader);
        System.out.print(
                "Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(YouTubeDownloader downloader) {
        var startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        var estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}