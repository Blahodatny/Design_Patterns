package patterns.structural.decorator.concrete.decorators;

import patterns.structural.decorator.WorkerDecorator;
import patterns.structural.decorator.interfaces.WorkerComponent;

public class LecturerDecorator extends WorkerDecorator {
    private final int speedOfReading;

    public LecturerDecorator(WorkerComponent worker, int speedOfReading) {
        super(worker);
        this.speedOfReading = speedOfReading;
    }

    public String makeOutLectures(int quantity, String day) {
        return worker.makeOutLectures(quantity, day) + read();
    }

    public String makeOutExams(String day) {
        return worker.makeOutExams(day) + conduct();
    }

    private String read() {
        return "\nHis speed of reading is " + speedOfReading +
                " and he has read them";
    }

    private String conduct() {
        return "\nHe has conducted them";
    }
}