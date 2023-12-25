package classes.and.objects._4_;

public class MyPen {

    String brand;
    String color;
    int price;
    boolean isRefillable;


    void printText(String text) {
        System.out.println(text);
    }

    void refill() {
        if (isRefillable) {
            System.out.println("refilled");
        } else {
            System.out.println("not refillable");
        }
    }
}
