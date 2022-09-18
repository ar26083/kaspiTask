package com.example.kaspitask;

import com.example.kaspitask.repos.UserRepo;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NoArgsConstructor
public class KaspiTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaspiTaskApplication.class, args);}

}
