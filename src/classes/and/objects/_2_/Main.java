package classes.and.objects._2_;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.speed = 23;
        bicycle.cadence = 18;

        Bicycle.printInfo(bicycle);
    }

}
