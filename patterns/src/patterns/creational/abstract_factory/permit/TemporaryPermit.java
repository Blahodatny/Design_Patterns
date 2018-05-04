package patterns.creational.abstract_factory.permit;

import patterns.creational.abstract_factory.IDocument;

public class TemporaryPermit implements IDocument {

    public String paperQuality() {
        return "very high";
    }

    public String protectionDegree() {
        return "80%";
    }

    public String cost() {
        return "200$";
    }
}