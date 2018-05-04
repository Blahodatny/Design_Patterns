package patterns.structural.facade.card;

import patterns.structural.facade.Color;

public class GreetingCard {
    private int age;
    private Greeting greeting;

    public GreetingCard(int age) {
        this.age = age;
    }

    public Greeting getGreeting() {
        return greeting;
    }

    void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    public String toString() {
        return "GreetingCard {" +
                "age=" + age +
                ", greeting=" + greeting.getFont() +
                "You're welcome, " + age + "-aged person!!!" +
                Color.ANSI_RESET +
                ", image=" + greeting.getImageName() +
                '}';
    }
}