package design_patterns.abstractFactory;

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
