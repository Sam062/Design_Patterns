package design_patterns.factory;

import base.designPatterns.factory.OperatingSystem;

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
