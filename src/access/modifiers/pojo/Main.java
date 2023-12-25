package access.modifiers.pojo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.setName("John");
        worker.setLastName("Doe");
        worker.setSalary(1000);
        worker.setDateOfTheEntry(new Date());

        System.out.println("Worker: " + worker.getName()
                + " " + worker.getLastName()
                + " " + worker.getSalary()
                + " " + worker.getDateOfTheEntry());

    }
}
