package factory;

import kit.design.pattern.factory.Strategy;

public interface OrderStrategy extends Strategy<SimpleFactoryTest.OrderType> {

    String create();
}
