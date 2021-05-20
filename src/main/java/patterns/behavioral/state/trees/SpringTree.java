package patterns.behavioral.state.trees;

import patterns.structural.facade.Color;

public class SpringTree extends Tree {
    public SpringTree() {
        countOfLeaves = 50;
        color = Color.ANSI_GREEN;
    }

    public void showSeason() {
        System.out.println("Spring tree is here!!! " + color + countOfLeaves +
                Color.ANSI_RESET);
    }
}