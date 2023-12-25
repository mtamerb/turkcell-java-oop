package access.modifiers;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        /*student.name = "John";
        student.lastName = "Doe";
        student.id = 1;*/
        student.printStudentInfo();
        student.setAge(23);
        System.out.println("age: " + student.getAge());
    }
}
