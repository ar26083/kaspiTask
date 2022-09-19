package com.example.kaspitask.controllers;

import com.example.kaspitask.dto.CreditApplicationAnswerDTO;
import com.example.kaspitask.dto.CreditApplicationDTO;
import com.example.kaspitask.services.CreditAppService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/applcations")
public class CreditApplicationController {

    CreditAppService iinService;

    @RequestMapping("/find")
    public ResponseEntity<CreditApplicationAnswerDTO> find (@RequestBody CreditApplicationDTO creditDTO){
        CreditApplicationAnswerDTO creditAnswerDTO = new CreditApplicationAnswerDTO();
        creditAnswerDTO.setCreditApplicationList(iinService.findByIin(creditDTO.getIin()));
        return ResponseEntity.ok(creditAnswerDTO);
    }


}
