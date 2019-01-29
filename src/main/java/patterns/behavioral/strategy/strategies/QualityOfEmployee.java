package patterns.behavioral.strategy.strategies;

import patterns.behavioral.strategy.interfaces.CalculatingStrategy;

public class QualityOfEmployee implements CalculatingStrategy {
    public double calculateEfficiency(double experience) {
        return experience * 5;
    }
}