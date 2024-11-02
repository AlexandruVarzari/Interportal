package Lesson11Homework.Problem2;

public class Student implements Activity {
    String activity;
    double gradesActivity;

    public Student(String activity, double gradesActivity) {
        this.activity = activity;
        this.gradesActivity = gradesActivity;
    }

    @Override
    public void participate() {
        System.out.println("Student activity: " + activity + ", grade: " + gradesActivity);
    }
}
