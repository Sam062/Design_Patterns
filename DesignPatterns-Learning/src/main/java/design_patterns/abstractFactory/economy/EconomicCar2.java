package design_patterns.abstractFactory.economy;

import design_patterns.abstractFactory.Car;

public class EconomicCar2 implements Car {
    @Override
    public int getTopSpeed() {
        return 100;
    }
}
