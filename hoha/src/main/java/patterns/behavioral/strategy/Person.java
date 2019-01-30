package patterns.behavioral.strategy;

public class Person {

    private int age;
    private String name;
    private String phoneNumber;

    Person(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}