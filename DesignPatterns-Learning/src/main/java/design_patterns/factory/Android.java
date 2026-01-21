package design_patterns.factory;

import base.designPatterns.factory.OperatingSystem;

public class Android implements OperatingSystem {
    @Override
    public void spec() {
        System.out.println("Android OS");
    }
}
