package access.modifiers.pojo;

import java.util.Date;

public class Worker {
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateOfTheEntry() {
        return dateOfTheEntry;
    }

    public void setDateOfTheEntry(Date dateOfTheEntry) {
        this.dateOfTheEntry = dateOfTheEntry;
    }

    private double salary;

    private Date dateOfTheEntry;
}
