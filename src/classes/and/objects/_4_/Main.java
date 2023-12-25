package classes.and.objects._4_;

public class Main {

    public static void main(String[] args) {
        MyPen pen = new MyPen();

        pen.brand = "Parker";
        pen.color = "blue";
        pen.price = 100;
        pen.isRefillable = true;

        pen.printText("My - Pen");
        pen.refill();

        System.out.println("=====================================");

        MobilePhone phone = new MobilePhone();
        phone.brand = MobilePhoneBrand.SAMSUNG;
        phone.model = "Galaxy S10";
        phone.price = 1000;
        phone.memory = 128;
        phone.isSmart = true;

        phone.call("123456789");
        phone.sendSMS("123456789", "Hello");
    }
}
