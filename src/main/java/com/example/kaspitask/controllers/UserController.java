package com.example.kaspitask.controllers;

import com.example.kaspitask.dto.UserAnswerDTO;
import com.example.kaspitask.dto.UserLoginDTO;
import com.example.kaspitask.services.UserSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final PasswordEncoder encoder;

    private final UserSevice userSevice;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserLoginDTO userDTO) {
        UserAnswerDTO userAnswerDTO = userSevice.userLoginChecker(userDTO);
        return ResponseEntity.ok(userAnswerDTO);
    }

    
}
