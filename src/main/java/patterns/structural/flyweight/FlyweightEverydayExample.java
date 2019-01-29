package patterns.structural.flyweight;

public class FlyweightEverydayExample {
    public static void showExample() {
        System.out.println(System.identityHashCode(Integer.valueOf(5)));
        System.out.println(System.identityHashCode(Integer.valueOf(5)));
        System.out.println(System.identityHashCode(Integer.valueOf(10)));
    }
}