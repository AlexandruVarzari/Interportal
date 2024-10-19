package Lesson3;


import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
//    Scanner numsOddFix = new Scanner(System.in);
//        System.out.println("Please enter a number:");
//        int nums = numsOddFix.nextInt();
//        if(nums % 2 == 0){
//            System.out.println(nums + " even num");
//        }else{
//            System.out.println(nums + " odd num");
//        }

        Scanner daysWeek = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int days = daysWeek.nextInt();
        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                default:
                    System.out.println("Invalid day");
        }
    }
}
