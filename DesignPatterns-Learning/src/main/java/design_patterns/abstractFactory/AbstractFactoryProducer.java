package design_patterns.abstractFactory;

import design_patterns.abstractFactory.economy.EconomicFactory;
import design_patterns.abstractFactory.luxury.LuxuryFactory;

public class AbstractFactoryProducer {
    public AbstractFactory getFactoryInstance(String value) {
        return switch (value) {
            case "ECO" -> new EconomicFactory();
            case "LUXURY" -> new LuxuryFactory();
            default -> null;
        };
    }
}
