package patterns.creational.singleton.thread_safe_singleton;

public final class SafeSingleton {
    private static volatile SafeSingleton instance;
    public static String value;

    private SafeSingleton(String value) {
        SafeSingleton.value = value;
    }

    public static void getInstance(String value) {
        if (instance == null)
            synchronized (SafeSingleton.class) {
                if (instance == null)
                    instance = new SafeSingleton(value);
            }
    }
}