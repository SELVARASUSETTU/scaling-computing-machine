package com.sample.demo.sample.repository;

import com.sample.demo.sample.model.Users;

public abstract class UserRepository {

    abstract Users addUser(Users user);
    abstract Users updatePassword();


}
