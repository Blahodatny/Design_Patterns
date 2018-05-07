package patterns.behavioral.strategy.strategies;

import patterns.behavioral.strategy.interfaces.ICalculatingStrategy;

public class QualityOfEmployee implements ICalculatingStrategy {
    public double calculateEfficiency(double experience) {
        return experience * 5;
    }
}