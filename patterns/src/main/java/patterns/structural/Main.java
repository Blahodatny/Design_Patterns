package patterns.structural;

import patterns.structural.adapter.AdapterCheck;
import patterns.structural.adapter.AdapterEverydayExample;
import patterns.structural.bridge.BridgeCheck;
import patterns.structural.bridge.BridgeEverydayExample;
import patterns.structural.composite.CompositeCheck;
import patterns.structural.composite.CompositeEverydayExample;
import patterns.structural.decorator.DecoratorCheck;
import patterns.structural.decorator.DecoratorEverydayExample;
import patterns.structural.facade.FacadeCheck;
import patterns.structural.facade.FacadeEverydayExample;
import patterns.structural.flyweight.FlyweightCheck;
import patterns.structural.flyweight.FlyweightEverydayExample;
import patterns.structural.proxy.ProxyCheck;
import patterns.structural.proxy.ProxyEverydayExample;

import static patterns.Pattern.checkPattern;

class Main {
    public static void main(String[] args) {
        System.out.println("Adapter:");
        checkPattern(AdapterEverydayExample::showExample, AdapterCheck::check);

        System.out.println("Bridge:");
        checkPattern(BridgeEverydayExample::showExample, BridgeCheck::check);

        System.out.println("Decorator:");
        checkPattern(DecoratorEverydayExample::showExample, DecoratorCheck::check);

        System.out.println("Composite:");
        checkPattern(CompositeEverydayExample::showExample, CompositeCheck::check);

        System.out.println("Facade:");
        checkPattern(FacadeEverydayExample::showExample, FacadeCheck::check);

        System.out.println("Flyweight:");
        checkPattern(FlyweightEverydayExample::showExample, FlyweightCheck::check);

        System.out.println("Proxy:");
//        checkPattern(ProxyEverydayExample::showExample, ProxyCheck::check);
        checkPattern(() -> {
        }, ProxyCheck::check);
    }
}