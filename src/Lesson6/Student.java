package Lesson6;

public class Student {
    String name;
    double avg;

    public Student(String name, double avg){
        this.name = name;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public double getAvg() {
        return avg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
