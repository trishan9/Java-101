package com.trishan.oop.programs.others;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of movies: ");
        int numOfMovies = sc.nextInt();
        sc.nextLine();

        Movie[] movies = new Movie[numOfMovies];

        for (int i = 0; i < numOfMovies; i++) {
            System.out.print("\nEnter the movie title: ");
            String movieTitle = sc.nextLine();

            System.out.print("Enter the director's name: ");
            String director = sc.nextLine();

            System.out.print("Enter the movie's rating: ");
            float rating = sc.nextFloat();
            sc.nextLine();

            movies[i] = new Movie(movieTitle, director, rating);
        }

        Movie movieWithHighestRating = findMovieWithHighestRating(movies);
        System.out.println("Movie with highest rating: \n" + movieWithHighestRating);
    }

    public static Movie findMovieWithHighestRating(Movie[] movies){
        Movie max = movies[0];
        for (int i = 1; i < movies.length; i++) {
            if(movies[i].getRating() > max.getRating()){
                max = movies[i];
            }
        }
        return max;
    }
}

class Movie {
    private String movieTitle;
    private String director;
    private float rating;

    Movie(String movieTitle, String director, float rating){
        this.movieTitle = movieTitle;
        this.director = director;
        this.rating = rating;
    }

    public void setMovieTitle(String movieTitle){
        this.movieTitle = movieTitle;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public void setRating(float rating){
        this.rating = rating;
    }

    public String getMovieTitle(){
        return this.movieTitle;
    }

    public String getDirector(){
        return this.director;
    }

    public float getRating(){
        return this.rating;
    }

    @Override
    public String toString() {
        return "Movie Title: " + this.getMovieTitle() + "\nMovie Director: " + this.getDirector() + "\nRating: " + this.getRating();
    }
}