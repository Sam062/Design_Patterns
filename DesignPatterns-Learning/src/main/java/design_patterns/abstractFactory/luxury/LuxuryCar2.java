package design_patterns.abstractFactory.luxury;

import design_patterns.abstractFactory.Car;

public class LuxuryCar2 implements Car {
    @Override
    public int getTopSpeed() {
        return 300;
    }
}
