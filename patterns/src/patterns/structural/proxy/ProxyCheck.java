package patterns.structural.proxy;

import patterns.structural.proxy.example.Access;
import patterns.structural.proxy.example.User;

public class ProxyCheck {
    public static void check() {
        Access access = new Access();
        access.buyVideo(new User(0, "Michael"));
        access.addToPlayList(new User(98.9, "George"));
    }
}