package patterns.structural.decorator.interfaces;

public interface WorkerComponent {
    String makeOutLectures(int quantity, String day);

    String makeOutExams(String day);
}