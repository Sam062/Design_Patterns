package design_patterns.creational.abstractFactory.economy;

import design_patterns.creational.abstractFactory.Car;

public class EconomicCar1 implements Car {
    @Override
    public int getTopSpeed() {
        return 80;
    }
}
