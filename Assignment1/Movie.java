package com.tw.assignment1;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    String getRating(Movie movie) {
        return movie.rating;
    }
    String getTitle(Movie movie) {
        return movie.title;
    }

    static Movie[] getPg(Movie[] movies) {
        Movie[] moviesWithPgRating = new Movie[movies.length];
        int size = 0;
        for (Movie movie : movies) {
            if (movie.getRating(movie).equals("PG")) {
                moviesWithPgRating[size++] = movie;
            }
        }
        return moviesWithPgRating;
    }
}

class MovieCall {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movie2 = new Movie("Photograph", "ABC");
        Movie movie3 = new Movie("XYZ", "Animation Studio");

        Movie[] movieArray = {movie1, movie2, movie3};
        Movie[] MoviesWithPgRating = Movie.getPg(movieArray);

        System.out.println("Movies having PG ratings are: ");
        for (Movie movie : MoviesWithPgRating) {
            if(movie==null){
                break;
            }
            System.out.println(movie.getTitle(movie));
        }

    }
}
