package patterns.creational.prototype.student;

import java.util.Objects;

public abstract class Student {
    private int age;
    private String name;

    Student() {
    }

    Student(Student student) {
        if (student != null) {
            this.age = student.age;
            this.name = student.name;
        }
    }

    public abstract Student clone();

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}