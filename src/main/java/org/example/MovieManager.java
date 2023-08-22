package org.example;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    private List<String> movies;
    private int limit;

    public MovieManager() {
        this.movies = new ArrayList<>();
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.movies = new ArrayList<>();
        this.limit = limit;
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public List<String> findAll() {
        return movies;
    }

    public List<String> findLast() {
        int start = Math.max(0, movies.size() - limit);
        int end = movies.size();
        List<String> lastMovies = new ArrayList<>();

        for (int i = end - 1; i >= start; i--) {
            lastMovies.add(movies.get(i));
        }

        return lastMovies;
    }
}