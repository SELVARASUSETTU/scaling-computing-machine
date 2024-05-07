package com.sample.demo.sample.repository;

import com.sample.demo.sample.model.Users;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class UserJpaRepository<users> implements JpaRepository<users, Id> {

    public abstract boolean existsByEmailId(String email);
    public abstract Users findByEmailId(String emailId);
    public abstract Users findByResetToken(String token);


}
