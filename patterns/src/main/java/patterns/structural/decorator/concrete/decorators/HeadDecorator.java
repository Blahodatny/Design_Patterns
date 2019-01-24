package patterns.structural.decorator.concrete.decorators;

import patterns.structural.decorator.WorkerDecorator;
import patterns.structural.decorator.interfaces.WorkerComponent;

public class HeadDecorator extends WorkerDecorator {
    private int workExperience;

    public HeadDecorator(WorkerComponent worker, int workExperience) {
        super(worker);
        this.workExperience = workExperience;
    }

    public String makeOutLectures(int quantity, String day) {
        return worker.makeOutLectures(quantity, day) + analyze();
    }

    public String makeOutExams(String day) {
        return worker.makeOutExams(day) + analyze();
    }

    private String analyze() {
        return "\nHis work experience is " + workExperience + " and he has analyzed them";
    }
}