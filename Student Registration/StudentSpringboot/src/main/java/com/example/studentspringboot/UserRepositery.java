package com.example.studentspringboot;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositery extends MongoRepository<User,Long>{


}
