package Lesson9;

public class Bank {
    String name;
    double percent;

    public Bank(String name, double percent) {
        this.name = name;
        this.percent = percent;
    }

    void displayInfo(){
        System.out.println("Bank name is: " + name + ", rate: " + percent);
    }
}
