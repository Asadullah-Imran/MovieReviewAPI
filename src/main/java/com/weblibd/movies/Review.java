package com.weblibd.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Define this class as a MongoDB document and specify the collection name
@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    // Specify that this field is the ID of the document
    @Id
    private ObjectId id;
    
    // The body or content of the review
    private String body;

    // Constructor for creating a review with the body content
    public Review(String body) {
        this.body = body;
    }
}
