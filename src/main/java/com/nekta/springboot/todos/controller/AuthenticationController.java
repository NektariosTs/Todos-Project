package com.nekta.springboot.todos.controller;


import com.nekta.springboot.todos.request.AuthenticationRequest;
import com.nekta.springboot.todos.request.RegisterRequest;
import com.nekta.springboot.todos.response.AuthenticationResponse;
import com.nekta.springboot.todos.service.AuthenticationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@Tag(name = "Authentication REST API Endpoints", description = "Operations related to register & login")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @Operation(summary = "Register a user", description = "Create a new user in datavase")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/register")
    public void register(@Valid @RequestBody RegisterRequest registerRequest) throws Exception {
        authenticationService.register(registerRequest);
    }


    @Operation(summary = "Login a user", description = "submit email & password to authenticate user")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/login")
    public AuthenticationResponse login(@Valid @RequestBody AuthenticationRequest authRequest) {
        return authenticationService.login(authRequest);
    }

}












