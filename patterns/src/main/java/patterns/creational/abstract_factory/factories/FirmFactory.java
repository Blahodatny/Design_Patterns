package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.Document;

public interface FirmFactory {
    Document createOrder();

    Document createPermit();
}