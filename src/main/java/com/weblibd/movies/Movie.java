package com.weblibd.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

// Define this class as a MongoDB document and specify the collection name
@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    // Specify that this field is the ID of the document
    @Id
    private ObjectId id;
    
    // Unique identifier for the movie from IMDB
    private String imdbId;
    
    // Title of the movie
    private String title;
    
    // Release date of the movie
    private String releaseDate;
    
    // Link to the movie's trailer
    private String trailerLink;
    
    // Link to the movie's poster
    private String poster;
    
    // List of genres associated with the movie
    private List<String> genres;
    
    // List of backdrop images for the movie
    private List<String> backdrops;
    
    // List of references to reviews associated with the movie
    @DocumentReference
    private List<Review> reviewIds;
}
