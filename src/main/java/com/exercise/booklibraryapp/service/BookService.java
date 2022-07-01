package com.exercise.booklibraryapp.service;

import com.exercise.booklibraryapp.dto.BookRequest;
import com.exercise.booklibraryapp.dto.BookResponse;
import com.exercise.booklibraryapp.model.Book;

import java.util.List;

public interface BookService {


    BookResponse createBook(BookRequest bookRequest, String firstName, String lastName);

    List<Book> getAll();

    Book getById(String id);

    void delete(String id);
}
