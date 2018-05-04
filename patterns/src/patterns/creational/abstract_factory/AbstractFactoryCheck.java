package patterns.creational.abstract_factory;

import patterns.creational.abstract_factory.app.Firm;
import patterns.creational.abstract_factory.factories.in.PermanentBringIn;
import patterns.creational.abstract_factory.factories.in.TemporaryBringIn;
import patterns.creational.abstract_factory.factories.out.DisposableBringOut;
import patterns.creational.abstract_factory.factories.out.PermanentBringOut;

public class AbstractFactoryCheck {
    public static void check() {
        new Firm(new PermanentBringOut()).showInfo();
        System.out.println("||||||");
        new Firm(new TemporaryBringIn()).showInfo();
        System.out.println("||||||");
        new Firm(new DisposableBringOut()).showInfo();
        System.out.println("||||||");
        new Firm(new PermanentBringIn()).showInfo();
        System.out.println("||||||");
    }
}