package com.exercise.booklibraryapp.service.impl;

import com.exercise.booklibraryapp.dto.BookRequest;
import com.exercise.booklibraryapp.dto.BookResponse;
import com.exercise.booklibraryapp.model.Author;
import com.exercise.booklibraryapp.model.Book;
import com.exercise.booklibraryapp.repository.BookRepository;
import com.exercise.booklibraryapp.service.AuthorService;
import com.exercise.booklibraryapp.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    private final AuthorService authorService;


    @Override
    public BookResponse createBook(BookRequest bookRequest, String firstName, String lastName){
        Author author = authorService.getByAllName(firstName, lastName);
        Book book =  new Book(bookRequest, author);
        return new BookResponse(bookRepository.save(book));

    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getById(String id){
        return bookRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(String id){
        Book book = bookRepository.findById(id).orElseThrow();
        bookRepository.delete(book);
    }

}
