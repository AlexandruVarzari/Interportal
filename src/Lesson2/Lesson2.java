package Lesson2;

import Lesson1.Main;

public class Lesson2 {
    public static void main(String[] args) {
        int z = 23;
        z+= 2060;
        System.out.println(z);
        double nr = z;
        System.out.println(nr);
        Integer nr1 = (int) nr;
        System.out.println(nr1);

        String s = "7";
        int c = 7;
        int valS = Integer.parseInt(s);
        c+=valS;

        System.out.println(c);

        int age = 50;

        if(age <= 18){
            System.out.println("student");
        }else if(age > 18 && age <= 30){
            System.out.println("Adult");
        }else if(age > 30 && age <= 40){
            System.out.println("Senior");
        }else if(age > 40 && age <= 64){
            System.out.println("Retired");
        }
    }
}
