package DecoratorPattern;

public class Border extends Decorator{

    int height;
    int width;

    public Border(LCD window, int height, int width) {
        super(window);
        this.height = height;
        this.width = width;
    }

    public void draw() {
        super.draw();
        System.out.println("Border.");
    }

    @Override
    public String toString() {
        return "Border{" +
                "height=" + height +
                ", width=" + width +
                ", window=" + window +
                '}';
    }
}
