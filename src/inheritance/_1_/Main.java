package inheritance._1_;

public class Main {

    public static void main(String[] args) {

        Square square = new Square();

        // square.getColor();  - getcolor methodu olmamasına ragmen kullanabıldık cunku extends ettık,'is a' ilişkisi var

        square.setColor("red");
        square.setPositionX(10);
        square.setPositionY(10);
        square.setSide(5);

        square.printInfo();

        System.out.println("====================================");

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("blue");
        rectangle.setPositionX(20);
        rectangle.setPositionY(10);
        rectangle.setWidth(10);
        rectangle.setHeight(5);

        rectangle.printInfo();

        System.out.println("====================================");

        Circle circle = new Circle();
        circle.setColor("green");
        circle.setPositionX(30);
        circle.setPositionY(10);
        circle.setRadius(5);

        circle.printInfo();

        System.out.println("====================================");
        System.out.println("Area Info");
        circle.calculateArea();
        square.calculateArea();
        rectangle.calculateArea();

    }
}
