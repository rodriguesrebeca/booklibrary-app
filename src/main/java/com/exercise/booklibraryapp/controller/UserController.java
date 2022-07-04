package com.exercise.booklibraryapp.controller;

import com.exercise.booklibraryapp.dto.UserRequest;
import com.exercise.booklibraryapp.dto.UserResponse;
import com.exercise.booklibraryapp.model.User;
import com.exercise.booklibraryapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserResponse create(@RequestBody UserRequest userRequest){
        return userService.create(userRequest);
    }

    @GetMapping
    public List<User> getAll(){
        return  userService.getAll();
    }

    @PutMapping("/{id}")
    public User update(@PathVariable String id, @RequestBody UserRequest userRequest){
        return userService.update(userRequest, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        userService.delete(id);
    }
}
