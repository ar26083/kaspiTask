package com.example.kaspitask.controllers;

import com.example.kaspitask.dto.UserLoginDTO;
import com.example.kaspitask.services.UserSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserSevice userSevice;

    @GetMapping( "/login")
    @ResponseBody
    public String login(@RequestBody UserLoginDTO userLoginDTO) {
        //return new ModelAndView((userSevice.userLoginChecker(login, password) ? "templates/iinPage.html" : "templates/invalidators.html"));
        return (userSevice.userLoginChecker(userLoginDTO.getLogin(), userLoginDTO.getPassword()) ? "iinPage" : "invalidators");
    }

    
}
