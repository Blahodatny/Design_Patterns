package patterns;

public class Pattern {
    public static void checkPattern(Runnable first, Runnable second) {
        first.run();
        System.out.println("--------------------------------------------");
        second.run();
        System.out.println("--------------------------------------------\n");
    }
}