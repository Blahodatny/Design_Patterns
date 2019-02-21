package patterns.creational.prototype;

import patterns.creational.prototype.student.Student;

import java.util.List;
import java.util.stream.IntStream;

class Clone {
    static void cloneAndCompare(List<Student> studentList, List<Student> studentCopy) {
        studentList.stream().map(Student::clone).forEach(studentCopy::add);
        IntStream.range(0, studentList.size()).forEach(i ->
                System.out.println(i + ": " +
                        (studentList.get(i) != studentCopy.get(i) ?
                                "Shapes are different objects (yay!)" :
                                "Shape objects are the same (booo!)") +
                        "\n" + i + ": " +
                        (studentList.get(i).equals(studentCopy.get(i)) ?
                                "And they are identical (yay!)" :
                                "But they are not identical (booo!)")
                )
        );
    }
}