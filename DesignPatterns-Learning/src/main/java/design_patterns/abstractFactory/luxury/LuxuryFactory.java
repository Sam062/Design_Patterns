package design_patterns.abstractFactory;

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
