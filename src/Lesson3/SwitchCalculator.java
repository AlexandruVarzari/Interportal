package Lesson3;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter number 2: ");
        int num2 = sc2.nextInt();
        Scanner operation = new Scanner(System.in);
        System.out.println("Provide the operation:");
        char op = operation.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Please provide a valid operation");
        }

    }
}
