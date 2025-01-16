package design_patterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMultiThreaded {
    private static SingletonMultiThreaded instance = null;

    private SingletonMultiThreaded() {
        if (instance != null) throw new RuntimeException("Object creation not allowed");
    }


    public static SingletonMultiThreaded getInstance() {
        if (instance == null) {
            synchronized (SingletonMultiThreaded.class) {
                if (instance == null) {
                    instance = new SingletonMultiThreaded();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        SingletonMultiThreaded ins1 = SingletonMultiThreaded.getInstance();
        SingletonMultiThreaded ins2 = SingletonMultiThreaded.getInstance();

        System.out.println(ins1.hashCode());
        System.out.println(ins2.hashCode());


//        Using Reflection Approach
        Class<SingletonMultiThreaded> clazz = SingletonMultiThreaded.class;
        Constructor<SingletonMultiThreaded> declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        SingletonMultiThreaded o = (SingletonMultiThreaded) declaredConstructor.newInstance();
        System.out.println(o.hashCode());
    }
}
