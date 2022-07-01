package com.exercise.booklibraryapp.repository;

import com.exercise.booklibraryapp.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {

    List<Author> getAuthorByFirstName(String firstName);
    List<Author> getAuthorByLastName(String lastName);
    Author getAuthorByFirstNameAndLastName(String firstName, String lastName);
}
