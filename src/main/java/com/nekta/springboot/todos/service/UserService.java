package com.nekta.springboot.todos.service;

import com.nekta.springboot.todos.request.PasswordUpdateRequest;
import com.nekta.springboot.todos.response.UserResponse;

public interface UserService {

    UserResponse getUserInfo();

    void deleteUser();

    void updatePassword(PasswordUpdateRequest passwordUpdateRequest);
}
