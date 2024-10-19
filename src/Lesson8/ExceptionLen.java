package Lesson8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionLen {
    public static void main(String[] args) {
        Scanner nr1 = new Scanner(System.in);
        Scanner nr2 = new Scanner(System.in);

        try{
            System.out.println("Please enter first num:");
        int num1 = nr1.nextInt();
            System.out.println("Please enter second num:");
        int num2 = nr2.nextInt();
        int result = num1/num2;

            System.out.println("result is: " + result);
        }catch(InputMismatchException e){
            System.out.println("Please enter a valid value.");
        }
    }
}
