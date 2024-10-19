package Lesson7Homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OneLine {
    public static void main(String[] args) throws IOException {
        String file = "text.txt";
        File folder = new File(file);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your file name:");
        String name = sc.nextLine();

        if(folder.createNewFile()){
            System.out.println("File created");
        }else{
            System.out.println("Already created");
        }
        try(PrintWriter writer = new PrintWriter(new FileWriter(file))){
            writer.println(name);
        }
    }
}
