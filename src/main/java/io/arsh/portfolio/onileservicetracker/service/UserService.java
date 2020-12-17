package io.arsh.portfolio.onileservicetracker.service;

import io.arsh.portfolio.onileservicetracker.domain.User;
import io.arsh.portfolio.onileservicetracker.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }
    public List<User> getUser(){
        return repo.findAll();
    }
}
