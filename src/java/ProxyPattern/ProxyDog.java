package ProxyPattern;

public class ProxyDog implements Animal{
    private static Dog dog;

    public void walk() {
        System.out.println("Proxy Walking.");
        if(dog == null) {
            dog = new Dog();
        }
        dog.walk();
    }

    public void sleep() {

        System.out.println("Proxy Sleeping.");
        if(dog == null) {
            dog = new Dog();
        }
        dog.sleep();
    }

    public String getStatus() {
        return Dog.getStatus();
    }

}
