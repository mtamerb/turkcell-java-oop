package inheritance._2_;

public class Porsche extends SportCar {

    private String model;

    public Porsche(String brand, int maxSpeed, String model) {
        super(brand, maxSpeed);
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

}
