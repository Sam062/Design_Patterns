package dp.singleton;

public class SingletonDP {
    private static SingletonDP instance = null;

    private SingletonDP() {
    }


    public static SingletonDP getInstance() {
        if (instance == null) {
            synchronized (SingletonDP.class) {
                if (instance == null) {
                    instance = new SingletonDP();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        SingletonDP ins1 = SingletonDP.getInstance();
        SingletonDP ins2 = SingletonDP.getInstance();

        System.out.println(ins1.hashCode());
        System.out.println(ins2.hashCode());
    }
}
