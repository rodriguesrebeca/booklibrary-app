package com.exercise.booklibraryapp.model;

import com.exercise.booklibraryapp.dto.AuthorRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "author")
@NoArgsConstructor
public class Author {

    @Id
    private String id = UUID.randomUUID().toString();

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "country")
    private String country;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> book;

    public Author(AuthorRequest authorRequest) {
        firstName = authorRequest.getFirstName();
        lastName = authorRequest.getLastName();
        country = authorRequest.getCountry();
    }

}
