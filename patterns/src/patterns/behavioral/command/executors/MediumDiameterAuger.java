package patterns.behavioral.command.executors;

import patterns.behavioral.command.IExecutor;

public class MediumDiameterAuger implements IExecutor {
    public int drill() {
        System.out.println("Medium diameter drill made hollow with depth = 3");
        return 3;
    }
}