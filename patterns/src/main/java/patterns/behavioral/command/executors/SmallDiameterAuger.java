package patterns.behavioral.command.executors;

import patterns.behavioral.command.Executor;

public class SmallDiameterAuger implements Executor {
    public int drill() {
        System.out.println("Medium diameter drill made hollow with depth = 1");
        return 2;
    }
}