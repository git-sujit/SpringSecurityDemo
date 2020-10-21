package com.demo.service;

import com.demo.domain.User;
import com.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private UserRepository userRepository;

    //Enable method level security in Configuration
    @Secured({"ROLE_ADMIN", "ROLE_SUPERUSER"})
    public List<User> getAllUserAccounts() {
        return userRepository.findAll();
    }
}
