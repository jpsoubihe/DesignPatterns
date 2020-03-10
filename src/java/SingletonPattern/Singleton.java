package SingletonPattern;

public class Singleton {

    private static Singleton singletonInstance;

    private Singleton() {}

    public static synchronized Singleton getObject() {
        if(singletonInstance == null) {
            System.out.println("You doesn't have created a singleton instance yet!");
            singletonInstance = new Singleton();
        }

        else {
            System.out.println("You have already created a singleton instance.");
        }
        return singletonInstance;
    }
}
