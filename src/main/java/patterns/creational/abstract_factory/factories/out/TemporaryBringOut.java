package patterns.creational.abstract_factory.factories.out;

import patterns.creational.abstract_factory.Document;
import patterns.creational.abstract_factory.factories.FirmFactory;
import patterns.creational.abstract_factory.order.BringOutOrder;
import patterns.creational.abstract_factory.permit.TemporaryPermit;

public class TemporaryBringOut implements FirmFactory {

    public Document createOrder() { return new BringOutOrder(); }

    public Document createPermit() { return new TemporaryPermit(); }
}