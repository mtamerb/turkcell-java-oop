package classes.and.objects._2_;

public class Bicycle {

    protected int cadence;
    protected int speed;

    static void printInfo(Bicycle bicycle) {
        System.out.println("----------Bicycle Info----------");
        System.out.println("Cadence: " + bicycle.cadence);
        System.out.println("Speed: " + bicycle.speed);
    }

}
