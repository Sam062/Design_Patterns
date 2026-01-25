package design_patterns.creational.abstractFactory.luxury;

import design_patterns.creational.abstractFactory.AbstractFactory;
import design_patterns.creational.abstractFactory.Car;

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
