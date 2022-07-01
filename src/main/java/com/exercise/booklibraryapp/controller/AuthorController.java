package com.exercise.booklibraryapp.controller;

import com.exercise.booklibraryapp.dto.AuthorRequest;
import com.exercise.booklibraryapp.dto.AuthorResponse;
import com.exercise.booklibraryapp.model.Author;
import com.exercise.booklibraryapp.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library/author")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping
    public AuthorResponse create(@RequestBody AuthorRequest authorRequest){
        return authorService.create(authorRequest);
    }

    @GetMapping("/first-name/")
    public List<Author> getAuthorByFirstName(@RequestParam String firstName){
        return authorService.getByFirstName(firstName);
    }

    @GetMapping("/last-name/")
    public List<Author> getAuthorByLastName(@RequestParam String lastName){
        return authorService.getByLastName(lastName);
    }

    @GetMapping
    public List<Author> getAll(){
        return authorService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        authorService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Author getById(@PathVariable String id){
        return authorService.getById(id);
    }
}
