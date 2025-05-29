package com.nekta.springboot.todos.service;

import com.nekta.springboot.todos.request.RegisterRequest;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;
}
