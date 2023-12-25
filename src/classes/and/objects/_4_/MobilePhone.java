package classes.and.objects._4_;

public class MobilePhone {

    MobilePhoneBrand brand;
    String model;
    int price;
    int memory;
    boolean isSmart;

    void call(String number) {
        System.out.println("calling " + number);
    }

    void sendSMS(String number, String text) {
        System.out.println("sending sms to " + number + " with text: " + text);
    }

}
