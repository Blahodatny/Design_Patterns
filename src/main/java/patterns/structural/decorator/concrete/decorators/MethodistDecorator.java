package patterns.structural.decorator.concrete.decorators;

import patterns.structural.decorator.WorkerDecorator;
import patterns.structural.decorator.interfaces.WorkerComponent;

public class MethodistDecorator extends WorkerDecorator {
    private double attention;

    public MethodistDecorator(WorkerComponent worker, double attention) {
        super(worker);
        this.attention = attention;
    }

    public String makeOutLectures(int quantity, String day) {
        return worker.makeOutLectures(quantity, day) + help();
    }

    public String makeOutExams(String day) {
        return worker.makeOutExams(day) + help();
    }

    private String help() {
        return "\nHis attention is " + attention + " and he has assisted to lecturer";
    }
}