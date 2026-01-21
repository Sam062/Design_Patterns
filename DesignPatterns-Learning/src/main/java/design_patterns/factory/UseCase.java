package design_patterns.factory;

public class UseCase {
    public static void main(String[] args) {
        OperatingSystem os = OsFactory.getInstance("wind");

        os.spec();
    }
}
