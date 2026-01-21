package base.designPatterns;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private static volatile Singleton instance;

    private Singleton() {
        if (instance != null)
            throw new RuntimeException("Plz use getInstance()");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Ensure same instance during deserialization
    protected Object readResolve() {
        return getInstance();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning not allowed!!");
    }

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
