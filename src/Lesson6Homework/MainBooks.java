package Lesson6Homework;

import java.util.ArrayList;

public class MainBooks {
    public static void main(String[] args) {
        ArrayList<Books> books = new ArrayList<>();
        books.add(new Books("Meditation", "Marcus Aurelius", 2000));
        books.add(new Books("Letter from a Stoic", "Seneca", 1999));
        books.add(new Books("Animal Farm", "G. Orwell", 1987));

        for(Books book : books){
            if(book.getYear() >= 2000){
                System.out.println("These are the books published after the 2000's: " + book.getTitle() + " " + book.getAuthor());
            }
        }
    }
}
