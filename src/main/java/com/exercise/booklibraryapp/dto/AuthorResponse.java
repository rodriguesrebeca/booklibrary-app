package com.exercise.booklibraryapp.dto;

import com.exercise.booklibraryapp.model.Author;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthorResponse {

    private String id;
    private String firstName;
    private String lastName;
    private String country;

    public AuthorResponse(Author author) {
        id = author.getId();
        firstName = author.getFirstName();
        lastName = author.getLastName();
        country = author.getCountry();
    }
}
