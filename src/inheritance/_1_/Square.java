package inheritance._1_;

public class Square extends Shape{
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    void calculateArea() {
        System.out.println("Square Area: " + side * side);
    }

    void printInfo(){
        System.out.println("Square info");
        System.out.println("color: " + getColor());
        System.out.println("pos x :" + getPositionX());
        System.out.println("pos y :" + getPositionY());
        System.out.println("side :" + getSide());
    }
}
