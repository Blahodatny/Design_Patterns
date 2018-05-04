package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.IDocument;

public interface IFirmFactory {
    IDocument createOrder();

    IDocument createPermit();
}