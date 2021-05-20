package patterns.behavioral.state.trees;

import patterns.structural.facade.Color;

public class WinterTree extends Tree {
    public WinterTree() {
        countOfLeaves = 0;
        color = Color.ANSI_RESET;
    }

    public void showSeason() {
        System.out.println("This is winter tree!!! " + color + countOfLeaves +
                Color.ANSI_RESET);
    }
}