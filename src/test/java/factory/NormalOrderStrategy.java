package factory;

import org.springframework.stereotype.Component;

@Component
class NormalOrderStrategy implements OrderStrategy{

    @Override
    public SimpleFactoryTest.OrderType type() {
        return SimpleFactoryTest.OrderType.NORMAL;
    }

    @Override
    public String create() {
        return SimpleFactoryTest.OrderType.NORMAL.name();
    }
}
