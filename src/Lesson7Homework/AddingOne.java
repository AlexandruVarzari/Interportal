package Lesson7Homework;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AddingOne {
    public static void main(String[] args) throws IOException {
        String file = "src/text.txt";

        try(PrintWriter writer = new PrintWriter(new FileWriter(file, true))){
            writer.println("the added text");
        }
    }
}
