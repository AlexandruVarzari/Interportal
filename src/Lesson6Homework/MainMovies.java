package Lesson6Homework;

import java.util.ArrayList;

public class MainMovies {
    public static void main(String[] args) {
        ArrayList<Movies> movies = new ArrayList<>();
        movies.add(new Movies("Memento", "Detective", 10));
        movies.add(new Movies("Gentlemen", "Criminal", 9.5));
        movies.add(new Movies("Conjuring", "Horror", 6.66));

        Movies topMovie = null;
        double maxRating = 0;
        for(Movies rating: movies){
            if(rating.getRating() > maxRating){
                maxRating = rating.getRating();
                topMovie = rating;
            }
        }
        if(topMovie!= null){
            System.out.println("Movie with the highest score is: " + topMovie.getTitle()
                    + " with the score of " + topMovie.getRating());
        }

        for(Movies movie : movies){
            if(movie.getRating() > 7){
                System.out.println("Here are the movies with the rating higher than 7: "
                        + movie.getTitle() + " with the rating of " + movie.getRating());
            }
        }
    }
}
