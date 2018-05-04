package patterns.creational.abstract_factory.permit;

import patterns.creational.abstract_factory.IDocument;

public class DisposablePermit implements IDocument {

    public String paperQuality() {
        return "very low";
    }

    public String protectionDegree() {
        return "2%";
    }

    public String cost() {
        return "12$";
    }
}