package com.exercise.booklibraryapp.dto;

import com.exercise.booklibraryapp.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private String id;
    private String firstName;
    private String lastName;
    private String document;
    private String email;
    private String phoneNumber;

    public UserResponse(User user) {
        id = user.getId();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        document = user.getDocument();
        email = user.getEmail();
        phoneNumber = user.getPhoneNumber();
    }
}
