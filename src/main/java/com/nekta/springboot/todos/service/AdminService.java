package com.nekta.springboot.todos.service;

import com.nekta.springboot.todos.response.UserResponse;

import java.util.List;

public interface AdminService {
    List<UserResponse> getAllUsers();

    UserResponse promoteToAdmin(long userId);

    void deleteNonAdminUser(long userId);
}
