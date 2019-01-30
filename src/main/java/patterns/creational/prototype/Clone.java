package patterns.creational.prototype;

import patterns.creational.prototype.student.Student;

import java.util.List;
import java.util.stream.IntStream;

class Clone {
    static void cloneAndCompare(List<Student> studentList, List<Student> studentCopy) {
        studentList.stream().map(Student::clone).forEach(studentCopy::add);

        IntStream.range(0, studentList.size()).forEach(i -> {
            if (studentList.get(i) != studentCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (studentList.get(i).equals(studentCopy.get(i)))
                    System.out.println(i + ": And they are identical (yay!)");
                else
                    System.out.println(i + ": But they are not identical (booo!)");
            } else
                System.out.println(i + ": Shape objects are the same (booo!)");
        });
    }
}