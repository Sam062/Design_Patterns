package design_patterns;

public class SingletonMultiThreaded {
    private static SingletonMultiThreaded instance = null;

    private SingletonMultiThreaded() {
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


    public static void main(String[] args) {
        SingletonMultiThreaded ins1 = SingletonMultiThreaded.getInstance();
        SingletonMultiThreaded ins2 = SingletonMultiThreaded.getInstance();

        System.out.println(ins1.hashCode());
        System.out.println(ins2.hashCode());
    }
}
