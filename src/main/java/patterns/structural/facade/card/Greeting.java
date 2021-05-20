package patterns.structural.facade.card;

import patterns.structural.Helper;

import java.awt.Desktop;
import java.io.IOException;

public class Greeting {
    private final String font;
    private final String imageName;

    public Greeting(String font, String imageName) {
        this.font = font;
        this.imageName = imageName;
    }

    String getFont() { return font; }

    String getImageName() { return imageName; }

    public void showImage() throws IOException {
        var f = new Helper().getFile(imageName);
        var dt = Desktop.getDesktop();
        dt.open(f);
    }
}