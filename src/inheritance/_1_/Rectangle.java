package inheritance._1_;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    void calculateArea() {
        System.out.println("Rectangle Area: " + width * height);
    }

    void printInfo() {
        System.out.println("Rectangle info");
        System.out.println("color: " + getColor());
        System.out.println("pos x :" + getPositionX());
        System.out.println("pos y :" + getPositionY());
        System.out.println("width :" + getWidth());
        System.out.println("height :" + getHeight());
    }
}
