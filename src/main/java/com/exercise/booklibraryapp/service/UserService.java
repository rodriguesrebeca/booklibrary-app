package com.exercise.booklibraryapp.service;

import com.exercise.booklibraryapp.dto.UserRequest;
import com.exercise.booklibraryapp.dto.UserResponse;
import com.exercise.booklibraryapp.model.User;

import java.util.List;

public interface UserService {
    UserResponse create(UserRequest userRequest);

    List<User> getAll();

    User update(UserRequest userRequest, String id);

    void delete(String id);
}
