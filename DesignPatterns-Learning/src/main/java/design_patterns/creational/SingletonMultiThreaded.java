package design_patterns.creational;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMultiThreaded implements Serializable {
    private static SingletonMultiThreaded instance = null;

    private SingletonMultiThreaded() {
        /*Uncomment below code block to test to restrict object creation using Reflection API*/
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

    /*to fix serialization break.
    whenever de-serialization happens, readResolve() is internally called.*/
    protected Object readResolve() {
        return instance;
    }

    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        SingletonMultiThreaded ins1 = SingletonMultiThreaded.getInstance();
        SingletonMultiThreaded ins2 = SingletonMultiThreaded.getInstance();

        System.out.println(ins1.hashCode());
        System.out.println(ins2.hashCode());


        /*Using Reflection Approach
         * Comment out the constructor code block to test
         * */
        Class<SingletonMultiThreaded> clazz = SingletonMultiThreaded.class;
        Constructor<SingletonMultiThreaded> declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        SingletonMultiThreaded o = declaredConstructor.newInstance();
        System.out.println(o.hashCode());


        /*Serialization case breaks the pattern hence we need to add readResolve() impl because while de-serializing
        internally it calls readResolve()*/

        /*Without Serialization fix-- Comment readResolve()
         * if we comment out the readResolve() impl then it will provide a new object which breaks the Singleton object creation rule
         * */
        SingletonMultiThreaded obj1 = SingletonMultiThreaded.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Object.txt"));
        oos.writeObject(obj1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.txt"));
        SingletonMultiThreaded obj2 = (SingletonMultiThreaded) ois.readObject();
        ois.close();

        System.out.println("--- Serialization Problem Objects ---");
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
