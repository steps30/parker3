package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.domain.Login;



@Repository
public interface LoginRepo extends JpaRepository<Login, String> {
   Login findByUsernameAndPassword(String username, String password);
}
