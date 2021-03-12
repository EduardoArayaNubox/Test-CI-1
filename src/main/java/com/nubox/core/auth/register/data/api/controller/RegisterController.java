package com.nubox.core.auth.register.data.api.controller;

import com.nubox.core.auth.register.data.model.request.UserRequest;
import com.nubox.core.auth.register.data.model.response.RegisterResponse;
import com.nubox.core.auth.register.data.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/auth")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RegisterResponse> create(@Valid @RequestBody UserRequest userRequest) {

        return ResponseEntity.ok(registerService.create(userRequest));

    }
}
