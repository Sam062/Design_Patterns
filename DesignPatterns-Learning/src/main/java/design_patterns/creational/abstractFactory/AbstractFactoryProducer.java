package design_patterns.creational.abstractFactory;

import design_patterns.creational.abstractFactory.economy.EconomicFactory;
import design_patterns.creational.abstractFactory.luxury.LuxuryFactory;

public class AbstractFactoryProducer {
    public AbstractFactory getFactoryInstance(String value) {
        return switch (value) {
            case "ECO" -> new EconomicFactory();
            case "LUXURY" -> new LuxuryFactory();
            default -> null;
        };
    }
}
