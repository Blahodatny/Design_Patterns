package patterns.behavioral;

import patterns.behavioral.state.StateCheck;
import patterns.behavioral.strategy.StrategyCheck;
import patterns.behavioral.strategy.StrategyEverydayExample;

import static patterns.Pattern.checkPattern;

class Main {
    public static void main(String[] args) {
        System.out.println("Strategy:");
        checkPattern(StrategyEverydayExample::showExample, StrategyCheck::check);

        System.out.println("State:");
        checkPattern(() -> {
        }, StateCheck::check);
    }
}