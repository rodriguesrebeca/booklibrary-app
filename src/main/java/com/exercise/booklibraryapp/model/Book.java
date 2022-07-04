package com.exercise.booklibraryapp.model;

import com.exercise.booklibraryapp.dto.BookRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

import java.util.UUID;

@Table(name = "book")
@Entity
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Book {

    @Id
    private String id = UUID.randomUUID().toString();

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    @JsonIgnore
    private Author author;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "release_year")
    private String releaseYear;

    @Column(name = "pages")
    private Integer pages;

    @Column(name = "borrow")
    private Boolean borrow;

    @Column(name = "gender")
    private String gender;

    @Column(name = "register_date")
    @CreatedDate
    private LocalDateTime registerDate;



    public Book(BookRequest bookRequest, Author author) {
        title = bookRequest.getTitle();
        this.author = author;
        publisher = bookRequest.getPublisher();
        releaseYear = bookRequest.getReleaseYear();
        pages = bookRequest.getPages();
        gender= bookRequest.getGender();
    }

}
