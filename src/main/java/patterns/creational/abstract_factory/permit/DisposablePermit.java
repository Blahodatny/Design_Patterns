package patterns.creational.abstract_factory.permit;

import patterns.creational.abstract_factory.Document;

public class DisposablePermit implements Document {

    public String paperQuality() { return "very low"; }

    public String protectionDegree() { return "2%"; }

    public String cost() { return "12$"; }
}