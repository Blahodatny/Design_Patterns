package patterns.creational.abstract_factory.factories.out;

import patterns.creational.abstract_factory.IDocument;
import patterns.creational.abstract_factory.factories.IFirmFactory;
import patterns.creational.abstract_factory.order.BringOutOrder;
import patterns.creational.abstract_factory.permit.TemporaryPermit;

public class TemporaryBringOut implements IFirmFactory {

    public IDocument createOrder() {
        return new BringOutOrder();
    }

    public IDocument createPermit() {
        return new TemporaryPermit();
    }
}