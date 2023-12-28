package inheritance._2_;

public class Main {

    public static void main(String[] args) {
        SportCar sportCar = new SportCar("Porsche", 300);

        System.out.println("sport car brand = " + sportCar.getBrand());
        System.out.println("sport car max speed = " + sportCar.getMaxSpeed());
        sportCar.setBrand("Porsche");
        int maxSpeed = sportCar.getMaxSpeed();
        System.out.println("max speed = " + maxSpeed);

        Porsche porsche = new Porsche("Porsche", 300, "911");

        System.out.println("porsche brand = " + porsche.getBrand());
        String brand = porsche.getBrand();
        porsche.setProducer("Porsche");
        String producer = porsche.getProducer();

        System.out.println("brand = " + brand);
        System.out.println("producer = " + producer);

    }
}
