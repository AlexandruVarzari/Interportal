package Lesson14;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> grades;
    double average;
    String status;

    public Student(String firstName, String lastName, ArrayList<Double> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;

    }

    public double average(){
        double sum =0;
        for(double grade:grades){
            sum = sum + grade;
        }
        return sum/grades.size();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override    public String toString() {
        return "Student{" + "name='" + firstName + '\'' +
                ", grades=" + grades + ", average=" + average +
                ", status='" + status + '\'' + '}';
    }
}
