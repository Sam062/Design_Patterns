package design_patterns.creational.abstractFactory.economy;

import design_patterns.creational.abstractFactory.AbstractFactory;
import design_patterns.creational.abstractFactory.Car;

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
