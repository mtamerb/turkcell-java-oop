package classes.and.objects._2_;

public class Bicycle {

    int cadence;
    int speed;
    static int numberOfTheBicycles = 0;

    static void printInfo(Bicycle bicycle) {
        System.out.println("----------Bicycle Info----------");
        System.out.println("Cadence: " + bicycle.cadence);
        System.out.println("Speed: " + bicycle.speed);
        System.out.println("Number of the bicycles: " + Bicycle.numberOfTheBicycles);
    }

}
