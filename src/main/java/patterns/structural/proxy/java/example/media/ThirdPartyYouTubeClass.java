package patterns.structural.proxy.java.example.media;

import patterns.structural.proxy.java.example.media.interfaces.ThirdPartyYouTubeLib;

import java.util.HashMap;
import java.util.stream.IntStream;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.

    private int random() {
        return 5 + (int) (Math.random() * ((10 - 5) + 1));
    }

    private void experienceNetworkLatency() {
        var randomLatency = random();
        IntStream.range(0, randomLatency).forEach(i -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
    }

    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.print("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> hMap = new HashMap<>();
        hMap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hMap.put(
                "mkafksangasj",
                new Video("mkafksangasj", "Dog play with ball.mp4")
        );
        hMap.put(
                "dancescideoo",
                new Video("asdfas3ffasd", "Dancing video.mpq")
        );
        hMap.put(
                "dlsdk5jfslaf",
                new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov")
        );
        hMap.put(
                "3sdfgsd1j333",
                new Video("3sdfgsd1j333", "Programing lesson#1.avi")
        );

        System.out.print("Done!" + "\n");
        return hMap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video... ");

        experienceNetworkLatency();
        var video = new Video(videoId, "Some video title");

        System.out.print("Done!" + "\n");
        return video;
    }
}