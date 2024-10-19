package Lesson3;

import java.util.Scanner;

public class SwitchAgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        switch (age / 10) {
            case 0: // Age 0-9
                if (age < 6) {
                    System.out.println("Toddler");
                } else {
                    System.out.println("Kid");
                }
                break;
            case 1: // Age 10-19
                if (age < 13) {
                    System.out.println("Kid");
                } else {
                    System.out.println("Teen");
                }
                break;
            case 2: // Age 20-29
            case 3: // Age 30-39
            case 4: // Age 40-49
            case 5: // Age 50-59
            case 6: // Age 60-64
                System.out.println("Adult");
                break;
            case 7: // Age 65-74
            case 8: // Age 75-84
            case 9: // Age 85-94
            case 10: // Age 95 and above
                System.out.println("Senior");
                break;
            default:
                if (age >= 100) {
                    System.out.println("Centenarian");
                } else {
                    System.out.println("Invalid age.");
                }
                break;
        }
    }
}
