package com.example.kaspitask.dto;

import com.example.kaspitask.model.CreditApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class CreditApplicationAnswerDTO {

        private long iin;

        private List<CreditApplication> creditApplicationList;


}
