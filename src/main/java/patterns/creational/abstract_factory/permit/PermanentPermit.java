package patterns.creational.abstract_factory.permit;

import patterns.creational.abstract_factory.Document;

public class PermanentPermit implements Document {

    public String paperQuality() { return "high"; }

    public String protectionDegree() { return "68%"; }

    public String cost() { return "100$"; }
}