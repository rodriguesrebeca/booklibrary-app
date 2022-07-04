package com.exercise.booklibraryapp.dto;

import lombok.Data;

@Data
public class UserRequest {
    private String firstName;
    private String lastName;
    private String document;
    private String email;
    private String phoneNumber;
}
