package inheritance._1_;

public class Shape {
    private String color;

    private int positionX;
    private int positionY;


    void calculateArea() {
        System.out.println("Area:  doesn't calculated");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
