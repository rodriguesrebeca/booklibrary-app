package com.exercise.booklibraryapp.controller;

import com.exercise.booklibraryapp.dto.BookRequest;
import com.exercise.booklibraryapp.dto.BookResponse;
import com.exercise.booklibraryapp.model.Book;
import com.exercise.booklibraryapp.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public BookResponse create(@RequestParam String firstName, @RequestParam String lastName, @RequestBody BookRequest bookRequest){
        return bookService.createBook(bookRequest, firstName, lastName);
    }

    @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable String id){
        return bookService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        bookService.delete(id);
    }
}
