package AdapterPattern;

import AdapterPattern.models.Rectangle;
import AdapterPattern.models.Triangle;

public class CalculatorAdapter {

    public static int getArea(Triangle triangle) {
        Rectangle rectangle = new Rectangle(triangle.getBase()/2,triangle.getHeight());
        return Calculator.getArea(rectangle);
    }
}
