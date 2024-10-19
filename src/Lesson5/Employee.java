package Lesson5;

public class Employee {
    String name;
    int age;
    String gender;
    String position;
    double salary;

    public static void main(String[] args) {
        Employee Amy = new Employee();
        Amy.name = "Amy";
        Amy.age = 25;
        Amy.gender = "Female";
        Amy.position = "Manager";
        Amy.salary = 10000.3444;
        System.out.println(Amy.salary);

        Employee Bob = new Employee();
        Bob.name = "Bob";
        Bob.age = 25;
        Bob.gender = "Male";
        Bob.position = "Engineer";
        Bob.salary = 9670.321;
        System.out.println(Bob.salary);

    }
}
