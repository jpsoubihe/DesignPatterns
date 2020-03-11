package DecoratorPattern;

public class Decorator implements LCD {
    LCD window;

    public Decorator(LCD window) {
        this.window = window;
    }

    public void draw() {
        System.out.println("Decorator drawing...");
    }

    @Override
    public String toString() {
        return "Decorator{" +
                "window=" + window +
                '}';
    }
}
