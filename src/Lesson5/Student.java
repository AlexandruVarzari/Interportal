package Lesson5;

import java.util.stream.IntStream;

public class Student {
   String name;
   String lastName;
   int age;
   int[] pointAvrg;


    public static void main(String[] args) {

    Student student1 = new Student();
    student1.name = "Leon";
    student1.lastName = "Kennedy";
    student1.age = 18;
    student1.pointAvrg = new int[]{10, 9, 8, 7};

    Student student2 = new Student();
    student2.name = "Ada";
    student2.lastName = "Wong";
    student2.age = 22;
    student2.pointAvrg = new int[]{10, 9, 10, 10, 8};

    Student student3 = new Student();
    student3.name = "Jason";
    student3.lastName = "Voorhees";
    student3.age = 16;
    student3.pointAvrg = new int[]{7, 5, 4, 3};

    Student student4 = new Student();
    student4.name = "Michael";
    student4.lastName = "Myers";
    student4.age = 17;
    student4.pointAvrg = new int[]{3, 5, 2, 2, 2};

    Student[] students = {student1, student2, student3, student4};

    for (Student student : students) {
            System.out.println(student.name + "'s average mark is: " + average(student.pointAvrg));
        }
        findHighestAverage(students);
        findLowestAverage(students);
        budget(students);
        contract(students);
        expelled(students);
    }


     static double average(int[] arr){
        int sum = IntStream.of(arr).sum();
        return (double) sum/arr.length;
    }

    static void findHighestAverage(Student[] students) {
        Student topStudent = students[0];
        double highestAverage = average(topStudent.pointAvrg);

        for (Student student : students) {
            double avg = average(student.pointAvrg);
            if (avg > highestAverage) {
                highestAverage = avg;
                topStudent = student;
            }
        }
        System.out.println("The student with the highest average is: " + topStudent.name + " with an average of " + highestAverage);
    }

    static void findLowestAverage(Student[] students){
        Student lowestStudent = students[0];
        double lowestAverage = average(lowestStudent.pointAvrg);

        for(Student student : students){
            double avg = average(student.pointAvrg);
            if(avg < lowestAverage){
                lowestAverage = avg;
                lowestStudent = student;
            }
        }
        System.out.println("The student with the lowest average is: " + lowestStudent.name + " with an average of " + lowestAverage);
    }

    static void budget(Student[] students){
        for(Student student : students){
            double avg = average(student.pointAvrg);
            if(avg >= 8){
                System.out.println(student.name + "'s grade is higher than 8, budget");
            }
        }
    }

    static void contract(Student[] students){
        for(Student student : students){
            double avg = average(student.pointAvrg);
            if(avg < 8){
                System.out.println(student.name + "'s grade is lower than 8, contract");
            }
        }
    }

    static void expelled(Student[] students){
        for(Student student : students){
            double avg = average(student.pointAvrg);
            if(avg < 5){
                System.out.println(student.name + "'s grade is lower than 5, expelled");
            }
        }
    }

}
