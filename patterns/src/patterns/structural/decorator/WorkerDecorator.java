package patterns.structural.decorator;

import patterns.structural.decorator.interfaces.IWorkerComponent;

public abstract class WorkerDecorator implements IWorkerComponent {

    protected IWorkerComponent worker;

    public WorkerDecorator(IWorkerComponent worker) {
        this.worker = worker;
    }

    public String makeOutLectures(int quantity, String day) {
        return worker.makeOutLectures(quantity, day);
    }

    public String makeOutExams(String day) {
        return worker.makeOutExams(day);
    }
}