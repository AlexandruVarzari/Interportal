package Lesson7Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingOneLine {
    public static void main(String[] args) throws IOException {
        String file = "src/text.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String firstLine = reader.readLine();
            if(firstLine != null){
                System.out.println(firstLine);
            }
        }
    }
}
