package patterns.creational.singleton.simple_singleton;

public final class SimpleSingleton {
    private static SimpleSingleton instance;
    public String value;

    private SimpleSingleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SimpleSingleton getInstance(String value) {
        if (instance == null)
            instance = new SimpleSingleton(value);
        return instance;
    }
}