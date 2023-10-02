package com.weblibd.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// Define this interface as a Spring Data MongoDB repository
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
