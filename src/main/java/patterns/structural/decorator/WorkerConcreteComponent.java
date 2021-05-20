package patterns.structural.decorator;

import patterns.structural.decorator.interfaces.WorkerComponent;

public class WorkerConcreteComponent implements WorkerComponent {
    private final String name;
    private final String familyName;
    private final String faculty;

    WorkerConcreteComponent(String name, String familyName, String faculty) {
        this.name = name;
        this.familyName = familyName;
        this.faculty = faculty;
    }

    public String makeOutLectures(int quantity, String day) {
        return name + " " + familyName +
                " from faculty " + faculty + " has made out of " + quantity +
                " lecture(s) at " + day;
    }

    public String makeOutExams(String day) {
        return name + " " + familyName +
                " from faculty " + faculty + " has made out of exam(s) at " +
                day;
    }
}