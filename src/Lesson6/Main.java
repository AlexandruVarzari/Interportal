package Lesson6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Leon", 7.5));
        students.add(new Student("Ada", 8.5));
        students.add(new Student("Sherry", 10.0));
        students.add(new Student("Jason", 4.6));

        for(Student student : students){
          if(student.getAvg() >= 8){
              System.out.println(student.getName() + " Budget");
          }else if(student.getAvg() >= 5){
              System.out.println(student.getName() + " Contract");
          }else{
              System.out.println(student.getName() + " Expelled");
          }
          if(student.getName().equals("Jason")){
              student.setAvg(8.8);
          }
            System.out.println(student.getName() +" " +student.getAvg());
        }
    }
}
