package patterns.structural.decorator;

import patterns.structural.Helper;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DecoratorEverydayExample {
    public static void showExample() {
        var file = new Helper().getFile("output.txt");
        try {
            System.out.println(file.createNewFile());
            var oStream = new FileOutputStream(file);
            var doStream = new DataOutputStream(oStream);
            doStream.writeChars("text");
            doStream.close();
            oStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}