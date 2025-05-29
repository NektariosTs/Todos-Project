package com.nekta.springboot.todos.service;

import com.nekta.springboot.todos.request.AuthenticationRequest;
import com.nekta.springboot.todos.request.RegisterRequest;
import com.nekta.springboot.todos.response.AuthenticationResponse;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;

    AuthenticationResponse login(AuthenticationRequest request);
}
