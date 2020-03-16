package AdapterPattern;

import AdapterPattern.models.Rectangle;

public class Calculator {

    public static int getArea(Rectangle rectangle) {
        return rectangle.getWidth()* rectangle.getHeight();
    }
}
