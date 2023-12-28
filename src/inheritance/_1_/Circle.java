package inheritance._1_;

public class Circle extends Shape {

    private int radius;


    void calculateArea() {
        System.out.println("Circle Area: " + Math.PI * radius * radius);
    }

    void printInfo() {
        System.out.println("Circle info");
        System.out.println("color: " + getColor());
        System.out.println("pos x :" + getPositionX());
        System.out.println("pos y :" + getPositionY());
        System.out.println("radius :" + getRadius());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
