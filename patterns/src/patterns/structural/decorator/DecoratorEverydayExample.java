package patterns.structural.decorator;

import java.io.*;

public class DecoratorEverydayExample {
    public static void showExample() {
        File file = new File("./data/output.txt");
        try {
            System.out.println(file.createNewFile());
            OutputStream oStream = new FileOutputStream(file);
            DataOutputStream doStream = new DataOutputStream(oStream);
            doStream.writeChars("text");
            doStream.close();
            oStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}