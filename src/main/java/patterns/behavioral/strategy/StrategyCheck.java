package patterns.behavioral.strategy;

import patterns.behavioral.strategy.strategies.ProfitToCostRatio;
import patterns.behavioral.strategy.strategies.QualityOfEmployee;

public class StrategyCheck {
    public static void check() {
        var quality = new Quality();
        quality.setExperience(34.76);

        quality.setStrategy(new QualityOfEmployee());
        System.out.println(quality.count());
        quality.setStrategy(new ProfitToCostRatio());

        System.out.println(quality.count());
    }
}