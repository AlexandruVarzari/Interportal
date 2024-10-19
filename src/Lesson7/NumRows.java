package Lesson7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumRows {
    public static void main(String[] args) throws IOException {
        int nrLine = 0;
        String file = "src/test321.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            while((reader.readLine()) != null){
                nrLine++;
                System.out.println(nrLine);
            }
        }
    }
}
