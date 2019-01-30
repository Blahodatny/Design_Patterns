package patterns.behavioral.state;

import patterns.behavioral.state.trees.*;

class Season {
    public enum Name {WINTER, SPRING, SUMMER, AUTUMN}

    private Tree currentTree;

    private WinterTree winterTree = new WinterTree();
    private SpringTree springTree = new SpringTree();
    private SummerTree summerTree = new SummerTree();
    private AutumnTree autumnTree = new AutumnTree();

    Season() {
        currentTree = winterTree;
    }

    void setCurrentTree(Name name) {
        switch (name) {
            case AUTUMN:
                currentTree = autumnTree;
                break;

            case SPRING:
                currentTree = springTree;
                break;

            case SUMMER:
                currentTree = summerTree;
                break;

            case WINTER:
                currentTree = winterTree;
                break;
        }
    }

    void showSeason() {
        currentTree.showSeason();
    }
}