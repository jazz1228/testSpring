package com.example.test.testExample.Model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Getter
@Builder
public class User {

    @Id
    Object id;

    String name;
    String identification;

}
