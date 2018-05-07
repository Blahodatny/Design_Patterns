package patterns.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayExample {
    public static void showExample() {
        try {
            URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;

            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}