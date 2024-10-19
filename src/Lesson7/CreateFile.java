package Lesson7;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        String file = "example.txt";
        File folder = new File(file);
        if (folder.createNewFile()) {
            System.out.println("folder created");
        } else {
            System.out.println("folder exists");
        }
        try(PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println("hello");
            writer.println(5+6);
            writer.println("more info");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line=reader.readLine()) != null){
                System.out.println(line);
            }
        }
    }
}
