package patterns.creational.singleton;

public class SingletonEverydayExample {
    public static void showExample() {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);
        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);
        if (singletonRuntime == anotherInstance)
            System.out.println("They are the same instance");
    }
}