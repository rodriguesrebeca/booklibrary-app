package com.exercise.booklibraryapp.dto;

import com.exercise.booklibraryapp.model.Author;
import com.exercise.booklibraryapp.model.Book;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class BookResponse {
    private String id;

    private String title;

    private AuthorResponse authorResponse;

    private String publisher;
    private String releaseYear;

    private Integer pages;

    private String gender;

    private LocalDateTime registerDate;

    public BookResponse(Book book) {
        id = book.getId();
        authorResponse = new AuthorResponse(book.getAuthor());
        title = book.getTitle();
        publisher = book.getPublisher();
        releaseYear = book.getReleaseYear();
        pages = book.getPages();
        gender = book.getGender();
        registerDate = book.getRegisterDate();
    }

}
