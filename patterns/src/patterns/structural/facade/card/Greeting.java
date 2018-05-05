package patterns.structural.facade.card;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Greeting {
    private String font;
    private String imageName;

    public Greeting(String font, String imageName) {
        this.font = font;
        this.imageName = imageName;
    }

    String getFont() {
        return font;
    }

    String getImageName() {
        return imageName;
    }

    public void showImage() throws IOException {
        File f = new File(System.getProperty("user.dir") + "/data/" + imageName);
        Desktop dt = Desktop.getDesktop();
        dt.open(f);
    }
}