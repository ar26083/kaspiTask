package com.example.kaspitask.controllers;

import com.example.kaspitask.dto.UserAnswerDTO;
import com.example.kaspitask.dto.UserLoginDTO;
import com.example.kaspitask.services.UserSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final PasswordEncoder encoder;

    private final UserSevice userSevice;

    @GetMapping("/login")
    public String login(@RequestBody UserLoginDTO userDTO) {
        return "static/" + (userSevice.userLoginChecker(userDTO) ? "iinPage.html" : "index.html");
    }

    
}
