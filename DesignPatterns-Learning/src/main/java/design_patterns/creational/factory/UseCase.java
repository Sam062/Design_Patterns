package design_patterns.creational.factory;

public class UseCase {
    public static void main(String[] args) {
        OperatingSystem os = OsFactory.getInstance("wind");

        os.spec();
    }
}
