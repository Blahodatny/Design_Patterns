package patterns.behavioral.command;

import patterns.behavioral.command.executors.MediumDiameterAuger;
import patterns.behavioral.command.executors.SmallDiameterAuger;

import java.util.stream.IntStream;

public class CommandCheck {
    public static void check() {
        var medium = new MediumDiameterAuger();
        var small = new SmallDiameterAuger();

        var workers = new Worker[]{new Worker(), new Worker(), new Worker()};
        var drills = new Drill[]{new Drill(), new Drill(), new Drill()};

        workers[0].setExecutor(drills[0], medium);
        workers[1].setExecutor(drills[1], small);
        workers[2].setExecutor(drills[2], medium);

        IntStream.range(0, workers.length)
                .forEach(i -> workers[i].executeDrillByHimself(drills[i]));
    }
}