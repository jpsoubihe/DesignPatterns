package AdapterPattern;

import AdapterPattern.models.Rectangle;
import AdapterPattern.models.Triangle;

import static AdapterPattern.CalculatorAdapter.getArea;

public class Main {

    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle(4,4);
        Triangle triangle = new Triangle(4,4);

        System.out.println("rectangle area = " + Calculator.getArea(rectangle));
        System.out.println("triangle area = " + CalculatorAdapter.getArea(triangle));

    }

}
