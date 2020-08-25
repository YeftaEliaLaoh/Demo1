package com.example.demo.services;

import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public boolean existsByPhone( String phone )
    {
        return userRepository.existsByPhone(phone);
    }

    public boolean existsByEmail( String email )
    {
        return userRepository.existsByEmail(email);
    }

    public Long count()
    {
        return userRepository.count();
    }

    public void save( User user )
    {
        userRepository.save(user);
    }
}