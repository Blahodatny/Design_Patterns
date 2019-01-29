package patterns.creational.abstract_factory.app;

import patterns.creational.abstract_factory.Document;
import patterns.creational.abstract_factory.factories.FirmFactory;

public class Firm {
    private Document permit;
    private Document order;

    public Firm(FirmFactory factory) {
        permit = factory.createPermit();
        order = factory.createOrder();
    }

    public void showInfo() {
        var permitClassName = permit.getClass().toString()
                .substring(permit.getClass().toString().lastIndexOf('.') + 1);
        var orderClassName = order.getClass().toString()
                .substring(order.getClass().toString().lastIndexOf('.') + 1);
        System.out.println(permitClassName +
                " has paper quality: " + permit.paperQuality() +
                "; protection degree: " + permit.protectionDegree() +
                "; cost: " + permit.cost() +
                ".\n" + orderClassName +
                " has paper quality: " + order.paperQuality() +
                "; protection degree: " + order.protectionDegree() +
                "; cost: " + order.cost());
    }
}