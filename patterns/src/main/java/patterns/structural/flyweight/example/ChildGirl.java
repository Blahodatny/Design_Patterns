package patterns.structural.flyweight.example;

import patterns.structural.facade.Color;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

class ChildGirl extends GreetingCard {
    ChildGirl() {
        this.age = 8;
        this.font = Color.ANSI_BLUE;
    }

    void display(String imageName) throws IOException {
        this.imageName = imageName;
        System.out.println("GreetingCard {" +
                "age=" + age +
                ", greeting=" + font +
                "You're welcome, " + age + "-aged person!!!" +
                Color.ANSI_RESET +
                ", image=" + this.imageName +
                '}');
        var f = new File("./data/" + imageName);
        var dt = Desktop.getDesktop();
        dt.open(f);
    }
}