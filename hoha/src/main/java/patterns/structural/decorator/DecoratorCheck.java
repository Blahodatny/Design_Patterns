package patterns.structural.decorator;

import patterns.structural.decorator.concrete.decorators.HeadDecorator;
import patterns.structural.decorator.concrete.decorators.LecturerDecorator;

public class DecoratorCheck {
    public static void check() {
        var worker = new LecturerDecorator(new HeadDecorator(new WorkerConcreteComponent(
                "Sam", "Smith", "FPM"), 56), 60);
        System.out.println(worker.makeOutLectures(3, "Monday"));
    }
}