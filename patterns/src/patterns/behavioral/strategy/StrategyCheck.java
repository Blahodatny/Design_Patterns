package patterns.behavioral.strategy;

import patterns.behavioral.strategy.strategies.ProfitToCostRatio;
import patterns.behavioral.strategy.strategies.QualityOfEmployee;

public class StrategyCheck {
    public static void check() {
        Quality quality = new Quality();
        quality.setExperience(34.76);

        QualityOfEmployee qualityOfEmployee = new QualityOfEmployee();
        ProfitToCostRatio profitToCostRatio = new ProfitToCostRatio();

        quality.setStrategy(qualityOfEmployee);
        System.out.println(quality.count());
        quality.setStrategy(profitToCostRatio);

        System.out.println(quality.count());
    }
}
