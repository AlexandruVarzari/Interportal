package Lesson6Homework;

import java.util.ArrayList;

public class MainStudents {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Tom", 4));
        students.add(new Students("Ada", 6));
        students.add(new Students("Leon", 10));

        Students topStudent = null;
        int maxSubjects = 0;

        for(Students student : students){
            if(student.getSubjects() > maxSubjects){
                maxSubjects = student.getSubjects();
                topStudent = student;
            }
        }
        if(topStudent != null){
            System.out.println("The student who studies the most courses is " +
                    topStudent.getName() + " with the number of " + topStudent.getSubjects() + " subjects.");
        }
    }
}
