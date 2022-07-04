package com.exercise.booklibraryapp.service.impl;

import com.exercise.booklibraryapp.dto.UserRequest;
import com.exercise.booklibraryapp.dto.UserResponse;
import com.exercise.booklibraryapp.model.User;
import com.exercise.booklibraryapp.repository.UserRepository;
import com.exercise.booklibraryapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse create(UserRequest userRequest){
        User user = new User(userRequest);
        userRepository.save(user);
        return new UserResponse(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(UserRequest userRequest, String id){
        var user = userRepository.findById(id).orElseThrow();
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        user.setDocument(userRequest.getDocument());
        user.setEmail(userRequest.getEmail());

        return userRepository.save(user);
    }

    @Override
    public void delete(String id){
        var user = userRepository.findById(id).orElseThrow();
        userRepository.delete(user);
    }
}
