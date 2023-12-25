package inheritance;

public class Main {

    public static void main(String[] args) {

        Square square = new Square();

        // square.getColor();  - getcolor methodu olmamasına ragmen kullanabıldık cunku extends ettık,'is a' ilişkisi var

        square.setColor("red");
        square.setPositionX(10);
        square.setPositionY(10);
        square.setSide(5);

        System.out.println("color: " + square.getColor());
        System.out.println("pos x :" + square.getPositionX());
        System.out.println("pos y :" + square.getPositionY());
        System.out.println("side :" + square.getSide());
    }
}
