package patterns.structural.proxy.example;

import patterns.structural.proxy.example.interfaces.Action;

public class Video implements Action {
    public void buyVideo(User user) {
        System.out.println(user.getName() + ", you have bought that video!!!");
    }

    public void addToPlayList(User user) {
        System.out.println(user.getName() + ", video has been added to play list!!!");
    }
}