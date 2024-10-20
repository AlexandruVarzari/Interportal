package Lesson9;

public class Main {
    public static void main(String[] args) {
        MAIBBank maibBank = new MAIBBank("MAIB", 4.5);
        maibBank.displayInfo();
        VictoriaBank victoriaBank = new VictoriaBank("Victoria", 2.4);
        victoriaBank.displayInfo();
    }
}
