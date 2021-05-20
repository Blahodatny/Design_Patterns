package patterns.structural.proxy.example;

import patterns.structural.proxy.example.interfaces.Action;

public class Access implements Action {
    private final Video video = new Video();

    public void buyVideo(User user) {
        if (user.getMoneyCount() > 0)
            video.buyVideo(user);
        else
            System.out.println(user.getName() +
                    ", you do not have enough money to get access rights!!!");
    }

    public void addToPlayList(User user) {
        if (user.getMoneyCount() > 0)
            video.addToPlayList(user);
        else
            System.out.println(user.getName() +
                    ", you do not have enough money to add video to play list!!!");
    }
}