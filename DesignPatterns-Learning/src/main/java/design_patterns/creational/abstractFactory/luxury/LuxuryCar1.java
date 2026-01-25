package design_patterns.creational.abstractFactory.luxury;

import design_patterns.creational.abstractFactory.Car;

public class LuxuryCar1 implements Car {
    @Override
    public int getTopSpeed() {
        return 200;
    }
}
