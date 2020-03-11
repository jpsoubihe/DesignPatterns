package DecoratorPattern;

public class Main {

    public static void main(String args[]) {

        LCD border = new Border(new Window(),2,6);

        System.out.println(border);


    }
}
