package patterns.behavioral.state;

import patterns.behavioral.state.trees.*;

class Season {
    public enum Name {WINTER, SPRING, SUMMER, AUTUMN}

    private Tree currentTree;

    private final WinterTree winterTree = new WinterTree();
    private final SpringTree springTree = new SpringTree();
    private final SummerTree summerTree = new SummerTree();
    private final AutumnTree autumnTree = new AutumnTree();

    Season() { currentTree = winterTree; }

    void setCurrentTree(Name name) {
        switch (name) {
            case AUTUMN -> currentTree = autumnTree;
            case SPRING -> currentTree = springTree;
            case SUMMER -> currentTree = summerTree;
            case WINTER -> currentTree = winterTree;
        }
    }

    void showSeason() { currentTree.showSeason(); }
}