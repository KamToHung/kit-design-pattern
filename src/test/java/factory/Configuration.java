package factory;

import kit.design.pattern.factory.SimpleFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    @Qualifier("orderStrategy")
    public SimpleFactory<SimpleFactoryTest.OrderType, OrderStrategy> orderStrategy() {
        return new SimpleFactory<>(OrderStrategy.class);
    }

}
