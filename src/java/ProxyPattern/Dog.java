package ProxyPattern;

public class Dog implements Animal {
    private static String status = "up";

    public static String getStatus() {
        return status;
    }

    public void walk() {
        System.out.println("Walking.");
        status = "up";
    }

    public void sleep() {
        System.out.println("Sleeping.");
        status = "down";
    }
}
