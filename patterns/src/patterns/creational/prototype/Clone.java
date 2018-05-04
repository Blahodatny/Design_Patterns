package patterns.creational.prototype;

import patterns.creational.prototype.student.Student;

import java.util.List;

class Clone {
    static void cloneAndCompare(List<Student> studentList, List<Student> studentCopy) {
        for (Student student : studentList)
            studentCopy.add(student.clone());

        for (int i = 0; i < studentList.size(); i++)
            if (studentList.get(i) != studentCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (studentList.get(i).equals(studentCopy.get(i)))
                    System.out.println(i + ": And they are identical (yay!)");
                else
                    System.out.println(i + ": But they are not identical (booo!)");
            } else
                System.out.println(i + ": Shape objects are the same (booo!)");
    }
}