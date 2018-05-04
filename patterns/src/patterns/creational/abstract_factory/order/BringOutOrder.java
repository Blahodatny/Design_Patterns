package patterns.creational.abstract_factory.order;

import patterns.creational.abstract_factory.IDocument;

public class BringOutOrder implements IDocument {
    public String paperQuality() {
        return "middle";
    }

    public String protectionDegree() {
        return "55%";
    }

    public String cost() {
        return "25$";
    }
}