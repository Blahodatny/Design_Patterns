package patterns.behavioral.chain;

import patterns.behavioral.chain.handlers.ConcreteHandler1;
import patterns.behavioral.chain.handlers.ConcreteHandler2;
import patterns.behavioral.chain.handlers.ConcreteHandler3;

import java.util.ArrayList;

public class ChainOfResponsibilityCheck {
    public static void check() {
        HandlerBase chain = new ConcreteHandler3();
        HandlerBase more = new ConcreteHandler2();

        more.setSuccessor(chain);
        chain = new ConcreteHandler1();
        chain.setSuccessor(more);

        var exam = new ArrayList<String>();
        exam.add("Mathematics");
        exam.add("Physics");
        exam.add("Programming");

        var size = exam.size();
        for (var i = 0; i < size; i++)
            System.out.println(chain.check(exam));
    }
}