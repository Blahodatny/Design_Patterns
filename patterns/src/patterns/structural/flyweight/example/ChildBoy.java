package patterns.structural.flyweight.example;

import patterns.structural.facade.Color;

import java.awt.*;
import java.io.File;
import java.io.IOException;

class ChildBoy extends GreetingCard {
    ChildBoy() {
        this.age = 7;
        this.font = Color.ANSI_PURPLE;
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
        File f = new File(System.getProperty("user.dir") + "/data/" + imageName);
        Desktop dt = Desktop.getDesktop();
        dt.open(f);
    }
}
