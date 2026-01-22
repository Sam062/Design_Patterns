package design_patterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryProducer factoryProducer = new AbstractFactoryProducer();
        AbstractFactory luxuryFactory = factoryProducer.getFactoryInstance("LUXURY");
        Car car1 = luxuryFactory.getInstance(50);
        Car car2 = luxuryFactory.getInstance(70);
        System.out.println(car1.getTopSpeed());
        System.out.println(car2.getTopSpeed());

        AbstractFactory ecoFactory = factoryProducer.getFactoryInstance("ECO");
        Car car3 = ecoFactory.getInstance(10);
        Car car4 = ecoFactory.getInstance(20);
        System.out.println(car3.getTopSpeed());
        System.out.println(car4.getTopSpeed());
    }
}
