package DecoratorPattern;

public class Window implements LCD {
    public void draw() {
        System.out.println("Window with vertical scrollbar is drawing");
    }
}