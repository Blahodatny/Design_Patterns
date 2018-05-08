package patterns.structural.flyweight.example;


import patterns.structural.facade.Color;

import java.awt.*;
import java.io.File;
import java.io.IOException;

class TeenBoy extends GreetingCard {
    TeenBoy() {
        this.age = 13;
        this.font = Color.ANSI_YELLOW;
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
        var f = new File(System.getProperty("user.dir") + "/data/" + imageName);
        var dt = Desktop.getDesktop();
        dt.open(f);
    }
}