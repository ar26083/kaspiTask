package com.example.kaspitask.repos;

import com.example.kaspitask.model.CreditApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditAppRepo extends JpaRepository <CreditApplication, Integer> {
    List<CreditApplication> findAllByIin(long iin);
}
