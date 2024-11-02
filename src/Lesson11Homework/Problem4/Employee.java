package Lesson11Homework.Problem4;

public class Employee extends Person{
    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name + ", age: " + age);
    }
}
