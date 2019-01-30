package patterns.creational.singleton;

import patterns.creational.singleton.simple_singleton.SimpleSingleton;
import patterns.creational.singleton.thread_safe_singleton.SafeSingleton;

public class SingletonCheck {
    public static void check() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n" +
                "RESULT:" + "\n");

        new Thread(new ThreadFoo()).start();
        new Thread(new ThreadBar()).start();
    }

    static class ThreadFoo implements Runnable {
        public void run() {
            System.out.println("1) Simple singleton: " + (SimpleSingleton.getInstance("FOO")).value);
            SafeSingleton.getInstance("FOO");
            System.out.println("1) Safe singleton: " + SafeSingleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        public void run() {
            System.out.println("2) Simple singleton: " + (SimpleSingleton.getInstance("BAR")).value);
            SafeSingleton.getInstance("BAR");
            System.out.println("2) Safe singleton: " + SafeSingleton.value);
        }
    }
}