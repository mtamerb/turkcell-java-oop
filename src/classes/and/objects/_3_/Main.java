package classes.and.objects._3_;

public class Main {
    public static void main(String[] args) {

        Gamer gamer = new Gamer();

        Gamer.printHealth(gamer);

        for (int i = 0; i < 30; i++) {
            gamer.damage();
            Gamer.printHealth(gamer);
        }

        gamer.reborn();

        System.out.println("after reborn health : " + gamer.health);
    }


}
