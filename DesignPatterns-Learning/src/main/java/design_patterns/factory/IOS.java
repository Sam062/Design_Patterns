package design_patterns.factory;

import base.designPatterns.factory.OperatingSystem;

public class IOS implements OperatingSystem {

    @Override
    public void spec() {
        System.out.println("IOS OS");
    }
}
