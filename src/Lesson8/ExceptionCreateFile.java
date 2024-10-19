package Lesson8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionCreateFile {
    public static void main(String[] args) {
        String file = "src/test321.txt";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            System.out.println("File exists");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
