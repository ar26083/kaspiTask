package com.example.kaspitask.services;

import com.example.kaspitask.model.CreditApplication;
import com.example.kaspitask.repos.CreditAppRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreditAppService {
    private final CreditAppRepo creditAppRepo;

    public List<CreditApplication> findByIin (long iin){
        return creditAppRepo.findAllByIin(iin);
    }
}
