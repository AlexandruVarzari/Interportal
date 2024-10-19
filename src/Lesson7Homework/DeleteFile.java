package Lesson7Homework;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String filePath = "src/text.txt";
        File file = new File(filePath);
        file.delete();
    }
}
