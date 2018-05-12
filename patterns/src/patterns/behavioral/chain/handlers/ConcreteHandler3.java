package patterns.behavioral.chain.handlers;

import patterns.behavioral.chain.HandlerBase;

import java.util.List;

public class ConcreteHandler3 extends HandlerBase {
    @Override
    public String check(List<String> tasks) {
        if (tasks.contains("Programming")) {
            tasks.removeIf(a -> a.equals("Programming"));
            return "I am " + ConcreteHandler3.class + ". And I'm checking the programming task!!!";
        } else {
            if (successor != null)
                return successor.check(tasks);
            else
                throw new NullPointerException("ChainOfResponsibility object exhausted all successors without call being handled.");
        }
    }
}