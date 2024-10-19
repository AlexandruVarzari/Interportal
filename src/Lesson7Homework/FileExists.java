package Lesson7Homework;

import java.io.File;
import java.io.IOException;


public class FileExists {
    public static void main(String[] args) throws IOException {
        String filePath = "src/text.txt";
        File file = new File(filePath);

            if(file.exists()){
                System.out.println("File was created.");
            }else{
                System.out.println("File exists already.");
            }
    }
}
