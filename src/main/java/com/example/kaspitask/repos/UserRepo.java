package com.example.kaspitask.repos;

import com.example.kaspitask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository <User, Long> {
    User findByLogin(String login);
}
