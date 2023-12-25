package access.modifiers;

public class Student {

    private int id = 10;
    private String name;

    private String lastName;

    private int age;

    // encapsulation -> sınıf değişkenlerini private yapar,  metot üzerinden ulaşmasını talep ederiz
    void setAge(int age) {
        if (age < 0) {
            System.out.println("age cannot be negative");
            return;
        }
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void printStudentInfo() {
        System.out.println("Student: " + name + " " + lastName + " " + id);
    }
}
