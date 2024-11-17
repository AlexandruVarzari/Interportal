package Lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        // Adding students to the list
        students.add(new Student("Ada", "Wong", new ArrayList<>(Arrays.asList(9.5, 7.4, 10.0, 6.2))));
        students.add(new Student("Leon", "Kennedy", new ArrayList<>(Arrays.asList(7.2, 6.5, 10.0, 8.2))));
        students.add(new Student("Clair", "Redfield", new ArrayList<>(Arrays.asList(10.0, 8.8, 9.2, 5.3))));
        students.add(new Student("Chris", "Redfield", new ArrayList<>(Arrays.asList(6.5, 7.3, 8.2, 7.1))));
        students.add(new Student("Jill", "Valentine", new ArrayList<>(Arrays.asList(5.5, 6.8, 7.2, 6.9))));
        students.add(new Student("Albert", "Wesker", new ArrayList<>(Arrays.asList(4.0, 5.0, 4.5, 6.0))));

        // Filter students with an average >= 5
        ArrayList<Student> studentValid = new ArrayList<>();
        for (Student student : students) {
            if (student.average() >= 7.8) { // Use the average() method here
                studentValid.add(student);
            }
        }

        // Sort the valid students by their average grades
        Collections.sort(studentValid, (o1, o2) -> {
            return Double.compare(o2.average(), o1.average()); // Sort in descending order
        });
        // Print the first two students (or all if there are fewer)
        System.out.println("First two students:");
        int limit = Math.min(3, studentValid.size()); // Avoid IndexOutOfBoundsException
        for (int i = 0; i < limit; i++) {
            Student s = studentValid.get(i);
            System.out.println(s.getFirstName() + " " + s.getLastName() + " - Average: " + s.average());
        }
    }
}
