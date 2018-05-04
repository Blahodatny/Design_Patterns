package patterns.creational;

import patterns.creational.abstract_factory.AbstractFactoryCheck;
import patterns.creational.abstract_factory.AbstractFactoryExample;
import patterns.creational.builder.BuilderCheck;
import patterns.creational.builder.BuilderEverydayExample;
import patterns.creational.factory_method.FactoryMethodCheck;
import patterns.creational.prototype.PrototypeCheck;
import patterns.creational.singleton.SingletonCheck;
import patterns.creational.singleton.SingletonEverydayExample;

import static patterns.Pattern.checkPattern;

class Main {
    public static void main(String[] args) {
        System.out.println("Singleton:");
        checkPattern(SingletonEverydayExample::showExample, SingletonCheck::check);

        System.out.println("Prototype:");
        checkPattern(() -> {
        }, PrototypeCheck::check);

        System.out.println("Builder:");
        checkPattern(BuilderEverydayExample::showExample, BuilderCheck::check);

        System.out.println("Abstract factory:");
        checkPattern(AbstractFactoryExample::showExample, AbstractFactoryCheck::check);

        System.out.println("Factory method:");
        checkPattern(() -> {
        }, FactoryMethodCheck::check);
    }
}