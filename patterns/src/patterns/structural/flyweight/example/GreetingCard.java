package patterns.structural.flyweight.example;

import java.io.IOException;

abstract class GreetingCard {
    int age;
    String font;
    String imageName;

    abstract void display(String imageName) throws IOException;
}