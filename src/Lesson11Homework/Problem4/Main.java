package Lesson11Homework.Problem4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personsList = new ArrayList<>();
        personsList.add(new Employee("Tommy", 45));
        personsList.add(new Student("Leon", 23));

        for(Person i:personsList){
            i.displayDetails();
        }
    }
}
