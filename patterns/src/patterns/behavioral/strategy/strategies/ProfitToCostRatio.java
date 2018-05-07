package patterns.behavioral.strategy.strategies;

import patterns.behavioral.strategy.interfaces.ICalculatingStrategy;

public class ProfitToCostRatio implements ICalculatingStrategy {
    public double calculateEfficiency(double experience) {
        return experience / 6 + 78 - 34;
    }
}