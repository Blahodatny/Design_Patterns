package patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEverydayExample {
    public static void showExample() {
        Integer[] arrayOfInts = new Integer[]{43, 56, 45};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println("arrayOfInts: " + arrayOfInts);
        System.out.println("listOfInts: " + listOfInts);
    }
}