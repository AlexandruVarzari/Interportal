package Lesson8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a even number:");
        try{
            int value = sc.nextInt();
            System.out.println("value that you inserted is: " + value);
        }catch(InputMismatchException e){
            System.out.println("add a valid number");
        }
    }
}
