package patterns.behavioral.chain.handlers;

import patterns.behavioral.chain.HandlerBase;

import java.util.List;

public class ConcreteHandler2 extends HandlerBase {
    public String check(List<String> tasks) {
        if (tasks.contains("Physics")) {
            tasks.removeIf(a -> a.equals("Physics"));
            return "I am " + ConcreteHandler2.class + ". And I'm checking the physics task!!!";
        } else {
            if (successor != null)
                return successor.check(tasks);
            else
                throw new NullPointerException(
                        "ChainOfResponsibility object exhausted all successors without call being handled."
                );
        }
    }
}