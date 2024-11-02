package Lesson11Homework.Problem4;

public class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name + ", age: " + age);
    }
}
