package com.example.kaspitask.services;

import com.example.kaspitask.dto.UserAnswerDTO;
import com.example.kaspitask.dto.UserLoginDTO;
import com.example.kaspitask.model.User;
import com.example.kaspitask.repos.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSevice {
    private final UserRepo userRepo;

    private final PasswordEncoder encoder;

    public boolean userLoginChecker(String login, String password){
        if (login == null || login.equals("") || password == null || password.equals(""))
            return false;
        User user = userRepo.findByLogin(login);
        if (encoder.matches(password, user.getPassword()) && user.getLogin().equals(login)) {
            return true;
        }
        return false;
    }
}
