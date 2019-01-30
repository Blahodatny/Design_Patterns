package patterns.behavioral.strategy.strategies;

import patterns.behavioral.strategy.interfaces.CalculatingStrategy;

public class ProfitToCostRatio implements CalculatingStrategy {
    public double calculateEfficiency(double experience) {
        return experience / 6 + 78 - 34;
    }
}