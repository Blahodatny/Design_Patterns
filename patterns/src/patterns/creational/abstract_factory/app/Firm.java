package patterns.creational.abstract_factory.app;

import patterns.creational.abstract_factory.IDocument;
import patterns.creational.abstract_factory.factories.IFirmFactory;

public class Firm {
    private IDocument permit;
    private IDocument order;

    public Firm(IFirmFactory factory) {
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