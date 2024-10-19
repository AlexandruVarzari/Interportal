package Lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String hello = "Hello";
        String hey = "Hey";
        int number1 = 5;
        int number2 = 23;
        int sumNumber = number1 + number2;
        double pointSmth = 2.3;
        char symbol = 'x';
        boolean smth = true;
        String sum = "Sum of number: ";
        System.out.println(hello);
        System.out.println(hey);
        System.out.println(sum + sumNumber);
        System.out.println("23+32");
        System.out.println(10*10*13 + " System");
        System.out.println(pointSmth);
        System.out.println(symbol);
        System.out.println(smth);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}