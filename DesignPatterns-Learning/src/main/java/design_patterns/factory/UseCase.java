package design_patterns.factory;

import base.designPatterns.factory.OperatingSystem;
import base.designPatterns.factory.OsFactory;

public class UseCase {
    public static void main(String[] args) {
        OperatingSystem os = OsFactory.getInstance("wind");

        os.spec();
    }
}
