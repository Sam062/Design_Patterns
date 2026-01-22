package design_patterns.abstractFactory.luxury;

import design_patterns.abstractFactory.AbstractFactory;
import design_patterns.abstractFactory.Car;

public class LuxuryFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        return switch (price) {
            case 50 -> new LuxuryCar1();
            case 70 -> new LuxuryCar2();
            default -> null;
        };
    }
}
