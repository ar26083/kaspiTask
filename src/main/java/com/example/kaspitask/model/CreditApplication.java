package com.example.kaspitask.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class CreditApplication {
    @Id
    private long id;

    private Date dateOfTheApplication;

    private long sum;

    private long time;

    private String status;


}
