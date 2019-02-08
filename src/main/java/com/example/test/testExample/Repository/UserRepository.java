package com.example.test.testExample.Repository;


import com.example.test.testExample.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends MongoRepository<User, Object> {


    public List<User> findUserByName(String id);
}
