package com.example.kaspitask.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDTO {

    @NotNull(message = "Введите корректный логин")
    private String login;

    @NotNull(message = "Введите пароль")
    private String password;
}