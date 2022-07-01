package com.exercise.booklibraryapp.service;

import com.exercise.booklibraryapp.dto.AuthorRequest;
import com.exercise.booklibraryapp.dto.AuthorResponse;
import com.exercise.booklibraryapp.model.Author;

import java.util.List;

public interface AuthorService {
    AuthorResponse create(AuthorRequest authorRequest);

    List<Author> getByFirstName(String firstName);

    List<Author> getByLastName(String lastName);

    List<Author> getAll();

    void deleteById(String id);

    Author getById(String id);

    Author getByAllName(String firstName, String lastName);
}
