package patterns.structural.decorator;

import patterns.structural.decorator.interfaces.IWorkerComponent;

public class WorkerConcreteComponent implements IWorkerComponent {
    private String name;
    private String familyName;
    private String faculty;

    WorkerConcreteComponent(String name, String familyName, String faculty) {
        this.name = name;
        this.familyName = familyName;
        this.faculty = faculty;
    }

    public String makeOutLectures(int quantity, String day) {
        return name + " " + familyName +
                " from faculty " + faculty + " has made out of " + quantity + " lecture(s) at " + day;
    }

    public String makeOutExams(String day) {
        return name + " " + familyName +
                " from faculty " + faculty + " has made out of exam(s) at " + day;
    }
}