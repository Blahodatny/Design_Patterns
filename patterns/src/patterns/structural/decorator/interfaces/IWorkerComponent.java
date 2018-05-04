package patterns.structural.decorator.interfaces;

public interface IWorkerComponent {
    String makeOutLectures(int quantity, String day);

    String makeOutExams(String day);
}