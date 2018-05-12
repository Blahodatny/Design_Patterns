package patterns.behavioral.command.executors;

import patterns.behavioral.command.IExecutor;

public class SmallDiameterAuger implements IExecutor {
    public int drill() {
        System.out.println("Medium diameter drill made hollow with depth = 1");
        return 2;
    }
}