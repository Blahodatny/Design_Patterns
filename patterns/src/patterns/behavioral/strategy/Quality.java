package patterns.behavioral.strategy;

import patterns.behavioral.strategy.interfaces.ICalculatingStrategy;

class Quality {
    private ICalculatingStrategy strategy;
    private double experience;

    void setStrategy(ICalculatingStrategy strategy) {
        this.strategy = strategy;
    }

    void setExperience(double experience) {
        this.experience = experience;
    }

    double count() {
        return strategy.calculateEfficiency(experience);
    }
}