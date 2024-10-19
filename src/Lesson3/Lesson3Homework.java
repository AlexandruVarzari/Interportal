package Lesson3;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Scanner;

public class Lesson3Homework {
    public static void main(String[] args) {
//        Scanner num = new Scanner(System.in);
//        System.out.println("Please provide a number:");
//        int result = num.nextInt();
//
//       if (result == 0){
//           System.out.println("number is zero");
//       }else if(result >= 1){
//           System.out.println("number is positive");
//       }else if(result <= -1){
//           System.out.println("number is negative");
//       }

        Scanner year = new Scanner(System.in);
        System.out.println("Please provide year of birth:");
        int birthYear = year.nextInt();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;

        if(age >= 6 && age <= 12) {
            System.out.println("Kid");
        } else if(age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if(age >= 20 && age <= 26) {
            System.out.println("Young Adult");
        } else if(age >= 27 && age <= 31) {
            System.out.println("Adult");
        } else if(age >= 32 && age <= 66) {
            System.out.println("Middle-aged Adult");
        } else if(age >= 67 && age <= 85) {
            System.out.println("Senior");
        } else {
            System.out.println("Not in any category");
        }
    }
}
