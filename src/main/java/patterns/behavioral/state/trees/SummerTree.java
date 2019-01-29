package patterns.behavioral.state.trees;

import patterns.structural.facade.Color;

public class SummerTree extends Tree {
    public SummerTree() {
        countOfLeaves = 100;
        color = Color.ANSI_GREEN;
    }

    public void showSeason() {
        System.out.println("This is summer tree!!! " + color + countOfLeaves + Color.ANSI_RESET);
    }
}