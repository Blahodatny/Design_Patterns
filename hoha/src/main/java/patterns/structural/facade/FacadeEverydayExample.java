package patterns.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayExample {
    public static void showExample() {
        try {
            new BufferedReader
                    (new InputStreamReader
                            (new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen")
                                    .openStream()))
                    .lines()
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}