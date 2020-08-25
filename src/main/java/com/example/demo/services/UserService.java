package com.example.demo.services;

import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService
{

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll()
    {
        Iterable it = userRepository.findAll();
        List users = new ArrayList<User>();
        it.forEach(e -> users.add(e));
        return users;
    }

    public Long count()
    {
        return userRepository.count();
    }

    public void deleteById( Long userId )
    {
        userRepository.deleteById(userId);
    }

    public void save( User user )
    {
        userRepository.save(user);
    }
}