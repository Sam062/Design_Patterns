package design_patterns.creational.factory;

public class OsFactory {
    private OsFactory() {
    }

    public static OperatingSystem getInstance(String instanceType) {
        return switch (instanceType) {
            case "IOS" -> new IOS();
            case "Android" -> new Android();
            default -> throw new RuntimeException("OS not supported");
        };
    }
}
