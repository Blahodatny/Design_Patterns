package patterns.behavioral.command;

public class CommandEverydayExample {
    public static void showExample() {
        var task1 = new Task(10, 12); //encapsulates request
        var task2 = new Task(11, 13);

        var thread1 = new Thread(task1);
        thread1.start(); //invoker

        var thread2 = new Thread(task2);
        thread2.start();
    }
}

class Task implements Runnable {
    private final int num1;
    private final int num2;

    Task(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run() { System.out.println(num1 * num2); }
}