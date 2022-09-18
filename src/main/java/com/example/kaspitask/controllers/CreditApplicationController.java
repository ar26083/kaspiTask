package com.example.kaspitask.controllers;

import com.example.kaspitask.dto.CreditApplicationAnswerDTO;
import com.example.kaspitask.dto.CreditApplicationDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/applcations")
public class CreditApplicationController {

    @RequestMapping("/find")
    public ResponseEntity<CreditApplicationAnswerDTO> find (@RequestBody CreditApplicationDTO creditDTO){
        CreditApplicationAnswerDTO creditAnswerDTO = null;
        return ResponseEntity.ok(creditAnswerDTO);
    }
}
