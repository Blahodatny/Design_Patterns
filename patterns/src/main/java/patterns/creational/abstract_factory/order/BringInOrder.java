package patterns.creational.abstract_factory.order;

import patterns.creational.abstract_factory.Document;

public class BringInOrder implements Document {
    public String paperQuality() {
        return "low";
    }

    public String protectionDegree() {
        return "45%";
    }

    public String cost() {
        return "30$";
    }
}