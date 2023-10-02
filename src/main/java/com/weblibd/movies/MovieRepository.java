package com.weblibd.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Define this interface as a Spring Data MongoDB repository
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // Custom query method to find a movie by its IMDB ID
    Optional<Movie> findMovieByImdbId(String imdbId);
}
