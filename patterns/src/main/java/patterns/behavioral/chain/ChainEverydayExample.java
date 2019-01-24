package patterns.behavioral.chain;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainEverydayExample {
    private static final Logger logger = Logger.getLogger(ChainEverydayExample.class.getName());

    public static void showExample() {
        //level to log at
        logger.setLevel(Level.FINER);

        var handler = new ConsoleHandler();
        //level to publish at
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.finest("Finest level of logging"); //this one won't print
        logger.finer("Finer level, but not as fine as finest");
        logger.fine("Fine, but not as fine as finer or finest");
    }
}