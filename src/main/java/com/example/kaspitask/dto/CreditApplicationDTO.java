package com.example.kaspitask.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreditApplicationDTO {
    @NotNull
    @Pattern(regexp = "\\d{12}",message = "Не верный ИИН")
    private long iin;
}
