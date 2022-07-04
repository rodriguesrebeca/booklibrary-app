package com.exercise.booklibraryapp.model;

import com.exercise.booklibraryapp.dto.UserRequest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Table(name = "username")
@Data
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    private String id = UUID.randomUUID().toString();

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @CreatedDate
    @Column(name = "register_date")
    private LocalDateTime registerDate;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "document")
    private String document;

    @Column(name = "email")
    private String email;

    public User(UserRequest userRequest) {
        firstName = userRequest.getFirstName();
        lastName = userRequest.getLastName();
        document = userRequest.getDocument();
        email = userRequest.getEmail();
        phoneNumber = userRequest.getPhoneNumber();
    }
}
