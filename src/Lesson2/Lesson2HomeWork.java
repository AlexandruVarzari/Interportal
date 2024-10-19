package Lesson2;

import java.util.Scanner;

public class Lesson2HomeWork {
    public static void main(String[] args) {
        Scanner scannerAge = new Scanner(System.in);
        System.out.println("What's your age?");
       int age = scannerAge.nextInt();

       if(age < 18) {
           System.out.println("Elev");
       }else if(age == 18) {
           System.out.println("Student");
       }else{
           System.out.println("Angajat");
       }

//       int [] name = new int[] {23,34,60};
//        System.out.println(name[1]);
    }
}
