package patterns.creational.abstract_factory.factories.in;

import patterns.creational.abstract_factory.Document;
import patterns.creational.abstract_factory.factories.FirmFactory;
import patterns.creational.abstract_factory.order.BringInOrder;
import patterns.creational.abstract_factory.permit.TemporaryPermit;

public class TemporaryBringIn implements FirmFactory {

    public Document createOrder() { return new BringInOrder(); }

    public Document createPermit() { return new TemporaryPermit(); }
}