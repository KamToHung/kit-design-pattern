package factory;

import kit.design.pattern.factory.SimpleFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleFactoryTest {

    enum OrderType {
        NORMAL,
        PRESALE
    }

    @Test
    void factoryTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SimpleFactoryTest.class, NormalOrderStrategy.class, PresaleOrderStrategy.class, Configuration.class);
        context.refresh();
        SimpleFactory<OrderType, OrderStrategy> factory = context.getBean("orderStrategy", SimpleFactory.class);
        OrderStrategy strategy = factory.getStrategy(OrderType.NORMAL);
        Assertions.assertThat(strategy.create()).isEqualTo(OrderType.NORMAL.name());
    }
}
