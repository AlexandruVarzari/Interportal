package Lesson3;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide your number:");
        int num = sc.nextInt();
        boolean  isPrime = true;
        int i = 2;
        if(num == 0 || num == 1){
            isPrime = false;
        }else{
            do{
              if(num % i == 0){
                  isPrime = false;
                  break;
              }
              i++;
            } while(i <= num / 2);
        }
        if(isPrime){
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime number");
        }
    }
}
