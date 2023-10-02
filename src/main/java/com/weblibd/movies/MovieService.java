package com.weblibd.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Define this class as a Spring service
@Service
public class MovieService {
    // Inject the MovieRepository for data access
    @Autowired
    private MovieRepository movieRepository;

    // Method to retrieve a list of all movies
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    // Method to retrieve a single movie by its IMDB ID
    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
