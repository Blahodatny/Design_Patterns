package patterns.creational.prototype;

import patterns.creational.prototype.student.Deanery;
import patterns.creational.prototype.student.Polyclinic;
import patterns.creational.prototype.student.Student;

import java.util.ArrayList;
import java.util.List;

import static patterns.creational.prototype.Clone.cloneAndCompare;

public class PrototypeCheck {
    public static void check() {
        List<Student> students = new ArrayList<>();
        List<Student> studentCopy = new ArrayList<>();

        var deanery = new Deanery();
        deanery.setAge(20);
        deanery.setName("George");
        deanery.setProgress(56);
        students.add(deanery);

        students.add(deanery.clone());

        var deanery2 = new Deanery();
        deanery.setProgress(100);
        students.add(deanery2);

        var polyclinic = new Polyclinic();
        polyclinic.setWeight(56.43);
        polyclinic.setHeight((float) 198.56);
        students.add(polyclinic);

        cloneAndCompare(students, studentCopy);
    }
}