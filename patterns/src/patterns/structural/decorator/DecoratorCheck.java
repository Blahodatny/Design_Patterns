package patterns.structural.decorator;

import patterns.structural.decorator.concrete.decorators.HeadDecorator;
import patterns.structural.decorator.concrete.decorators.LecturerDecorator;
import patterns.structural.decorator.interfaces.IWorkerComponent;

public class DecoratorCheck {
    public static void check() {
        IWorkerComponent worker = new LecturerDecorator(new HeadDecorator(new WorkerConcreteComponent(
                "Sam", "Smith", "FPM"), 56), 60);
        System.out.println(worker.makeOutLectures(3, "Monday"));
    }
}