package patterns.behavioral.command.executors;

import patterns.behavioral.command.Executor;

public class MediumDiameterAuger implements Executor {
    public int drill() {
        System.out.println("Medium diameter drill made hollow with depth = 3");
        return 3;
    }
}