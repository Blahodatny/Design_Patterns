package patterns.behavioral.state.trees;

import patterns.structural.facade.Color;

public class AutumnTree extends Tree {
    public AutumnTree() {
        countOfLeaves = 50;
        color = Color.ANSI_YELLOW;
    }

    public void showSeason() {
        System.out.println(
                "Autumn tree!!! " + color + countOfLeaves + Color.ANSI_RESET);
    }
}