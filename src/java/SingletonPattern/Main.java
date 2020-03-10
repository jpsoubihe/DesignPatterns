package SingletonPattern;

public class Main {

    public static void main(String args[]){

        Singleton singleton1;
        Singleton singleton2;

        singleton1 = Singleton.getObject();
        singleton2 = Singleton.getObject();

        if(singleton1 == singleton2) {
            System.out.println("Both singleton objects represent the same instance.");
        }

        else {
            System.out.println("The singleton objects are different. ERROR!!!");
        }
    }
}
