package patterns.structural.proxy.example.interfaces;

import patterns.structural.proxy.example.User;

public interface Action {
    void buyVideo(User user);

    void addToPlayList(User user);
}