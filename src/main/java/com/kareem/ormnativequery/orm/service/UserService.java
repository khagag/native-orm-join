package com.kareem.ormnativequery.orm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kareem.ormnativequery.orm.entities.User;
import com.kareem.ormnativequery.orm.repo.UserRepo;

@Service
public class UserService {
    private final UserRepo UserRepo;

    @Autowired
    public UserService(UserRepo UserRepo) {
        this.UserRepo = UserRepo;
    }

    public User saveUser(User user) {
        return UserRepo.save(user);
    }
}
