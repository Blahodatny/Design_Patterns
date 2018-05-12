package patterns.behavioral.chain;

import java.util.List;

public abstract class HandlerBase {
    protected HandlerBase successor;

    void setSuccessor(HandlerBase successor) {
        this.successor = successor;
    }

    abstract public String check(List<String> tasks);
}