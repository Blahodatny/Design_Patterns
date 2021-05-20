package patterns.structural.decorator;

import patterns.structural.decorator.interfaces.WorkerComponent;

public abstract class WorkerDecorator implements WorkerComponent {

    protected WorkerComponent worker;

    public WorkerDecorator(WorkerComponent worker) { this.worker = worker; }

    public String makeOutLectures(int quantity, String day) {
        return worker.makeOutLectures(quantity, day);
    }

    public String makeOutExams(String day) { return worker.makeOutExams(day); }
}