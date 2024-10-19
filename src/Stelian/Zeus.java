package Stelian;

 import java.util.Random;
import java.util.Scanner;

        public class Zeus {
            public static void main(String[] args) {

                Random random = new Random();
                int numberToGuess = random.nextInt(100) + 1;
                int numberOfTries = 0;
                int guess = 0;
                boolean hasGuessed = false;


                Scanner scanner = new Scanner(System.in);

                System.out.println("Bine ai venit la jocul de ghicit numărul!");
                System.out.println("Am ales un număr între 1 și 100. Poți să-l ghicești?");


                while (!hasGuessed) {
                    System.out.print("Introduceți numărul: ");
                    guess = scanner.nextInt();
                    numberOfTries++;


                    if (guess < numberToGuess) {
                        System.out.println("Prea mic! Încearcă din nou.");
                    } else if (guess > numberToGuess) {
                        System.out.println("Prea mare! Încearcă din nou.");
                    } else {
                        hasGuessed = true;
                        System.out.println("Felicitări! Ai ghicit numărul " + numberToGuess + " în " + numberOfTries + " încercări.");
                    }
                }


                scanner.close();
            }
        }


