package patterns.behavioral;

import patterns.behavioral.chain.ChainEverydayExample;
import patterns.behavioral.chain.ChainOfResponsibilityCheck;
import patterns.behavioral.command.CommandCheck;
import patterns.behavioral.command.CommandEverydayExample;
import patterns.behavioral.state.StateCheck;
import patterns.behavioral.strategy.StrategyCheck;
import patterns.behavioral.strategy.StrategyEverydayExample;

import static patterns.Pattern.checkPattern;

class Main {
    public static void main(String[] args) {
        System.out.println("Strategy:");
        checkPattern(
                StrategyEverydayExample::showExample,
                StrategyCheck::check
        );

        System.out.println("State:");
        checkPattern(() -> { }, StateCheck::check);

        System.out.println("Chain of responsibility:");
        checkPattern(
                ChainEverydayExample::showExample,
                ChainOfResponsibilityCheck::check
        );

        System.out.println("Command:");
        checkPattern(CommandEverydayExample::showExample, CommandCheck::check);
    }
}