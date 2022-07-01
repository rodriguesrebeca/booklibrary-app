package com.exercise.booklibraryapp.dto;

import com.exercise.booklibraryapp.model.Author;
import lombok.Data;

@Data
public class BookRequest {


    private String title;
    private Author author;

    private String publisher;
    private String releaseYear;

    private Integer pages;
    private String gender;


}
