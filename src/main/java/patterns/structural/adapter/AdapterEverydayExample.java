package patterns.structural.adapter;

import java.util.Arrays;

public class AdapterEverydayExample {
    public static void showExample() {
        var arrayOfInts = new Integer[]{43, 56, 45};
        var listOfInts = Arrays.asList(arrayOfInts);

        System.out.println("arrayOfInts: " + arrayOfInts);
        System.out.println("listOfInts: " + listOfInts);
    }
}