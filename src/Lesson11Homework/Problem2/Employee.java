package Lesson11Homework.Problem2;

public class Employee implements Activity{
        String activity;

    public Employee(String activity) {
        this.activity = activity;
    }

    @Override
    public void participate() {
        System.out.println("Employee activity: " + activity);
    }
}
