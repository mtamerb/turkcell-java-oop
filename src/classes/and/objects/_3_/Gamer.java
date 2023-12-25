package classes.and.objects._3_;

public class Gamer {

    int health = 100;

    static int numberOfTheGamer = 0;

    public Gamer() {
        numberOfTheGamer++;
    }

    void reborn() {
        health = 100;
    }

    void damage() {
        health--;
    }

    static void printHealth(Gamer gamer) {
        System.out.println("health: " + gamer.health);
    }
}
