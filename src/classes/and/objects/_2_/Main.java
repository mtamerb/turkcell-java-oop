package classes.and.objects._2_;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.speed = 23;
        bicycle.cadence = 18;

        printInfo(bicycle);
    }

    static void printInfo(Bicycle bicycle) {
        System.out.println("----------Bicycle Info----------");
        System.out.println("Cadence: " + bicycle.cadence);
        System.out.println("Speed: " + bicycle.speed);
    }
}
