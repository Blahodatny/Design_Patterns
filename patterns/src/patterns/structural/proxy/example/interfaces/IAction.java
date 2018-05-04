package patterns.structural.proxy.example.interfaces;

import patterns.structural.proxy.example.User;

public interface IAction {
    void buyVideo(User user);

    void addToPlayList(User user);
}