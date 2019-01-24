package patterns.behavioral.strategy;

import patterns.behavioral.strategy.interfaces.CalculatingStrategy;

class Quality {
    private CalculatingStrategy strategy;
    private double experience;

    void setStrategy(CalculatingStrategy strategy) {
        this.strategy = strategy;
    }

    void setExperience(double experience) {
        this.experience = experience;
    }

    double count() {
        return strategy.calculateEfficiency(experience);
    }
}