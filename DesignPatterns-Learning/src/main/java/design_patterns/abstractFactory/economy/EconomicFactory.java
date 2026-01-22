package design_patterns.abstractFactory.economy;

import design_patterns.abstractFactory.AbstractFactory;
import design_patterns.abstractFactory.Car;

public class EconomicFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        return switch (price) {
            case 10 -> new EconomicCar1();
            case 20 -> new EconomicCar2();
            default -> null;
        };
    }
}
