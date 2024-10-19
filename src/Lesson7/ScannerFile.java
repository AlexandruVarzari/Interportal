package Lesson7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args) throws IOException {
        String file = "test.txt";
        File folder = new File(file);
        Scanner scanner = new Scanner(System.in);
        if(folder.createNewFile()){
            System.out.println("Folder created");
        }else{
            System.out.println("Folder exists");
        }

        try(PrintWriter writer = new PrintWriter(new FileWriter(file))){
           for(int i = 1; i <= 3; i++){
               System.out.println("insert text, the limit so far is: " + i + ", your text here:");
               String row = scanner.nextLine();
               writer.println(row);
           }
        }
    }
}
