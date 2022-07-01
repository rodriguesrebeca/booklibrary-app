package com.exercise.booklibraryapp.service.impl;

import com.exercise.booklibraryapp.dto.AuthorRequest;
import com.exercise.booklibraryapp.dto.AuthorResponse;
import com.exercise.booklibraryapp.model.Author;
import com.exercise.booklibraryapp.repository.AuthorRepository;
import com.exercise.booklibraryapp.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorResponse create(AuthorRequest authorRequest){
        var author = new Author(authorRequest);
        authorRepository.save(author);
        return new AuthorResponse(author);
    }

    @Override
    public List<Author> getByFirstName(String firstName){
        return authorRepository.getAuthorByFirstName(firstName);
    }

    @Override
    public List<Author> getByLastName(String lastName){
        return authorRepository.getAuthorByLastName(lastName);
    }

    @Override
    public List<Author> getAll(){
        return authorRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        var author = authorRepository.findById(id).orElseThrow();
        authorRepository.delete(author);
    }

    @Override
    public Author getById(String id){
        return authorRepository.findById(id).orElseThrow();
    }

    @Override
    public Author getByAllName(String firstName, String lastName){
        return authorRepository.getAuthorByFirstNameAndLastName(firstName, lastName);
    }

}
