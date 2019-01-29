package patterns.behavioral.chain.handlers;

import patterns.behavioral.chain.HandlerBase;

import java.util.List;

public class ConcreteHandler1 extends HandlerBase {
    public String check(List<String> tasks) {
        if (tasks.contains("Mathematics")) {
            tasks.removeIf(a -> a.equals("Mathematics"));
            return "I am " + ConcreteHandler1.class + ". And I'm checking the math task!!!";
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