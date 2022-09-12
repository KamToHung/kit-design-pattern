package factory;

import org.springframework.stereotype.Component;

@Component
class PresaleOrderStrategy implements OrderStrategy{

    @Override
    public SimpleFactoryTest.OrderType type() {
        return SimpleFactoryTest.OrderType.PRESALE;
    }

    @Override
    public String create() {
        return SimpleFactoryTest.OrderType.PRESALE.name();
    }
}
