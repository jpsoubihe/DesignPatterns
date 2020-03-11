package ProxyPattern;

public class Main {

    public static void main(String args[]) {

        ProxyDog dog1 = new ProxyDog();

        dog1.walk();

        System.out.println(dog1.getStatus());

        ProxyDog dog2 = new ProxyDog();

        dog2.sleep();

        //the field status of Dog class is there to prove that the proxy refers to the original Dog entity;
        System.out.println(dog1.getStatus());


    }
}
