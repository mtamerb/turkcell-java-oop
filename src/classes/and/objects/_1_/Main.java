package classes.and.objects._1_;

public class Main {
    public static void main(String[] args) {

        Circle aCircle; //referans yaratma
        aCircle = new Circle(10); //nesne yaratma ve değişkene atama

        double area = aCircle.getArea();// metot çağırma
        double circumference = aCircle.getCircumference();// metot çağırma

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
